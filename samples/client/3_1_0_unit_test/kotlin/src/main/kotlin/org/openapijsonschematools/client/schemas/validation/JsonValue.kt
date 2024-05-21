package org.openapijsonschematools.client.schemas.validation

import java.math.BigDecimal

class JsonValue {
    sealed interface JsonValueBoxed {
        fun getData(): Any?
    }

    data class JsonValueBoxedVoid(val data: Nothing?) : JsonValueBoxed {
        override fun getData(): Any? {
            return data
        }
    }

    data class JsonValueBoxedBoolean(val data: Boolean) : JsonValueBoxed {
        override fun getData(): Any? {
            return data
        }
    }

    data class JsonValueBoxedNumber(val data: Number) : JsonValueBoxed {
        override fun getData(): Any? {
            return data
        }
    }

    data class JsonValueBoxedBigDecimal(val data: BigDecimal) : JsonValueBoxed {
        override fun getData(): Any? {
            return data
        }
    }

    data class JsonValueBoxedString(val data: String) : JsonValueBoxed {
        override fun getData(): Any? {
            return data
        }
    }

    data class JsonValueBoxedList(val data: List<*>) : JsonValueBoxed {
        override fun getData(): Any? {
            return data
        }
    }

    data class JsonValueBoxedMap(val data: Map<*, *>) : JsonValueBoxed {
        override fun getData(): Any? {
            return data
        }
    }

    companion object {
        fun of(arg: Any?): JsonValueBoxed {
            when (arg) {
                null -> {
                    return JsonValueBoxedVoid(null)
                }
                is Boolean -> {
                    return JsonValueBoxedBoolean(arg)
                }

                is BigDecimal -> {
                    return JsonValueBoxedBigDecimal(arg)
                }

                is Number -> {
                    return JsonValueBoxedNumber(arg)
                }

                is String -> {
                    return JsonValueBoxedString(arg)
                }

                is List<*> -> {
                    return JsonValueBoxedList(arg)
                }

                is Map<*, *> -> {
                    return JsonValueBoxedMap(arg)
                }

                else -> throw RuntimeException("Invalid input type=${arg.javaClass}. It can't be instantiated by this schema")
            }
        }
    }
}