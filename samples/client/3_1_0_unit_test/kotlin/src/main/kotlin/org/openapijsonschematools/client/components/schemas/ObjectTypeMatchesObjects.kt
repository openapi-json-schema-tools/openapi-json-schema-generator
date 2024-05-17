package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.schemas.MapJsonSchema
import org.openapijsonschematools.client.schemas.validation.FrozenMap

class ObjectTypeMatchesObjects: MapJsonSchema() {
    // nest classes so all schemas and input/output classes can be public
    
    
    class ObjectTypeMatchesObjects1 : MapJsonSchema.MapJsonSchema1() {
        companion object {
            @Volatile
            private var instance: ObjectTypeMatchesObjects1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: ObjectTypeMatchesObjects1().also { instance = it }
                }
        }
    }

}
