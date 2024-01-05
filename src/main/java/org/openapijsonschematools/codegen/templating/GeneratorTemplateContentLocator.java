package org.openapijsonschematools.codegen.templating;

import org.openapijsonschematools.codegen.generators.Generator;

import java.io.File;

/**
 * Locates templates according to {@link Generator} settings.
 */
public class GeneratorTemplateContentLocator implements TemplatePathLocator {
    private final Generator generator;

    /**
     * Constructs a new instance of {@link GeneratorTemplateContentLocator} for the provided {@link Generator}
     *
     * @param generator A generator's configuration used for determining template file location.
     */
    public GeneratorTemplateContentLocator(Generator generator) {
        this.generator = generator;
    }

    /**
     * Determines whether an embedded file with the specified name exists.
     *
     * @param name The name of the file (i.e. relative to resource root)
     *
     * @return true if file is an embedded resource, false if it does not exist
     */
    public boolean embeddedTemplateExists(String name) {
        return classpathTemplateExists(name);
    }

    private boolean classpathTemplateExists(String name) {
        return this.getClass().getClassLoader().getResource(TemplateManager.getCPResourcePath(name)) != null;
    }

    /**
     * Get the template file path with template dir prepended, and use the library template if exists.
     *
     * Precedence:
     * 1) (template dir)/libraries/(library)
     * 2) (template dir)
     * 3) (embedded template dir)/libraries/(library)
     * 4) (embedded template dir)
     *
     * Where "template dir" may be user defined and "embedded template dir" are the built-in templates for the given generator.
     *
     * @param relativeTemplateFile Template file
     * @return String Full template file path
     */
    @Override
    public String getFullTemplatePath(String relativeTemplateFile) {
        Generator config = this.generator;

        // check the supplied template main folder for the file
        // File.separator is necessary here as the file load is OS-specific
        final String template = config.templateDir() + File.separator + relativeTemplateFile;
        // looks for user-defined file or classpath
        // supports template dir which refers to local file system or custom path in classpath as defined by templateDir
        if (new File(template).exists() || classpathTemplateExists(template)) {
            return template;
        }

        // Fall back to the template file for generator root directory embedded/packaged in the JAR file...
        String loc = config.embeddedTemplateDir() + File.separator + relativeTemplateFile;
        // *only* looks for those files in classpath as defined by embeddedTemplateDir
        if (embeddedTemplateExists(loc)) {
            return loc;
        }

        return null;
    }
}
