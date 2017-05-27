package org.rizki.mufrizal.client.client.feign.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import javax.servlet.http.HttpSession

/**
 * Created by rizkimufrizal on 5/25/17.
 */
@Controller
class IndexController {

    @GetMapping(value = "/")
    fun index(httpSession: HttpSession, model: Model): String {
        model.addAttribute("username", httpSession.getAttribute("username"))
        return "index"
    }

}