# PetfindbytagsGetSecurityInfo
PetfindbytagsGetSecurityInfo.java

public class PetfindbytagsGetSecurityInfo

A class that provides a security requirement object, and any needed security info classes
- a class that is a SecurityRequirementObjectProvider
- an enum class that describes security index values

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [PetfindbytagsGetSecurityInfo.PetfindbytagsGetSecurityInfo1](#petfindbytagsgetsecurityinfo1)<br>SecurityRequirementObjectProvider
| enum | [PetfindbytagsGetSecurityInfo.SecurityIndex](#securityindex)<br>class that stores a security index |

## PetfindbytagsGetSecurityInfo1
implements SecurityRequirementObjectProvider<[SecurityIndex](#securityindex)>

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetSecurityInfo1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PetfindbytagsGetSecurityRequirementObject0](../../../paths/petfindbytags/get/security/PetfindbytagsGetSecurityRequirementObject0.md) | security0 |
| [PetfindbytagsGetSecurityRequirementObject1](../../../paths/petfindbytags/get/security/PetfindbytagsGetSecurityRequirementObject1.md) | security1 |

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
