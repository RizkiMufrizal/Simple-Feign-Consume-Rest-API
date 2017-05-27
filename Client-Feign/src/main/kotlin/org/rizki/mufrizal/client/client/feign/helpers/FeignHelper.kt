package org.rizki.mufrizal.client.client.feign.helpers

import feign.Feign
import feign.auth.BasicAuthRequestInterceptor
import feign.codec.ErrorDecoder
import feign.jackson.JacksonDecoder
import feign.jackson.JacksonEncoder

/**
 * Created by rizkimufrizal on 5/25/17.
 */

class FeignHelper {
    companion object {
        fun <T> feignBuilder(clz: Class<T>): T = Feign.builder().encoder(JacksonEncoder()).decoder(JacksonDecoder()).target(clz, "http://localhost:8081")
        fun <T> feignBuilderBasicAuthentication(clz: Class<T>, username: String, password: String): T = Feign.builder().encoder(JacksonEncoder()).decoder(JacksonDecoder()).requestInterceptor(BasicAuthRequestInterceptor(username, password)).target(clz, "http://localhost:8081")
    }
}