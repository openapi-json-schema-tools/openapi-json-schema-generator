package org.openapijsonschematools.client.exceptions

import java.net.http.HttpResponse

class ApiException(s: String?, val response: HttpResponse<ByteArray>) : BaseException(s)