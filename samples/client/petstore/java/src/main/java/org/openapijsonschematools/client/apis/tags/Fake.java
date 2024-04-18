package org.openapijsonschematools.client.apis.tags;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakejsonpatch.FakejsonpatchPatch;
import org.openapijsonschematools.client.paths.fakerefsarrayofenums.FakerefsarrayofenumsPost;
import org.openapijsonschematools.client.paths.commonparamsubdir.CommonparamsubdirDelete;
import org.openapijsonschematools.client.paths.commonparamsubdir.CommonparamsubdirGet;
import org.openapijsonschematools.client.paths.commonparamsubdir.CommonparamsubdirPost;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.FakecasesensitiveparamsPut;
import org.openapijsonschematools.client.paths.fakewildcardresponses.FakewildcardresponsesGet;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.FakebodywithqueryparamsPut;
import org.openapijsonschematools.client.paths.fakejsonwithcharset.FakejsonwithcharsetPost;
import org.openapijsonschematools.client.paths.fakerefsarraymodel.FakerefsarraymodelPost;
import org.openapijsonschematools.client.paths.fakehealth.FakehealthGet;
import org.openapijsonschematools.client.paths.fakerefscomposedoneofnumberwithvalidations.FakerefscomposedoneofnumberwithvalidationsPost;
import org.openapijsonschematools.client.paths.fakerefobjinquery.FakerefobjinqueryGet;
import org.openapijsonschematools.client.paths.fakebodywithfileschema.FakebodywithfileschemaPut;
import org.openapijsonschematools.client.paths.fakerefsenum.FakerefsenumPost;
import org.openapijsonschematools.client.paths.fakeredirection.FakeredirectionGet;
import org.openapijsonschematools.client.paths.fakeuploadfile.FakeuploadfilePost;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.FakeinlinecompositionPost;
import org.openapijsonschematools.client.paths.fake.FakeDelete;
import org.openapijsonschematools.client.paths.fake.FakeGet;
import org.openapijsonschematools.client.paths.fake.FakePatch;
import org.openapijsonschematools.client.paths.fake.FakePost;
import org.openapijsonschematools.client.paths.fakerefsobjectmodelwithrefprops.FakerefsobjectmodelwithrefpropsPost;
import org.openapijsonschematools.client.paths.fakepemcontenttype.FakepemcontenttypeGet;
import org.openapijsonschematools.client.paths.fakerefsnumber.FakerefsnumberPost;
import org.openapijsonschematools.client.paths.fakerefsstring.FakerefsstringPost;
import org.openapijsonschematools.client.paths.fakeinlineadditionalproperties.FakeinlineadditionalpropertiesPost;
import org.openapijsonschematools.client.paths.fakerefsmammal.FakerefsmammalPost;
import org.openapijsonschematools.client.paths.solidus.SolidusGet;
import org.openapijsonschematools.client.paths.fakerefsboolean.FakerefsbooleanPost;
import org.openapijsonschematools.client.paths.fakejsonformdata.FakejsonformdataGet;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.Fakeparametercollisions1ababselfabPost;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.FakequeryparamwithjsoncontenttypeGet;
import org.openapijsonschematools.client.paths.fakeobjinquery.FakeobjinqueryGet;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.FakemultiplesecuritiesGet;
import org.openapijsonschematools.client.paths.faketestqueryparamters.FaketestqueryparamtersPut;
import org.openapijsonschematools.client.paths.fakemultipleresponsebodies.FakemultipleresponsebodiesGet;
import org.openapijsonschematools.client.paths.fakeresponsewithoutschema.FakeresponsewithoutschemaGet;
import org.openapijsonschematools.client.paths.fakemultiplerequestbodycontenttypes.FakemultiplerequestbodycontenttypesPost;
import org.openapijsonschematools.client.paths.fakeuploaddownloadfile.FakeuploaddownloadfilePost;
import org.openapijsonschematools.client.paths.fakeuploadfiles.FakeuploadfilesPost;
import org.openapijsonschematools.client.paths.fakeadditionalpropertieswitharrayofenums.FakeadditionalpropertieswitharrayofenumsGet;
import org.openapijsonschematools.client.paths.fakedeletecoffeeid.FakedeletecoffeeidDelete;

public class Fake extends ApiClient implements
    FakejsonpatchPatch.JsonPatchOperation,
    FakerefsarrayofenumsPost.ArrayOfEnumsOperation,
    CommonparamsubdirDelete.DeleteCommonParamOperation,
    CommonparamsubdirGet.GetCommonParamOperation,
    CommonparamsubdirPost.PostCommonParamOperation,
    FakecasesensitiveparamsPut.CaseSensitiveParamsOperation,
    FakewildcardresponsesGet.WildCardResponsesOperation,
    FakebodywithqueryparamsPut.BodyWithQueryParamsOperation,
    FakejsonwithcharsetPost.JsonWithCharsetOperation,
    FakerefsarraymodelPost.ArrayModelOperation,
    FakehealthGet.FakeHealthGetOperation,
    FakerefscomposedoneofnumberwithvalidationsPost.ComposedOneOfDifferentTypesOperation,
    FakerefobjinqueryGet.RefObjectInQueryOperation,
    FakebodywithfileschemaPut.BodyWithFileSchemaOperation,
    FakerefsenumPost.StringEnumOperation,
    FakeredirectionGet.RedirectionOperation,
    FakeuploadfilePost.UploadFileOperation,
    FakeinlinecompositionPost.InlineCompositionOperation,
    FakeDelete.GroupParametersOperation,
    FakeGet.EnumParametersOperation,
    FakePatch.ClientModelOperation,
    FakePost.EndpointParametersOperation,
    FakerefsobjectmodelwithrefpropsPost.ObjectModelWithRefPropsOperation,
    FakepemcontenttypeGet.PemContentTypeOperation,
    FakerefsnumberPost.NumberWithValidationsOperation,
    FakerefsstringPost.StringOperation,
    FakeinlineadditionalpropertiesPost.InlineAdditionalPropertiesOperation,
    FakerefsmammalPost.MammalOperation,
    SolidusGet.SlashRouteOperation,
    FakerefsbooleanPost.BooleanOperation,
    FakejsonformdataGet.JsonFormDataOperation,
    Fakeparametercollisions1ababselfabPost.ParameterCollisionsOperation,
    FakequeryparamwithjsoncontenttypeGet.QueryParamWithJsonContentTypeOperation,
    FakeobjinqueryGet.ObjectInQueryOperation,
    FakemultiplesecuritiesGet.MultipleSecuritiesOperation,
    FaketestqueryparamtersPut.QueryParameterCollectionFormatOperation,
    FakemultipleresponsebodiesGet.MultipleResponseBodiesOperation,
    FakeresponsewithoutschemaGet.ResponseWithoutSchemaOperation,
    FakemultiplerequestbodycontenttypesPost.MultipleRequestBodyContentTypesOperation,
    FakeuploaddownloadfilePost.UploadDownloadFileOperation,
    FakeuploadfilesPost.UploadFilesOperation,
    FakeadditionalpropertieswitharrayofenumsGet.AdditionalPropertiesWithArrayOfEnumsOperation,
    FakedeletecoffeeidDelete.DeleteCoffeeOperation
{
    public Fake(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}