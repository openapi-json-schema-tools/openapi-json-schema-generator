package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.schemas.NumberJsonSchema

class NumberTypeMatchesNumbers: NumberJsonSchema() {
    // nest classes so all schemas and input/output classes can be public
    
    
    class NumberTypeMatchesNumbers1 : NumberJsonSchema.NumberJsonSchema1() {
        companion object {
            @Volatile
            private var instance: NumberTypeMatchesNumbers1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: NumberTypeMatchesNumbers1().also { instance = it }
                }
        }
    }

}
