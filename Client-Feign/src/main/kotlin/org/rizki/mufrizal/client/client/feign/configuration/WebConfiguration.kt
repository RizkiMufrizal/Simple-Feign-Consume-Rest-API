package org.rizki.mufrizal.client.client.feign.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

/**
 * Created by rizkimufrizal on 5/25/17.
 */
@Configuration
class WebConfiguration : WebMvcConfigurerAdapter() {
    override fun addInterceptors(interceptorRegistry: InterceptorRegistry?) {
        interceptorRegistry?.addInterceptor(AuthenticationInterceptor())
    }
}