package org.openapijsonschematools.client.apis.tags;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.userlogout.Get;
import org.openapijsonschematools.client.paths.usercreatewitharray.Post;
import org.openapijsonschematools.client.paths.user.Post;
import org.openapijsonschematools.client.paths.userlogin.Get;
import org.openapijsonschematools.client.paths.userusername.Delete;
import org.openapijsonschematools.client.paths.userusername.Get;
import org.openapijsonschematools.client.paths.userusername.Put;
import org.openapijsonschematools.client.paths.usercreatewithlist.Post;

public class UserApi extends ApiClient implements
    Get.LogoutUserOperation
    Post.CreateUsersWithArrayInputOperation
    Post.CreateUserOperation
    Get.LoginUserOperation
    Delete.DeleteUserOperation,
    Get.GetUserByNameOperation,
    Put.UpdateUserOperation
    Post.CreateUsersWithListInputOperation
{
    public UserApi(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}