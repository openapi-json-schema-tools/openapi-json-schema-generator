package org.openapijsonschematools.client.apis.tags;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.userlogout.UserlogoutGet;
import org.openapijsonschematools.client.paths.usercreatewitharray.UsercreatewitharrayPost;
import org.openapijsonschematools.client.paths.user.UserPost;
import org.openapijsonschematools.client.paths.userlogin.UserloginGet;
import org.openapijsonschematools.client.paths.userusername.UserusernameDelete;
import org.openapijsonschematools.client.paths.userusername.UserusernameGet;
import org.openapijsonschematools.client.paths.userusername.UserusernamePut;
import org.openapijsonschematools.client.paths.usercreatewithlist.UsercreatewithlistPost;

public class User extends ApiClient implements
    UserlogoutGet.LogoutUserOperation,
    UsercreatewitharrayPost.CreateUsersWithArrayInputOperation,
    UserPost.CreateUserOperation,
    UserloginGet.LoginUserOperation,
    UserusernameDelete.DeleteUserOperation,
    UserusernameGet.GetUserByNameOperation,
    UserusernamePut.UpdateUserOperation,
    UsercreatewithlistPost.CreateUsersWithListInputOperation
{
    public User(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}