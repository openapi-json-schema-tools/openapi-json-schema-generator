# Schema01
org.openapijsonschematools.paths.petfindbystatus.get.parameters.parameter0.Schema0.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| List<String> | SchemaList0 | |

## Input List Items
```
type: List<String>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  | must be one of ["available", "pending", "sold"] if omitted the server will use the default value of available

## SchemaList0
```
base class: FrozenList<String>
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | 
configuration | configurations.SchemaConfiguration

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called
