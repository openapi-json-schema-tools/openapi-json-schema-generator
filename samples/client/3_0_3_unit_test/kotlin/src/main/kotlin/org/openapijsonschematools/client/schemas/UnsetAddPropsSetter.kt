package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.schemas.validation.MapUtils

interface UnsetAddPropsSetter<T> {
    fun getInstance(): MutableMap<String, Any?>
    fun getKnownKeys(): Set<String>
    fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): T
    @Throws(InvalidAdditionalPropertyException::class)
    fun additionalProperty(key: String, value: Void): T {
        MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
        val instance = getInstance()
        instance[key] = value
        return getBuilderAfterAdditionalProperty(instance)
    }

    @Throws(InvalidAdditionalPropertyException::class)
    fun additionalProperty(key: String, value: Boolean): T {
        MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
        val instance = getInstance()
        instance[key] = value
        return getBuilderAfterAdditionalProperty(instance)
    }

    @Throws(InvalidAdditionalPropertyException::class)
    fun additionalProperty(key: String, value: String): T {
        MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
        val instance = getInstance()
        instance[key] = value
        return getBuilderAfterAdditionalProperty(instance)
    }

    @Throws(InvalidAdditionalPropertyException::class)
    fun additionalProperty(key: String, value: Int): T {
        MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
        val instance = getInstance()
        instance[key] = value
        return getBuilderAfterAdditionalProperty(instance)
    }

    @Throws(InvalidAdditionalPropertyException::class)
    fun additionalProperty(key: String, value: Float): T {
        MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
        val instance = getInstance()
        instance[key] = value
        return getBuilderAfterAdditionalProperty(instance)
    }

    @Throws(InvalidAdditionalPropertyException::class)
    fun additionalProperty(key: String, value: Long): T {
        MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
        val instance = getInstance()
        instance[key] = value
        return getBuilderAfterAdditionalProperty(instance)
    }

    @Throws(InvalidAdditionalPropertyException::class)
    fun additionalProperty(key: String, value: Double): T {
        MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
        val instance = getInstance()
        instance[key] = value
        return getBuilderAfterAdditionalProperty(instance)
    }

    @Throws(InvalidAdditionalPropertyException::class)
    fun additionalProperty(key: String, value: List<*>): T {
        MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
        val instance = getInstance()
        instance[key] = value
        return getBuilderAfterAdditionalProperty(instance)
    }

    @Throws(InvalidAdditionalPropertyException::class)
    fun additionalProperty(key: String, value: Map<String?, *>): T {
        MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
        val instance = getInstance()
        instance[key] = value
        return getBuilderAfterAdditionalProperty(instance)
    }
}