package org.rizki.mufrizal.client.client.feign.controller

import org.rizki.mufrizal.client.client.feign.domain.User
import org.rizki.mufrizal.client.client.feign.helpers.FeignHelper
import org.rizki.mufrizal.client.client.feign.restclient.LoginServiceClient
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import javax.servlet.http.HttpSession

/**
 * Created by rizkimufrizal on 5/25/17.
 */
@Controller
class LoginController {

    @GetMapping(value = "/login")
    fun getLoginForm(model: Model): String {
        model.addAttribute("user", User())
        return "login"
    }

    @PostMapping(value = "/login")
    fun postLoginForm(@ModelAttribute("user") user: User, httpSession: HttpSession): String {
        val loginServiceClient: LoginServiceClient = FeignHelper.feignBuilder(LoginServiceClient::class.java)
        if (loginServiceClient.postLogin(User(username = user.username, password = user.password))["Success"] as Boolean) {
            httpSession.setAttribute("UserSession", true)
            return "redirect:/"
        } else {
            return "login"
        }
    }
}