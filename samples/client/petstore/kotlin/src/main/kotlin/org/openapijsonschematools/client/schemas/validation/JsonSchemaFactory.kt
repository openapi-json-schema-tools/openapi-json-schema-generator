package org.openapijsonschematools.client.schemas.validation

import java.lang.reflect.InvocationTargetException

object JsonSchemaFactory {
    private var classToInstance: MutableMap<Class<out JsonSchema<*>>, JsonSchema<*>> = HashMap()

    fun <V : JsonSchema<*>> getInstance(schemaCls: Class<V>): V {
        val cacheInst: JsonSchema<*>? = classToInstance[schemaCls]
        cacheInst?.let {
            assert(schemaCls.isInstance(it))
            return schemaCls.cast(it)
        }
        try {
            val method = schemaCls.getMethod("getInstance")
            val obj = method.invoke(null)
            assert(schemaCls.isInstance(obj))
            val inst = schemaCls.cast(obj)
            classToInstance[schemaCls] = inst
            return inst
        } catch (e: NoSuchMethodException) {
            throw RuntimeException(e)
        } catch (e: IllegalAccessException) {
            throw RuntimeException(e)
        } catch (e: InvocationTargetException) {
            throw RuntimeException(e)
        }
    }
}