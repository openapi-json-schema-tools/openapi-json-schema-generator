package org.openapijsonschematools.codegen.clicommands;

import io.airlift.airline.Cli;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AuthorTemplateTest {
    Path outputDirectory;

    @BeforeTest
    public void setUp(ITestContext ctx) throws IOException {
        outputDirectory = Files.createTempDirectory("AuthorTemplateTest");
        outputDirectory.toFile().deleteOnExit();
    }

    @Test
    public void smokeTestAuthorTemplateCommand(){
        Cli.CliBuilder<Runnable> builder = createBuilder();
        String[] arguments = new String[]{
                "author",
                "template",
                "-g",
                "java",
                "--output",
                outputDirectory.toAbsolutePath().toString()
        };
        builder.build().parse(arguments).run();

        // spot check root files
        Assert.assertTrue(Files.exists(outputDirectory.resolve("README.hbs")));
        Assert.assertTrue(Files.exists(outputDirectory.resolve("pom.hbs")));

    }

    private Cli.CliBuilder<Runnable> createBuilder(){
        Cli.CliBuilder<Runnable> builder = new Cli.CliBuilder<>("openapi-generatorRunner-cli");

        builder.withGroup("author")
                .withDescription("Utilities for authoring generators or customizing templates.")
                .withDefaultCommand(Help.class)
                .withCommands(AuthorTemplate.class);

        return builder;
    }
}
