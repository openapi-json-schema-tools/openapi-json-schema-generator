package org.openapijsonschematools.codegen.meta;

import org.openapijsonschematools.codegen.meta.features.ClientModificationFeature;
import org.openapijsonschematools.codegen.meta.features.DataTypeFeature;
import org.openapijsonschematools.codegen.meta.features.DocumentationFeature;
import org.openapijsonschematools.codegen.meta.features.GlobalFeature;
import org.openapijsonschematools.codegen.meta.features.ParameterFeature;
import org.openapijsonschematools.codegen.meta.features.SchemaFeature;
import org.openapijsonschematools.codegen.meta.features.SecurityFeature;
import org.openapijsonschematools.codegen.meta.features.annotations.AnnotationType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.*;

public class FeatureSetTest {

    @Test
    public void flattOnUnspecified() {
        List<FeatureSet.FeatureSetFlattened> flattened = FeatureSet.UNSPECIFIED.flatten();
        // There are 73 features at the time of writing this test. This makes sure we get a "Full" flat representation.
        int knownFeatureCount = 73;
        int checkedCount = 0;
        assertTrue(flattened.size() >= knownFeatureCount);

        for (FeatureSet.FeatureSetFlattened f : flattened) {
            checkedCount += 1;
            assertFalse(f.isSupported);
        }

        assertTrue(checkedCount >= knownFeatureCount);
    }

    @Test
    public void flattenOnMultipleFeatures() {
        FeatureSet featureSet = FeatureSet.newBuilder()
                .includeClientModificationFeatures(ClientModificationFeature.BasePath)
                .includeDataTypeFeatures(DataTypeFeature.Int32, DataTypeFeature.Array)
                .includeGlobalFeatures(GlobalFeature.Security, GlobalFeature.Info)
                .includeParameterFeatures(ParameterFeature.In_Header, ParameterFeature.In_Query)
                .includeSecurityFeatures(SecurityFeature.HTTP_Bearer, SecurityFeature.HTTP_Basic, SecurityFeature.OAuth2_Implicit)
                .includeDocumentationFeatures(DocumentationFeature.ComponentSchemas)
                .includeSchemaFeatures(SchemaFeature.OneOf)
                .build();

        List<FeatureSet.FeatureSetFlattened> flattened = featureSet.flatten();
        List<FeatureSet.FeatureSetFlattened> supported = new ArrayList<>();
        flattened.forEach(f -> {
            if (f.isSupported) {
                supported.add(f);
            }
        });

        // note that the order of these checks is deterministic, but unrelated to feature inclusion order in this test.
        assertEquals(supported.size(), 12);

        Set<AnnotationType> toolingOnly = new HashSet<AnnotationType>() {{
            add(AnnotationType.ToolingExtension);
        }};
        Set<AnnotationType> oas2Only = new HashSet<AnnotationType>() {{
            add(AnnotationType.OAS2);
        }};
        Set<AnnotationType> oas3Only = new HashSet<AnnotationType>() {{
            add(AnnotationType.OAS3);
        }};
        Set<AnnotationType> bothSpecs = new HashSet<AnnotationType>() {{
            add(AnnotationType.OAS2);
            add(AnnotationType.OAS3);
        }};

        assertEquals(supported.get(0).featureCategory, ClientModificationFeature.class.getSimpleName());
        assertEquals(supported.get(0).featureName, ClientModificationFeature.BasePath.name());
        assertEquals(new HashSet<>(supported.get(0).source), toolingOnly);

        assertEquals(supported.get(1).featureCategory, DataTypeFeature.class.getSimpleName());
        assertEquals(supported.get(1).featureName, DataTypeFeature.Int32.name());
        assertEquals(new HashSet<>(supported.get(1).source), bothSpecs);

        assertEquals(supported.get(2).featureCategory, DataTypeFeature.class.getSimpleName());
        assertEquals(supported.get(2).featureName, DataTypeFeature.Array.name());
        assertEquals(new HashSet<>(supported.get(2).source), bothSpecs);

        assertEquals(supported.get(3).featureCategory, DocumentationFeature.class.getSimpleName());
        assertEquals(supported.get(3).featureName, DocumentationFeature.ComponentSchemas.name());
        assertEquals(new HashSet<>(supported.get(3).source), oas3Only);

        assertEquals(supported.get(4).featureCategory, SchemaFeature.class.getSimpleName());
        assertEquals(supported.get(4).featureName, SchemaFeature.OneOf.name());
        assertEquals(new HashSet<>(supported.get(4).source), oas3Only);

        assertEquals(supported.get(5).featureCategory, GlobalFeature.class.getSimpleName());
        assertEquals(supported.get(5).featureName, GlobalFeature.Info.name());
        assertEquals(new HashSet<>(supported.get(5).source), bothSpecs);

        assertEquals(supported.get(6).featureCategory, GlobalFeature.class.getSimpleName());
        assertEquals(supported.get(6).featureName, GlobalFeature.Security.name());
        assertEquals(new HashSet<>(supported.get(6).source), bothSpecs);

        assertEquals(supported.get(7).featureCategory, ParameterFeature.class.getSimpleName());
        assertEquals(supported.get(7).featureName, ParameterFeature.In_Query.name());
        assertEquals(new HashSet<>(supported.get(7).source), bothSpecs);

        assertEquals(supported.get(8).featureCategory, ParameterFeature.class.getSimpleName());
        assertEquals(supported.get(8).featureName, ParameterFeature.In_Header.name());
        assertEquals(new HashSet<>(supported.get(8).source), bothSpecs);

        assertEquals(supported.get(9).featureCategory, SecurityFeature.class.getSimpleName());
        assertEquals(supported.get(9).featureName, SecurityFeature.HTTP_Basic.name());
        assertEquals(new HashSet<>(supported.get(9).source), bothSpecs);

        assertEquals(supported.get(10).featureCategory, SecurityFeature.class.getSimpleName());
        assertEquals(supported.get(10).featureName, SecurityFeature.HTTP_Bearer.name());
        assertEquals(new HashSet<>(supported.get(10).source), bothSpecs);

        assertEquals(supported.get(11).featureCategory, SecurityFeature.class.getSimpleName());
        assertEquals(supported.get(11).featureName, SecurityFeature.OAuth2_Implicit.name());
        assertEquals(new HashSet<>(supported.get(11).source), bothSpecs);
    }

    @Test
    public void flattenOnSingleFeatures() {
        FeatureSet featureSet = FeatureSet.newBuilder().includeClientModificationFeatures(ClientModificationFeature.BasePath).build();
        List<FeatureSet.FeatureSetFlattened> flattened = featureSet.flatten();
        List<FeatureSet.FeatureSetFlattened> supported = new ArrayList<>();
        flattened.forEach(f -> {
            if (f.isSupported) {
                supported.add(f);
            }
        });

        assertEquals(supported.size(), 1);
        assertEquals(supported.get(0).featureCategory, ClientModificationFeature.class.getSimpleName());
        assertEquals(supported.get(0).featureName, ClientModificationFeature.BasePath.name());
        assertEquals(new HashSet<>(supported.get(0).source), new HashSet<AnnotationType>() {{
            add(AnnotationType.ToolingExtension);
        }});
    }
}