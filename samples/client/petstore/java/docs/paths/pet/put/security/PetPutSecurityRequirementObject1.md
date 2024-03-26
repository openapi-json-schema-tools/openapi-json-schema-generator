# PetPutSecurityRequirementObject1
PetPutSecurityRequirementObject1.java

public class PetPutSecurityRequirementObject1
extends SecurityRequirementObject

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetPutSecurityRequirementObject1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| Map<Class<? extends SecurityScheme>, List<String>> | securitySchemeToScopes = Map.ofEntries(&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<Class<? extends SecurityScheme>, List<String>>(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PetstoreAuth.class,&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;List.of("write:pets", "read:pets")&nbsp;&nbsp;&nbsp;&nbsp;)) |
