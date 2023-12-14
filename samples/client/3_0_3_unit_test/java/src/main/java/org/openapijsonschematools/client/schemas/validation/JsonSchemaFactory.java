package org.openapijsonschematools.client.schemas.validation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class JsonSchemaFactory {
    static Map<Class<? extends JsonSchema>, JsonSchema> classToInstance = new HashMap<>();

    public static <V extends JsonSchema> V getInstance(Class<V> schemaCls) {
        if (classToInstance.containsKey(schemaCls)) {
            return (V) classToInstance.get(schemaCls);
        }
        try {
            Method method = schemaCls.getMethod("getInstance");
            V inst = (V) method.invoke(null);
            classToInstance.put(schemaCls, inst);
            return inst;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}