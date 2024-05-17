package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.schemas.BooleanJsonSchema

class BooleanTypeMatchesBooleans: BooleanJsonSchema() {
    // nest classes so all schemas and input/output classes can be public
    
    
    class BooleanTypeMatchesBooleans1 : BooleanJsonSchema.BooleanJsonSchema1() {
        companion object {
            @Volatile
            private var instance: BooleanTypeMatchesBooleans1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: BooleanTypeMatchesBooleans1().also { instance = it }
                }
        }
    }

}
