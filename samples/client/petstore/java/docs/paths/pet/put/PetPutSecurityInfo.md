# PetPutSecurityInfo
PetPutSecurityInfo.java

public class PetPutSecurityInfo

A class that provides a security requirement object, and any needed security info classes
- a class that is a SecurityRequirementObjectProvider
- an enum class that describes security index values

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [PetPutSecurityInfo.PetPutSecurityInfo1](#petputsecurityinfo1)<br>SecurityRequirementObjectProvider
| enum | [PetPutSecurityInfo.SecurityIndex](#securityindex)<br>class that stores a security index |

## PetPutSecurityInfo1
implements SecurityRequirementObjectProvider<[SecurityIndex](#securityindex)>

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetPutSecurityInfo1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PetPutSecurityRequirementObject0](../../../paths/pet/put/security/PetPutSecurityRequirementObject0.md) | security0 |
| [PetPutSecurityRequirementObject1](../../../paths/pet/put/security/PetPutSecurityRequirementObject1.md) | security1 |

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
