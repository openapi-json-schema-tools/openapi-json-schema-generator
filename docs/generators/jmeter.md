---
title: Documentation for the jmeter Generator
---

## METADATA

| Property | Value | Notes |
| -------- | ----- | ----- |
| generator name | jmeter | pass this to the generate command after -g |
| generator stability | STABLE | |
| generator type | CLIENT | |
| generator language | Java | |
| generator default templating engine | mustache | |
| helpTxt | Generates a JMeter .jmx file. | |

## CONFIG OPTIONS
These options may be applied as additional-properties (cli) or configOptions (plugins). Refer to [configuration docs](https://openapi-generator.tech/docs/configuration) for more details.

| Option | Description | Values | Default |
| ------ | ----------- | ------ | ------- |
|allowUnicodeIdentifiers|boolean, toggles whether unicode identifiers are allowed in names or not, default is false| |false|
|disallowAdditionalPropertiesIfNotPresent|If false, the 'additionalProperties' implementation (set to true by default) is compliant with the OAS and JSON schema specifications. If true (default), keep the old (incorrect) behaviour that 'additionalProperties' is set to false by default.|<dl><dt>**false**</dt><dd>The 'additionalProperties' implementation is compliant with the OAS and JSON schema specifications.</dd><dt>**true**</dt><dd>Keep the old (incorrect) behaviour that 'additionalProperties' is set to false by default.</dd></dl>|true|
|ensureUniqueParams|Whether to ensure parameter names are unique in an operation (rename parameters that are not).| |true|
|enumUnknownDefaultCase|If the server adds new enum cases, that are unknown by an old spec/client, the client will fail to parse the network response.With this option enabled, each enum will have a new case, 'unknown_default_open_api', so that when the server sends an enum case that is not known by the client/spec, they can safely fallback to this case.|<dl><dt>**false**</dt><dd>No changes to the enum's are made, this is the default option.</dd><dt>**true**</dt><dd>With this option enabled, each enum will have a new case, 'unknown_default_open_api', so that when the enum case sent by the server is not known by the client/spec, can safely be decoded to this case.</dd></dl>|false|
|legacyDiscriminatorBehavior|Set to false for generators with better support for discriminators. (Python, Java, Go, PowerShell, C#have this enabled by default).|<dl><dt>**true**</dt><dd>The mapping in the discriminator includes descendant schemas that allOf inherit from self and the discriminator mapping schemas in the OAS document.</dd><dt>**false**</dt><dd>The mapping in the discriminator includes any descendant schemas that allOf inherit from self, any oneOf schemas, any anyOf schemas, any x-discriminator-values, and the discriminator mapping schemas in the OAS document AND Codegen validates that oneOf and anyOf schemas contain the required discriminator and throws an error if the discriminator is missing.</dd></dl>|true|
|prependFormOrBodyParameters|Add form or body parameters to the beginning of the parameter list.| |false|
|sortModelPropertiesByRequiredFlag|Sort model properties to place required parameters before optional parameters.| |true|
|sortParamsByRequiredFlag|Sort method arguments to place required parameters before optional parameters.| |true|

## INSTANTIATION TYPES

| Type/Alias | Instantiated By |
| ---------- | --------------- |


## LANGUAGE PRIMITIVES

<ul class="column-ul">
</ul>

## RESERVED WORDS

<ul class="column-ul">
<li>sample1</li>
<li>sample2</li>
</ul>

## FEATURE SET


### Client Modification Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|BasePath|✓|ToolingExtension
|Authorizations|✗|ToolingExtension
|UserAgent|✗|ToolingExtension
|MockServer|✗|ToolingExtension

### Components Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|schemas|✗|OAS3
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
|Integer|✗|OAS2,OAS3
|Float|✓|OAS2,OAS3
|Double|✓|OAS2,OAS3
|Number|✗|OAS2,OAS3
|String|✓|OAS2,OAS3
|Byte|✓|OAS2,OAS3
|Binary|✓|OAS2,OAS3
|Boolean|✓|OAS2,OAS3
|Date|✓|OAS2,OAS3
|DateTime|✓|OAS2,OAS3
|Password|✓|OAS2,OAS3
|File|✓|OAS2
|Uuid|✗|OAS2,OAS3
|Array|✓|OAS2,OAS3
|Null|✗|OAS3
|AnyType|✗|OAS2,OAS3
|Object|✓|OAS2,OAS3
|Enum|✓|OAS2,OAS3

### Documentation Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Readme|✗|ToolingExtension
|Servers|✗|OAS3
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
|Api|✓|ToolingExtension

### Global Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Info|✓|OAS2,OAS3
|Servers|✗|OAS3
|Paths|✗|OAS2,OAS3
|Webhooks|✗|OAS3
|Components|✓|OAS3
|Security|✗|OAS2,OAS3
|Tags|✗|OAS2,OAS3
|ExternalDocs|✗|OAS2,OAS3

### Operation Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Responses_HttpStatusCode|✓|OAS2,OAS3
|Responses_RangedResponseCodes|✗|OAS2,OAS3
|Responses_Default|✓|OAS2,OAS3

### Parameter Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Name|✗|OAS2,OAS3
|Required|✗|OAS2,OAS3
|In_Path|✓|OAS2,OAS3
|In_Query|✓|OAS2,OAS3
|In_Header|✓|OAS2,OAS3
|In_Cookie|✓|OAS3
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
|AdditionalProperties|✗|OAS2,OAS3
|AllOf|✗|OAS2,OAS3
|AnyOf|✗|OAS3
|Default|✗|OAS2,OAS3
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
|Not|✗|OAS3
|Nullable|✗|OAS3
|OneOf|✗|OAS3
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
|HTTP_Bearer|✗|OAS2,OAS3
|OAuth2_Implicit|✓|OAS2,OAS3
|OAuth2_Password|✗|OAS2,OAS3
|OAuth2_ClientCredentials|✗|OAS2,OAS3
|OAuth2_AuthorizationCode|✗|OAS2,OAS3

### Wire Format Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|JSON|✓|OAS2,OAS3
|XML|✓|OAS2,OAS3
|PROTOBUF|✗|ToolingExtension
|Custom|✗|OAS2,OAS3
