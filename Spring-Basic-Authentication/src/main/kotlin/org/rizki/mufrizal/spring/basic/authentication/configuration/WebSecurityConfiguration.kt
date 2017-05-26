package org.rizki.mufrizal.spring.basic.authentication.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

/**
 * Created by rizkimufrizal on 5/25/17.
 */
@Configuration
@EnableWebSecurity(debug = true)
class WebSecurityConfiguration : WebSecurityConfigurerAdapter() {

    override fun configure(authenticationManagerBuilder: AuthenticationManagerBuilder?) {
        authenticationManagerBuilder?.inMemoryAuthentication()
                ?.withUser("rizki")
                ?.password("mufrizal")
                ?.roles("USER")
    }

    override fun configure(httpSecurity: HttpSecurity?) {
        httpSecurity
                ?.authorizeRequests()
                ?.antMatchers("/login")?.permitAll()
                ?.anyRequest()
                ?.fullyAuthenticated()
                ?.and()
                ?.httpBasic()
                ?.and()
                ?.csrf()?.disable()
    }

}