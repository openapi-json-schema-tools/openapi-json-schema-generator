---
title: Documentation for the kotlin generator
---

## METADATA

| Property | Value | Notes |
| -------- | ----- | ----- |
| generator name | kotlin | pass this to the generate command after -g |
| generator stability | EXPERIMENTAL | |
| generator type | CLIENT | |
| generator language | Kotlin | |
| generator language version | 1.9.23 | |
| generator default templating engine | handlebars | |
| helpMsg | Generates a Kotlin client library<br /><br />Features in this generator:<br />- v3.0.0 - [v3.1.0](#schema-feature) OpenAPI Specification support<br />- Very thorough documentation generated in the style of javadocs<br />- Input types constrained for a Schema in SomeSchema.validate<br />  - validate method can accept arbitrary List/Map/null/int/long/double/float/String json data<br />- Immutable List output classes generated and returned by validate for List&lt;?&gt; input<br />- Immutable Map output classes generated and returned by validate for Map&lt;?, ?&gt; input<br />- Strictly typed list input can be instantiated in client code using generated ListBuilders<br />- Strictly typed map input can be instantiated in client code using generated MapBuilders<br />  - Sequential map builders are generated ensuring that required properties are set before build is invoked. Looks like:<br />  - `new MapBuilder().requiredA("a").requiredB("b").build()`<br />  - `new MapBuilder().requiredA("a").requiredB("b").optionalProp("c").additionalProperty("someAddProp", "d").build()`<br />- Run time type checking and validation when<br />  - validating schema payloads<br />  - instantiating List output class (validation run)<br />  - instantiating Map output class (validation run)<br />  - Note: if needed, validation of json schema keywords can be deactivated via a SchemaConfiguration class<br />- Enums classes are generated and may be input into Schema.validate or the List/MapBuilder add/setter methods<br />- Invalid (in Kotlin) property names supported like `class`, `1var`, `hi-there` etc in<br />  - component schema names<br />  - schema property names (a fallback setter is written in the MapBuilder)<br />- Generated interfaces are largely consistent with the python code<br />- Openapi spec inline schemas supported at any depth in any location<br />- Format support for: int32, int64, float, double, date, datetime, uuid<br />- Payload values are not coerced when validated, so a date/date-time value can pass other validations that describe the payload only as type string<br />- enum types are generated for enums of type string/integer/number/boolean/null<br />- String transmission of numbers supported with type: string, format: number | |

## CONFIG OPTIONS
These options may be applied as additional-properties (cli) or configOptions (plugins). Refer to [configuration docs](https://openapi-generator.tech/docs/configuration) for more details.

| Option | Description | Values | Default |
| ------ | ----------- | ------ | ------- |
|allowUnicodeIdentifiers|boolean, toggles whether unicode identifiers are allowed in names or not, default is false| |false|
|artifactDescription|artifact description in generated pom.xml| |OpenAPI Kotlin|
|artifactUrl|artifact URL in generated pom.xml| |https://github.com/openapi-json-schema-tools/openapi-json-schema-generator|
|artifactVersion|artifact version in generated pom.xml. This also becomes part of the generated library's filename| |1.0.0|
|developerEmail|developer email in generated pom.xml| |team@openapijsonschematools.org|
|developerName|developer name in generated pom.xml| |OpenAPI-Generator Contributors|
|developerOrganization|developer organization in generated pom.xml| |OpenAPITools.org|
|developerOrganizationUrl|developer organization URL in generated pom.xml| |http://openapijsonschematools.org|
|groupId|groupId in generated pom.xml| |org.openapijsonschematools|
|invokerPackage|root package for generated code| |org.openapijsonschematools.client|
|licenseName|The name of the license| |Unlicense|
|licenseUrl|The URL of the license| |http://unlicense.org|
|parentArtifactId|parent artifactId in generated pom N.B. parentGroupId, parentArtifactId and parentVersion must all be specified for any of them to take effect| |null|
|parentGroupId|parent groupId in generated pom N.B. parentGroupId, parentArtifactId and parentVersion must all be specified for any of them to take effect| |null|
|parentVersion|parent version in generated pom N.B. parentGroupId, parentArtifactId and parentVersion must all be specified for any of them to take effect| |null|
|scmConnection|SCM connection in generated pom.xml| |scm:git:git@github.com:openapi-json-schema-tools/openapi-json-schema-generator.git|
|scmDeveloperConnection|SCM developer connection in generated pom.xml| |scm:git:git@github.com:openapi-json-schema-tools/openapi-json-schema-generator.git|
|scmUrl|SCM URL in generated pom.xml| |https://github.com/openapi-json-schema-tools/openapi-json-schema-generator|
|snapshotVersion|Uses a SNAPSHOT version.|<dl><dt>**true**</dt><dd>Use a SnapShot Version</dd><dt>**false**</dt><dd>Use a Release Version</dd></dl>|null|
|sourceFolder|source folder for generated code| |src/main/kotlin|
|testOutput|Set output folder for models and APIs tests| |${project.build.directory}/generated-test-sources/openapi|

## SUPPORTED VENDOR EXTENSIONS

| Extension name | Description | Applicable for | Default value |
| -------------- | ----------- | -------------- | ------------- |
|x-enum-varnames|A list of strings that defines the enum variable names, must be adjacent to enum|SCHEMA|[]
|x-enum-descriptions|A list of strings that defines the enum descriptions, must be adjacent to enum|SCHEMA|[]


## INSTANTIATION TYPES

| Type/Alias | Instantiated By |
| ---------- | --------------- |
|array|FrozenList|
|boolean|Boolean|
|integer|Number (Int, Long, Float with integer values, Double with integer values)|
|null|Nothing? (null)|
|number|Number (Int, Long, Float, Double)|
|object|FrozenMap|
|string|String|


## LANGUAGE PRIMITIVES

<ul class="column-ul">
<li>Any</li>
<li>Boolean</li>
<li>Double</li>
<li>Float</li>
<li>Int</li>
<li>List</li>
<li>Long</li>
<li>Map</li>
<li>Nothing</li>
<li>String</li>
</ul>

## RESERVED WORDS

<ul class="column-ul">
<li>abstract</li>
<li>actual</li>
<li>annotation</li>
<li>apiresponse</li>
<li>as</li>
<li>break</li>
<li>class</li>
<li>companion</li>
<li>const</li>
<li>constructor</li>
<li>continue</li>
<li>contract</li>
<li>crossinline</li>
<li>data</li>
<li>delegate</li>
<li>do</li>
<li>dynamic</li>
<li>else</li>
<li>enum</li>
<li>expect</li>
<li>external</li>
<li>false</li>
<li>field</li>
<li>final</li>
<li>finally</li>
<li>for</li>
<li>fun</li>
<li>if</li>
<li>import</li>
<li>in</li>
<li>infix</li>
<li>init</li>
<li>inline</li>
<li>inner</li>
<li>interface</li>
<li>internal</li>
<li>is</li>
<li>it</li>
<li>lateinit</li>
<li>noinline</li>
<li>null</li>
<li>object</li>
<li>open</li>
<li>operator</li>
<li>out</li>
<li>override</li>
<li>package</li>
<li>param</li>
<li>private</li>
<li>property</li>
<li>protected</li>
<li>public</li>
<li>receiver</li>
<li>reified</li>
<li>return</li>
<li>sealed</li>
<li>setparam</li>
<li>super</li>
<li>suspend</li>
<li>tailrec</li>
<li>this</li>
<li>throw</li>
<li>tostring</li>
<li>true</li>
<li>try</li>
<li>typealias</li>
<li>typeof</li>
<li>val</li>
<li>value</li>
<li>var</li>
<li>vararg</li>
<li>when</li>
<li>where</li>
<li>while</li>
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
|responses|✗|OAS3
|parameters|✗|OAS3
|examples|✗|OAS3
|requestBodies|✗|OAS3
|headers|✗|OAS3
|securitySchemes|✗|OAS3
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
|Binary|✗|OAS2,OAS3
|Boolean|✓|OAS2,OAS3
|Date|✓|OAS2,OAS3
|DateTime|✓|OAS2,OAS3
|Password|✗|OAS2,OAS3
|File|✗|OAS2
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
|Security|✗|OAS2,OAS3
|ComponentSchemas|✓|OAS3
|ComponentResponses|✗|OAS3
|ComponentParameters|✗|OAS3
|ComponentRequestBodies|✗|OAS3
|ComponentHeaders|✗|OAS3
|ComponentSecuritySchemes|✗|OAS3
|ComponentLinks|✗|OAS3
|ComponentCallbacks|✗|OAS3
|ComponentPathItems|✗|OAS3
|Api|✗|ToolingExtension

### Global Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Info|✗|OAS2,OAS3
|Servers|✓|OAS3
|Paths|✗|OAS2,OAS3
|Webhooks|✗|OAS3
|Components|✓|OAS3
|Security|✗|OAS2,OAS3
|Tags|✗|OAS2,OAS3
|ExternalDocs|✗|OAS2,OAS3

### Operation Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Responses_HttpStatusCode|✗|OAS3
|Responses_RangedResponseCodes|✗|OAS3
|Responses_Default|✗|OAS3
|Responses_RedirectionResponse|✗|OAS3
|Security|✗|OAS2,OAS3
|Servers|✗|OAS3

### Parameter Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Name|✗|OAS2,OAS3
|Required|✗|OAS2,OAS3
|In_Path|✗|OAS2,OAS3
|In_Query|✗|OAS2,OAS3
|In_Header|✗|OAS2,OAS3
|In_Cookie|✗|OAS3
|Style_Matrix|✗|OAS3
|Style_Label|✗|OAS3
|Style_Form|✗|OAS3
|Style_Simple|✗|OAS3
|Style_SpaceDelimited|✗|OAS3
|Style_PipeDelimited|✗|OAS3
|Style_DeepObject|✗|OAS3
|Explode|✗|OAS3
|Schema|✗|OAS3
|Content|✗|OAS3

### Schema Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|AdditionalProperties|✓|OAS2,OAS3
|AllOf|✓|OAS2,OAS3
|AnyOf|✓|OAS3
|Const|✓|OAS3
|Contains|✓|OAS3
|Default|✓|OAS2,OAS3
|DependentRequired|✓|OAS3
|DependentSchemas|✓|OAS3
|Discriminator|✗|OAS2,OAS3
|Else|✓|OAS3
|Enum|✓|OAS2,OAS3
|ExclusiveMinimum|✓|OAS2,OAS3
|ExclusiveMaximum|✓|OAS2,OAS3
|Format|✓|OAS2,OAS3
|If|✓|OAS3
|Items|✓|OAS2,OAS3
|MaxContains|✓|OAS3
|MaxItems|✓|OAS2,OAS3
|MaxLength|✓|OAS2,OAS3
|MaxProperties|✓|OAS2,OAS3
|Maximum|✓|OAS2,OAS3
|MinContains|✓|OAS3
|MinItems|✓|OAS2,OAS3
|MinLength|✓|OAS2,OAS3
|MinProperties|✓|OAS2,OAS3
|Minimum|✓|OAS2,OAS3
|MultipleOf|✓|OAS2,OAS3
|Not|✓|OAS3
|Nullable|✓|OAS3
|OneOf|✓|OAS3
|Pattern|✓|OAS2,OAS3
|PatternProperties|✓|OAS3
|PrefixItems|✓|OAS3
|Properties|✓|OAS2,OAS3
|PropertyNames|✓|OAS3
|Ref|✓|OAS2,OAS3
|Required|✓|OAS2,OAS3
|Then|✓|OAS3
|Type|✓|OAS2,OAS3
|UnevaluatedItems|✓|OAS3
|UnevaluatedProperties|✓|OAS3
|UniqueItems|✓|OAS2,OAS3
|Xml|✗|OAS2,OAS3

### Security Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|HTTP_Basic|✗|OAS2,OAS3
|ApiKey|✗|OAS2,OAS3
|OpenIDConnect|✗|OAS3
|HTTP_Bearer|✗|OAS2,OAS3
|OAuth2_Implicit|✗|OAS2,OAS3
|OAuth2_Password|✗|OAS2,OAS3
|OAuth2_ClientCredentials|✗|OAS2,OAS3
|OAuth2_AuthorizationCode|✗|OAS2,OAS3

### Wire Format Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|JSON|✗|OAS2,OAS3
|XML|✗|OAS2,OAS3
|PROTOBUF|✗|ToolingExtension
|Custom|✗|OAS2,OAS3
