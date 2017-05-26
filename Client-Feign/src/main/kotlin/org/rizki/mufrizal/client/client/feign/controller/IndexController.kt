package org.rizki.mufrizal.client.client.feign.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 * Created by rizkimufrizal on 5/25/17.
 */
@Controller
class IndexController {

    @GetMapping(value = "/")
    fun index(): String = "index"

}