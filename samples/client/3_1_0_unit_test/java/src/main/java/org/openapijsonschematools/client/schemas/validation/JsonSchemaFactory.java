package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class JsonSchemaFactory {
    static Map<Class<? extends JsonSchema<?>>, JsonSchema<?>> classToInstance = new HashMap<>();

    public static <V extends JsonSchema<?>> V getInstance(Class<V> schemaCls) {
        @Nullable JsonSchema<?> cacheInst = classToInstance.get(schemaCls);
        if (cacheInst != null) {
            assert schemaCls.isInstance(cacheInst);
            return schemaCls.cast(cacheInst);
        }
        try {
            Method method = schemaCls.getMethod("getInstance");
            @SuppressWarnings("nullness") @NonNull Object obj = method.invoke(null);
            assert schemaCls.isInstance(obj);
            V inst = schemaCls.cast(obj);
            classToInstance.put(schemaCls, inst);
            return inst;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}