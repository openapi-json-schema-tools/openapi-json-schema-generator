package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException

open class FrozenMap<V>(m: Map<String, V>) : AbstractMap<String, V>() {
    /*
    A frozen Map
    Once schema validation has been run, written accessor methods return values of the correct type
    If values were mutable, the types in those methods would not agree with returned values
     */
    private val map: Map<String, V>

    init {
        map = HashMap(m)
    }

    @Throws(UnsetPropertyException::class)
    protected fun getOrThrow(key: String): V? {
        if (containsKey(key)) {
            return get(key)
        }
        throw UnsetPropertyException("$key is unset")
    }

    @Throws(UnsetPropertyException::class)
    protected fun throwIfKeyNotPresent(key: String) {
        if (!containsKey(key)) {
            throw UnsetPropertyException("$key is unset")
        }
    }

    @Throws(InvalidAdditionalPropertyException::class)
    protected fun throwIfKeyKnown(key: String, requiredKeys: Set<String>, optionalKeys: Set<String>) {
        val knownKeys: MutableSet<String> = HashSet()
        knownKeys.addAll(requiredKeys)
        knownKeys.addAll(optionalKeys)
        MapUtils.throwIfKeyKnown(key, knownKeys, false)
    }

    override val entries: Set<Map.Entry<String, V>>
        get() = map.entries
}

