# StoreinventoryGetSecurityInfo
StoreinventoryGetSecurityInfo.java

public class StoreinventoryGetSecurityInfo

A class that provides a security requirement object, and any needed security info classes
- a class that is a SecurityRequirementObjectProvider
- an enum class that describes security index values

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [StoreinventoryGetSecurityInfo.StoreinventoryGetSecurityInfo1](#storeinventorygetsecurityinfo1)<br>SecurityRequirementObjectProvider
| enum | [StoreinventoryGetSecurityInfo.SecurityIndex](#securityindex)<br>class that stores a security index |

## StoreinventoryGetSecurityInfo1
implements SecurityRequirementObjectProvider<[SecurityIndex](#securityindex)>

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreinventoryGetSecurityInfo1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [StoreinventoryGetSecurityRequirementObject0](../../../paths/storeinventory/get/security/StoreinventoryGetSecurityRequirementObject0.md) | security0 |

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
