# PetpetiduploadimagePostSecurityInfo
PetpetiduploadimagePostSecurityInfo.java

public class PetpetiduploadimagePostSecurityInfo

A class that provides a security requirement object, and any needed security info classes
- a class that is a SecurityRequirementObjectProvider
- an enum class that describes security index values

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [PetpetiduploadimagePostSecurityInfo.PetpetiduploadimagePostSecurityInfo1](#petpetiduploadimagepostsecurityinfo1)<br>SecurityRequirementObjectProvider
| enum | [PetpetiduploadimagePostSecurityInfo.SecurityIndex](#securityindex)<br>class that stores a security index |

## PetpetiduploadimagePostSecurityInfo1
implements SecurityRequirementObjectProvider<[SecurityIndex](#securityindex)>

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostSecurityInfo1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PetpetiduploadimagePostSecurityRequirementObject0](../../../paths/petpetiduploadimage/post/security/PetpetiduploadimagePostSecurityRequirementObject0.md) | security0 |

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
