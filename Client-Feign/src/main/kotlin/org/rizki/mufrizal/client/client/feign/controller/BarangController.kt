package org.rizki.mufrizal.client.client.feign.controller

import org.rizki.mufrizal.client.client.feign.helpers.FeignHelper
import org.rizki.mufrizal.client.client.feign.restclient.BarangServiceClient
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import javax.servlet.http.HttpSession

/**
 * Created by rizkimufrizal on 5/27/17.
 */
@Controller
class BarangController {

    var barangServiceClient: BarangServiceClient? = null

    @GetMapping(value = "/barang")
    fun getLoginForm(model: Model, httpSession: HttpSession): String {
        barangServiceClient = FeignHelper.feignBuilderBasicAuthentication(BarangServiceClient::class.java, httpSession.getAttribute("username").toString(), httpSession.getAttribute("password").toString())
        model.addAttribute("barangs", barangServiceClient?.getBarangs())
        model.addAttribute("username", httpSession.getAttribute("username"))
        return "barang"
    }

}