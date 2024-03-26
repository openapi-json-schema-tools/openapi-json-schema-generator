# PetfindbytagsGetSecurityInfo
PetfindbytagsGetSecurityInfo.java

public class PetfindbytagsGetSecurityInfo

A class that provides a security requirement object, and any needed security info classes
- a class that stores a securityIndex and provides a SecurityRequirementsObject
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
| PetfindbytagsGetSecurityInfo1([SecurityIndex](#securityindex) securityIndex)<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| EnumMap<SecurityIndex, SecurityRequirementObject> | securities = new EnumMap<>(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new PetfindbytagsGetSecurityRequirementObject0()),<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, new PetfindbytagsGetSecurityRequirementObject1())<br>)); |

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
