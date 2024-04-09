package org.openapijsonschematools.client.apis.tags;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakejsonpatch.Patch;
import org.openapijsonschematools.client.paths.fakerefsarrayofenums.Post;
import org.openapijsonschematools.client.paths.commonparamsubdir.Delete;
import org.openapijsonschematools.client.paths.commonparamsubdir.Get;
import org.openapijsonschematools.client.paths.commonparamsubdir.Post;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.Put;
import org.openapijsonschematools.client.paths.fakewildcardresponses.Get;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.Put;
import org.openapijsonschematools.client.paths.fakejsonwithcharset.Post;
import org.openapijsonschematools.client.paths.fakerefsarraymodel.Post;
import org.openapijsonschematools.client.paths.fakehealth.Get;
import org.openapijsonschematools.client.paths.fakerefscomposedoneofnumberwithvalidations.Post;
import org.openapijsonschematools.client.paths.fakerefobjinquery.Get;
import org.openapijsonschematools.client.paths.fakebodywithfileschema.Put;
import org.openapijsonschematools.client.paths.fakerefsenum.Post;
import org.openapijsonschematools.client.paths.fakeredirection.Get;
import org.openapijsonschematools.client.paths.fakeuploadfile.Post;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.Post;
import org.openapijsonschematools.client.paths.fake.Delete;
import org.openapijsonschematools.client.paths.fake.Get;
import org.openapijsonschematools.client.paths.fake.Patch;
import org.openapijsonschematools.client.paths.fake.Post;
import org.openapijsonschematools.client.paths.fakerefsobjectmodelwithrefprops.Post;
import org.openapijsonschematools.client.paths.fakepemcontenttype.Get;
import org.openapijsonschematools.client.paths.fakerefsnumber.Post;
import org.openapijsonschematools.client.paths.fakerefsstring.Post;
import org.openapijsonschematools.client.paths.fakeinlineadditionalproperties.Post;
import org.openapijsonschematools.client.paths.fakerefsmammal.Post;
import org.openapijsonschematools.client.paths.solidus.Get;
import org.openapijsonschematools.client.paths.fakerefsboolean.Post;
import org.openapijsonschematools.client.paths.fakejsonformdata.Get;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.Post;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.Get;
import org.openapijsonschematools.client.paths.fakeobjinquery.Get;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.Get;
import org.openapijsonschematools.client.paths.faketestqueryparamters.Put;
import org.openapijsonschematools.client.paths.fakemultipleresponsebodies.Get;
import org.openapijsonschematools.client.paths.fakeresponsewithoutschema.Get;
import org.openapijsonschematools.client.paths.fakemultiplerequestbodycontenttypes.Post;
import org.openapijsonschematools.client.paths.fakeuploaddownloadfile.Post;
import org.openapijsonschematools.client.paths.fakeuploadfiles.Post;
import org.openapijsonschematools.client.paths.fakeadditionalpropertieswitharrayofenums.Get;
import org.openapijsonschematools.client.paths.fakedeletecoffeeid.Delete;

public class Fake extends ApiClient implements
    Patch.JsonPatchOperation
    Post.ArrayOfEnumsOperation
    Delete.DeleteCommonParamOperation,
    Get.GetCommonParamOperation,
    Post.PostCommonParamOperation
    Put.CaseSensitiveParamsOperation
    Get.WildCardResponsesOperation
    Put.BodyWithQueryParamsOperation
    Post.JsonWithCharsetOperation
    Post.ArrayModelOperation
    Get.FakeHealthGetOperation
    Post.ComposedOneOfDifferentTypesOperation
    Get.RefObjectInQueryOperation
    Put.BodyWithFileSchemaOperation
    Post.StringEnumOperation
    Get.RedirectionOperation
    Post.UploadFileOperation
    Post.InlineCompositionOperation
    Delete.GroupParametersOperation,
    Get.EnumParametersOperation,
    Patch.ClientModelOperation,
    Post.EndpointParametersOperation
    Post.ObjectModelWithRefPropsOperation
    Get.PemContentTypeOperation
    Post.NumberWithValidationsOperation
    Post.ModelStringOperation
    Post.InlineAdditionalPropertiesOperation
    Post.MammalOperation
    Get.SlashRouteOperation
    Post.ModelBooleanOperation
    Get.JsonFormDataOperation
    Post.ParameterCollisionsOperation
    Get.QueryParamWithJsonContentTypeOperation
    Get.ObjectInQueryOperation
    Get.MultipleSecuritiesOperation
    Put.QueryParameterCollectionFormatOperation
    Get.MultipleResponseBodiesOperation
    Get.ResponseWithoutSchemaOperation
    Post.MultipleRequestBodyContentTypesOperation
    Post.UploadDownloadFileOperation
    Post.UploadFilesOperation
    Get.AdditionalPropertiesWithArrayOfEnumsOperation
    Delete.DeleteCoffeeOperation
{
    public Fake(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}