package org.openapijsonschematools.client.paths.storeorderorderid.delete;

import org.openapijsonschematools.client.paths.storeorderorderid.delete.parameters.Parameter0;
import org.openapijsonschematools.client.parameter.PathSerializer;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class PathParametersSerializer extends PathSerializer {
        public PathParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("order_id", new Parameter0.Parameter01())
                )
            );
        }
    }
}
