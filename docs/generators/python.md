---
title: Documentation for the python Generator
---

## METADATA

| Property | Value | Notes |
| -------- | ----- | ----- |
| generator name | python | pass this to the generate command after -g |
| generator stability | STABLE | |
| generator type | CLIENT | |
| generator language | Python | |
| generator language version | >=3.7 | |
| generator default templating engine | handlebars | |
| helpTxt | Generates a Python client library<br /><br />Features in this generator:<br />- type hints on endpoints and model creation<br />- model parameter names use the spec defined keys and cases<br />- robust composition (oneOf/anyOf/allOf/not) where payload data is stored in one instance only<br />- endpoint parameter names use the spec defined keys and cases<br />- inline schemas are supported at any location including composition<br />- multiple content types supported in request body and response bodies<br />- run time type checking<br />- Sending/receiving decimals as strings supported with type:string format: number -> DecimalSchema<br />- Sending/receiving uuids as strings supported with type:string format: uuid -> UUIDSchema<br />- quicker load time for python modules (a single endpoint can be imported and used without loading others)<br />- all instances of schemas dynamically inherit from all matching schemas so one can use isinstance to check if validation passed<br />- composed schemas with type constraints supported (type:object + oneOf/anyOf/allOf)<br />- schemas are not coerced/cast. For example string + date are both stored as string, and there is a date accessor<br />    - Exceptions: int/float is stored as Decimal, When receiving data from headers it will start as str and may need to be cast for example to int | |

## CONFIG OPTIONS
These options may be applied as additional-properties (cli) or configOptions (plugins). Refer to [configuration docs](https://openapi-generator.tech/docs/configuration) for more details.

| Option | Description | Values | Default |
| ------ | ----------- | ------ | ------- |
|generateSourceCodeOnly|Specifies that only a library source code is to be generated.| |false|
|hideGenerationTimestamp|Hides the generation timestamp when files are generated.| |true|
|library|library template (sub-template) to use: urllib3| |urllib3|
|nonCompliantUseDiscriminatorIfCompositionFails|When true, If the payload fails to validate against composed schemas (allOf/anyOf/oneOf/not) and a discriminator is present, then ignore the composition validation errors and attempt to use the discriminator to validate the payload.<br />Note: setting this to true makes the generated client not comply with json schema because it ignores composition validation errors. Please consider making your schemas more restrictive rather than setting this to true. You can do that by:<ul><li>defining the propertyName as an enum with only one value in the schemas that are in your discriminator map</li><li>setting additionalProperties: false in your schemas</li></ul>|<dl><dt>**true**</dt><dd>If composition fails and a discriminator exists, the composition errors will be ignored and validation will be attempted with the discriminator</dd><dt>**false**</dt><dd>Composition validation must succeed. Discriminator validation must succeed.</dd></dl>|false|
|packageName|python package name (convention: snake_case).| |openapi_client|
|packageUrl|python package URL.| |null|
|packageVersion|python package version.| |1.0.0|
|projectName|python project name in setup.py (e.g. petstore-api).| |null|
|recursionLimit|Set the recursion limit. If not set, use the system default value.| |null|
|useInlineModelResolver|use the inline model resolver, if true inline complex models will be extracted into components and $refs to them will be used| |false|
|useNose|use the nose test framework| |false|

## IMPORT MAPPING

| Type/Alias | Imports |
| ---------- | ------- |


## INSTANTIATION TYPES

| Type/Alias | Instantiated By |
| ---------- | --------------- |
|array|tuple|
|boolean|schemas.BoolClass|
|integer|decimal.Decimal|
|null|schemas.NoneClass|
|number|decimal.Decimal|
|object|frozendict.frozendict|
|string|str|


## LANGUAGE PRIMITIVES

<ul class="column-ul">
<li>bool</li>
<li>bytes</li>
<li>date</li>
<li>datetime</li>
<li>dict</li>
<li>file</li>
<li>file_type</li>
<li>float</li>
<li>int</li>
<li>list</li>
<li>none_type</li>
<li>object</li>
<li>str</li>
</ul>

## RESERVED WORDS

<ul class="column-ul">
<li>and</li>
<li>as</li>
<li>assert</li>
<li>async</li>
<li>await</li>
<li>bool</li>
<li>break</li>
<li>class</li>
<li>continue</li>
<li>def</li>
<li>del</li>
<li>dict</li>
<li>elif</li>
<li>else</li>
<li>except</li>
<li>exec</li>
<li>false</li>
<li>finally</li>
<li>float</li>
<li>for</li>
<li>from</li>
<li>frozendict</li>
<li>global</li>
<li>if</li>
<li>import</li>
<li>in</li>
<li>int</li>
<li>is</li>
<li>lambda</li>
<li>list</li>
<li>none</li>
<li>nonlocal</li>
<li>not</li>
<li>or</li>
<li>pass</li>
<li>print</li>
<li>property</li>
<li>raise</li>
<li>return</li>
<li>self</li>
<li>str</li>
<li>true</li>
<li>try</li>
<li>tuple</li>
<li>while</li>
<li>with</li>
<li>yield</li>
</ul>

## FEATURE SET


### Client Modification Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|BasePath|✗|ToolingExtension
|Authorizations|✗|ToolingExtension
|UserAgent|✗|ToolingExtension
|MockServer|✗|ToolingExtension

### Components Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|schemas|✓|OAS3
|responses|✓|OAS3
|parameters|✓|OAS3
|examples|✗|OAS3
|requestBodies|✓|OAS3
|headers|✓|OAS3
|securitySchemes|✓|OAS3
|links|✗|OAS3
|callbacks|✗|OAS3
|pathItems|✗|OAS3

### Data Type Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Custom|✗|OAS2,OAS3
|Int32|✓|OAS2,OAS3
|Int64|✓|OAS2,OAS3
|Integer|✓|OAS2,OAS3
|Float|✓|OAS2,OAS3
|Double|✓|OAS2,OAS3
|Number|✓|OAS2,OAS3
|String|✓|OAS2,OAS3
|Byte|✗|OAS2,OAS3
|Binary|✓|OAS2,OAS3
|Boolean|✓|OAS2,OAS3
|Date|✓|OAS2,OAS3
|DateTime|✓|OAS2,OAS3
|Password|✗|OAS2,OAS3
|File|✓|OAS2
|Uuid|✓|OAS2,OAS3
|Array|✓|OAS2,OAS3
|Null|✓|OAS3
|AnyType|✓|OAS2,OAS3
|Object|✓|OAS2,OAS3
|Enum|✓|OAS2,OAS3

### Documentation Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Readme|✓|ToolingExtension
|Servers|✓|OAS3
|Security|✓|OAS2,OAS3
|ComponentSchemas|✓|OAS3
|ComponentResponses|✓|OAS3
|ComponentParameters|✓|OAS3
|ComponentRequestBodies|✓|OAS3
|ComponentHeaders|✓|OAS3
|ComponentSecuritySchemes|✓|OAS3
|ComponentLinks|✗|OAS3
|ComponentCallbacks|✗|OAS3
|ComponentPathItems|✗|OAS3
|Api|✓|ToolingExtension

### Global Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Info|✓|OAS2,OAS3
|Servers|✓|OAS3
|Paths|✓|OAS2,OAS3
|Webhooks|✗|OAS3
|Components|✓|OAS3
|Security|✓|OAS2,OAS3
|Tags|✓|OAS2,OAS3
|ExternalDocs|✗|OAS2,OAS3

### Parameter Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Name|✓|OAS2,OAS3
|Required|✓|OAS2,OAS3
|In_Path|✓|OAS2,OAS3
|In_Query|✓|OAS2,OAS3
|In_Header|✓|OAS2,OAS3
|In_Cookie|✗|OAS3
|Style_Matrix|✓|OAS3
|Style_Label|✓|OAS3
|Style_Form|✓|OAS3
|Style_Simple|✓|OAS3
|Style_SpaceDelimited|✓|OAS3
|Style_PipeDelimited|✓|OAS3
|Style_DeepObject|✗|OAS3
|Explode|✓|OAS3
|Schema|✓|OAS3
|Content|✓|OAS3

### Schema Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|AdditionalProperties|✓|OAS2,OAS3
|AllOf|✓|OAS2,OAS3
|AnyOf|✓|OAS3
|Discriminator|✓|OAS2,OAS3
|Enum|✓|OAS2,OAS3
|ExclusiveMinimum|✓|OAS2,OAS3
|ExclusiveMaximum|✓|OAS2,OAS3
|Format|✓|OAS2,OAS3
|Items|✓|OAS2,OAS3
|MaxItems|✓|OAS2,OAS3
|MaxLength|✓|OAS2,OAS3
|MaxProperties|✓|OAS2,OAS3
|Maximum|✓|OAS2,OAS3
|MinItems|✓|OAS2,OAS3
|MinLength|✓|OAS2,OAS3
|MinProperties|✓|OAS2,OAS3
|Minimum|✓|OAS2,OAS3
|MultipleOf|✓|OAS2,OAS3
|Not|✓|OAS3
|Nullable|✓|OAS3
|OneOf|✓|OAS3
|Pattern|✓|OAS2,OAS3
|Properties|✓|OAS2,OAS3
|Required|✓|OAS2,OAS3
|Type|✓|OAS2,OAS3
|UniqueItems|✓|OAS2,OAS3
|Xml|✗|OAS2,OAS3

### Security Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|HTTP_Basic|✓|OAS2,OAS3
|ApiKey|✓|OAS2,OAS3
|OpenIDConnect|✗|OAS3
|HTTP_Bearer|✓|OAS2,OAS3
|OAuth2_Implicit|✗|OAS2,OAS3
|OAuth2_Password|✗|OAS2,OAS3
|OAuth2_ClientCredentials|✗|OAS2,OAS3
|OAuth2_AuthorizationCode|✗|OAS2,OAS3

### Wire Format Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|JSON|✓|OAS2,OAS3
|XML|✗|OAS2,OAS3
|PROTOBUF|✗|ToolingExtension
|Custom|✓|OAS2,OAS3
