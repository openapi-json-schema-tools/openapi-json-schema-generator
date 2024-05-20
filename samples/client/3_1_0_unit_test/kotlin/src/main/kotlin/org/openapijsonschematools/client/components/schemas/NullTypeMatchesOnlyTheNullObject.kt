package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.schemas.NullJsonSchema

class NullTypeMatchesOnlyTheNullObject: NullJsonSchema() {
    // nest classes so all schemas and input/output classes can be public
    
    
    class NullTypeMatchesOnlyTheNullObject1 : NullJsonSchema.NullJsonSchema1() {
        companion object {
            @Volatile
            private var instance: NullTypeMatchesOnlyTheNullObject1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: NullTypeMatchesOnlyTheNullObject1().also { instance = it }
                }
        }
    }

}
