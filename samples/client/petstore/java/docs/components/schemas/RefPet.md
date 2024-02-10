# RefPet
org.openapijsonschematools.client.components.schemas.RefPet.java
public class RefPet

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefPet.RefPet1Boxed](#refpet1boxed)<br> sealed validated payload class |
| static class | [RefPet.RefPet1](#refpet1)<br> schema class |

## RefPet1Boxed
public static abstract sealed class RefPet1Boxed<br>
permits<br>
[RefPet1BoxedVoid](#refpet1boxedvoid),
[RefPet1BoxedBoolean](#refpet1boxedboolean),
[RefPet1BoxedNumber](#refpet1boxednumber),
[RefPet1BoxedString](#refpet1boxedstring),
[RefPet1BoxedList](#refpet1boxedlist),
[RefPet1BoxedMap](#refpet1boxedmap)

## RefPet1
public static class RefPet1<br>
extends [Pet.Pet1](../../components/schemas/Pet.md#pet1)

A schema class that validates payloads

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
