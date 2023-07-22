package org.openapijsonschematools.codegen.clicommands.common;

import io.airlift.airline.Option;
import io.airlift.airline.OptionType;

public class GlobalOptions {
    @Option(type = OptionType.GLOBAL, name = "--version", description = "Display full version output", hidden = true)
    public boolean version;

    @Option(type = OptionType.GLOBAL, name = "--help", description = "Display help about the tool", hidden = true)
    public boolean help;
}
