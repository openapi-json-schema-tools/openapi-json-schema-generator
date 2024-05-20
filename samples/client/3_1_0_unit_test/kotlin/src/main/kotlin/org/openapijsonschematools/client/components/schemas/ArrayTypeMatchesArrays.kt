package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.schemas.ListJsonSchema
import org.openapijsonschematools.client.schemas.validation.FrozenList

class ArrayTypeMatchesArrays: ListJsonSchema() {
    // nest classes so all schemas and input/output classes can be public
    
    
    class ArrayTypeMatchesArrays1 : ListJsonSchema.ListJsonSchema1() {
        companion object {
            @Volatile
            private var instance: ArrayTypeMatchesArrays1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: ArrayTypeMatchesArrays1().also { instance = it }
                }
        }
    }

}
