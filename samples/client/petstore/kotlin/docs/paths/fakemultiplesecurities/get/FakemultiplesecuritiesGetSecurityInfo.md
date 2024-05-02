# FakemultiplesecuritiesGetSecurityInfo
FakemultiplesecuritiesGetSecurityInfo.java

public class FakemultiplesecuritiesGetSecurityInfo

A class that provides a security requirement object, and any needed security info classes
- a class that is a SecurityRequirementObjectProvider
- an enum class that describes security index values

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [FakemultiplesecuritiesGetSecurityInfo.FakemultiplesecuritiesGetSecurityInfo1](#fakemultiplesecuritiesgetsecurityinfo1)<br>SecurityRequirementObjectProvider
| enum | [FakemultiplesecuritiesGetSecurityInfo.SecurityIndex](#securityindex)<br>class that stores a security index |

## FakemultiplesecuritiesGetSecurityInfo1
implements SecurityRequirementObjectProvider<[SecurityIndex](#securityindex)>

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakemultiplesecuritiesGetSecurityInfo1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakemultiplesecuritiesGetSecurityRequirementObject0](../../../paths/fakemultiplesecurities/get/security/FakemultiplesecuritiesGetSecurityRequirementObject0.md) | security0 |
| [FakemultiplesecuritiesGetSecurityRequirementObject1](../../../paths/fakemultiplesecurities/get/security/FakemultiplesecuritiesGetSecurityRequirementObject1.md) | security1 |
| [FakemultiplesecuritiesGetSecurityRequirementObject2](../../../paths/fakemultiplesecurities/get/security/FakemultiplesecuritiesGetSecurityRequirementObject2.md) | security2 |

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
| SECURITY_2<br>security 2 |
