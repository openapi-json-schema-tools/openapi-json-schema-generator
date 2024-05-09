package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException

class MapUtils {
    companion object {
        /**
         * A builder for maps that allows in null values
         * Schema tests + doc code samples need it
         * @param entries items to add
         * @return the output map
         * @param <K> key type
         * @param <V> value type
        </V></K> */
        @SafeVarargs
        fun <K, V> makeMap(vararg entries: Map.Entry<K, V>): Map<K, V> {
            val map: MutableMap<K, V> = HashMap()
            for ((key, value) in entries) {
                map[key] = value
            }
            return map
        }

        @Throws(InvalidAdditionalPropertyException::class)
        fun throwIfKeyKnown(key: String, knownKeys: Set<String>, setting: Boolean) {
            if (knownKeys.contains(key)) {
                var verb = "getting"
                if (setting) {
                    verb = "setting"
                }
                throw InvalidAdditionalPropertyException("The known key $key may not be passed in when $verb an additional property")
            }
        }
    }
}