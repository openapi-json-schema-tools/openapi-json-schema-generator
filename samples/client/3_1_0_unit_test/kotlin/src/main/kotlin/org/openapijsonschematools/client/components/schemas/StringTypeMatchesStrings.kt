package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.schemas.StringJsonSchema

class StringTypeMatchesStrings: StringJsonSchema() {
    // nest classes so all schemas and input/output classes can be public
    
    
    class StringTypeMatchesStrings1 : StringJsonSchema.StringJsonSchema1() {
        companion object {
            @Volatile
            private var instance: StringTypeMatchesStrings1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: StringTypeMatchesStrings1().also { instance = it }
                }
        }
    }

}
