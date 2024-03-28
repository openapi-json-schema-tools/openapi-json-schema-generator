# PetpetidDeleteSecurityInfo
PetpetidDeleteSecurityInfo.java

public class PetpetidDeleteSecurityInfo

A class that provides a security requirement object, and any needed security info classes
- a class that is a SecurityRequirementObjectProvider
- an enum class that describes security index values

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [PetpetidDeleteSecurityInfo.PetpetidDeleteSecurityInfo1](#petpetiddeletesecurityinfo1)<br>SecurityRequirementObjectProvider
| enum | [PetpetidDeleteSecurityInfo.SecurityIndex](#securityindex)<br>class that stores a security index |

## PetpetidDeleteSecurityInfo1
implements SecurityRequirementObjectProvider<[SecurityIndex](#securityindex)>

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteSecurityInfo1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PetpetidDeleteSecurityRequirementObject0](../../../paths/petpetid/delete/security/PetpetidDeleteSecurityRequirementObject0.md) | security0 |
| [PetpetidDeleteSecurityRequirementObject1](../../../paths/petpetid/delete/security/PetpetidDeleteSecurityRequirementObject1.md) | security1 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SecurityRequirementObject | getSecurityRequirementObject(@Nullable [SecurityIndex](#securityindex) securityIndex)<br>If null is input, then the instance's securityIndex will be used |

## SecurityIndex
enum SecurityIndex<br>

### Enum Constant Summary
| Enum Constant And Description |
| ----------------------------- |
| SECURITY_0<br>security 0 |
| SECURITY_1<br>security 1 |
