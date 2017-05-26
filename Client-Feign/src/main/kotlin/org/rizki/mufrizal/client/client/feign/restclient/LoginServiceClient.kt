package org.rizki.mufrizal.client.client.feign.restclient

import feign.Headers
import feign.RequestLine
import org.rizki.mufrizal.client.client.feign.domain.User

/**
 * Created by rizkimufrizal on 5/25/17.
 */
interface LoginServiceClient {
    @RequestLine("POST /login")
    @Headers("Content-Type: application/json")
    fun postLogin(user: User): Map<String, Boolean>
}