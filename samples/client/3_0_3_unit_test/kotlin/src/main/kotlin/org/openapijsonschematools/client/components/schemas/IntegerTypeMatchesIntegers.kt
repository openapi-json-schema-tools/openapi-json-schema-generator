package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.schemas.IntJsonSchema

class IntegerTypeMatchesIntegers: IntJsonSchema() {
    // nest classes so all schemas and input/output classes can be public
    
    
    class IntegerTypeMatchesIntegers1 : IntJsonSchema.IntJsonSchema1() {
        companion object {
            @Volatile
            private var instance: IntegerTypeMatchesIntegers1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: IntegerTypeMatchesIntegers1().also { instance = it }
                }
        }
    }

}
