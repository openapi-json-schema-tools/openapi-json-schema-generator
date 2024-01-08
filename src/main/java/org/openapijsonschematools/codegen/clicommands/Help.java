package org.openapijsonschematools.codegen.clicommands;

import io.airlift.airline.Command;

import javax.inject.Inject;

@Command(name = "help", description = "Display help information about openapi-generator")
public class Help extends AbstractCommand {

    @Inject
    public io.airlift.airline.Help help;

    @Override
    public void execute() {
        help.call();
    }
}
