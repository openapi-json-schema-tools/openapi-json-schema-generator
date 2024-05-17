package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.schemas.StringJsonSchema

class TypeAsArrayWithOneItem: StringJsonSchema() {
    // nest classes so all schemas and input/output classes can be public
    
    
    class TypeAsArrayWithOneItem1 : StringJsonSchema.StringJsonSchema1() {
        companion object {
            @Volatile
            private var instance: TypeAsArrayWithOneItem1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: TypeAsArrayWithOneItem1().also { instance = it }
                }
        }
    }

}
