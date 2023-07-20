package org.openapijsonschematools.codegen.cmd;

import com.google.common.base.Objects;

import io.airlift.airline.Command;
import io.airlift.airline.Option;

import org.apache.commons.lang3.StringUtils;
import org.openapijsonschematools.codegen.generators.Generator;
import org.openapijsonschematools.codegen.generators.generatorloader.GeneratorLoader;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata;
import org.openapijsonschematools.codegen.generators.generatormetadata.Stability;

import java.util.*;
import java.util.stream.Collectors;

// NOTE: List can later have subcommands such as list languages, list types, list frameworks, etc.
@SuppressWarnings({"java:S106"})
@Command(name = "list", description = "Lists the available generators")
public class ListGenerators extends OpenApiGeneratorCommand {

    @Option(name = {"-s", "--short" }, description = "shortened output (suitable for scripting)")
    private Boolean shortened = false;

    @Option(name = {"-d", "--docsite" }, description = "format for docusaurus site output", hidden = true)
    private Boolean docusaurus = false;

    @Option(name = {"--github-nested-index" }, description = "format for github index at docs/generators/README.md", hidden = true)
    private Boolean  githubNestedIndex = false;

    @Option(name = {"-i", "--include" },
            description = "comma-separated list of stability indexes to include (value: all,beta,stable,experimental,deprecated). Excludes deprecated by default.",
            allowedValues = { "all", "beta", "stable", "experimental", "deprecated" })
    private String include = "stable,beta,experimental";

    @Override
    public void execute() {
        List<Generator> generators = new ArrayList<>();
        List<Stability> stabilities = Arrays.asList(Stability.values());

        if (!StringUtils.isEmpty(include)) {
            List<String> includes = Arrays.asList(include.split(","));
            if (includes.size() != 0 && !includes.contains("all")) {
                stabilities = includes.stream()
                        .map(Stability::forDescription)
                        .collect(Collectors.toList());
            }
        }

        for (Generator generator : GeneratorLoader.getAll()) {
            GeneratorMetadata meta = generator.getGeneratorMetadata();
            if (meta != null && stabilities.contains(meta.getStability())) {
                generators.add(generator);
            }
        }

        StringBuilder sb = new StringBuilder();

        if (shortened) {
            for (int i = 0; i < generators.size(); i++) {
                Generator generator = generators.get(i);
                if (i != 0) {
                    sb.append(",");
                }
                sb.append(generator.getName());
            }
        } else {
            GeneratorType[] types = GeneratorType.values();

            sb.append("The following generators are available:");

            sb.append(System.lineSeparator());
            sb.append(System.lineSeparator());

            for (GeneratorType type : types) {
                appendForType(sb, type, type.name(), generators);
            }
            appendForType(sb, null, "UNSPECIFIED", generators);
        }

        System.out.printf(Locale.ROOT, "%s%n", sb.toString());
    }

    private void appendForType(StringBuilder sb, GeneratorType type, String typeName, List<Generator> generators) {
        List<Generator> list = generators.stream()
                .filter(g -> Objects.equal(type, g.getTag()))
                .sorted(Comparator.comparing(Generator::getName))
                .collect(Collectors.toList());

        if(!list.isEmpty()) {
            if (docusaurus || githubNestedIndex) {
                sb.append("## ").append(typeName).append(" generators");
            } else {
                sb.append(typeName).append(" generators:");
            }
            sb.append(System.lineSeparator());

            list.forEach(generator -> {
                GeneratorMetadata meta = generator.getGeneratorMetadata();
                if (docusaurus || githubNestedIndex) {
                    sb.append("* ");
                    String idPrefix = docusaurus ? "generators/" : "";
                    String id = idPrefix + generator.getName() + ".md";
                    sb.append("[").append(generator.getName());

                    if (meta != null && meta.getStability() != null && meta.getStability() != Stability.STABLE) {
                        sb.append(" (").append(meta.getStability().value()).append(")");
                    }

                    sb.append("](").append(id).append(")");

                    // trailing space is important for markdown list formatting
                    sb.append("  ");
                } else {
                    sb.append("    - ");
                    sb.append(generator.getName());

                    if (meta != null && meta.getStability() != null && meta.getStability() != Stability.STABLE) {
                        sb.append(" (").append(meta.getStability().value()).append(")");
                    }
                }
                sb.append(System.lineSeparator());
            });

            sb.append(System.lineSeparator());
            sb.append(System.lineSeparator());
        }
    }
}
