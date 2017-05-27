package org.rizki.mufrizal.client.client.feign.controller

import feign.FeignException
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
class AuthenticationController {

    @GetMapping(value = "/login")
    fun getLoginForm(model: Model): String {
        model.addAttribute("user", User())
        return "login"
    }

    @PostMapping(value = "/login")
    fun postLoginForm(@ModelAttribute("user") user: User, httpSession: HttpSession): String {
        val loginServiceClient: LoginServiceClient = FeignHelper.feignBuilder(LoginServiceClient::class.java)
        try {
            val login = loginServiceClient.postLogin(User(username = user.username, password = user.password))
            if (login["Success"] as Boolean) {
                httpSession.setAttribute("UserSession", true)
                httpSession.setAttribute("username", user.username)
                httpSession.setAttribute("password", user.password)
                return "redirect:/"
            } else {
                return "redirect:/login?error"
            }
        } catch (e: FeignException) {
            if (e.status() == 401) {
                return "redirect:/login?error"
            }
        }
        return "redirect:/login"
    }

    @GetMapping(value = "/logout")
    fun logout(httpSession: HttpSession): String {
        httpSession.invalidate()
        return "redirect:/login?logout"
    }
}