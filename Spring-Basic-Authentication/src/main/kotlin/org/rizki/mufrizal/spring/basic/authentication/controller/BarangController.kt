package org.rizki.mufrizal.spring.basic.authentication.controller

import org.rizki.mufrizal.spring.basic.authentication.domain.Barang
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

/**
 * Created by rizkimufrizal on 5/25/17.
 */
@RestController
@RequestMapping(value = "/api")
class BarangController {

    companion object {
        @JvmStatic var barangs = ArrayList<Barang>()
    }

    @GetMapping(value = "/barangs")
    fun getBarangs(): ResponseEntity<*> = ResponseEntity(barangs, HttpStatus.OK)

}