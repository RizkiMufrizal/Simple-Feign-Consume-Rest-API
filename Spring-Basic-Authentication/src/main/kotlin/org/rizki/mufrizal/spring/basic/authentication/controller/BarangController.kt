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

    var barangs = ArrayList<Barang>()

    @GetMapping(value = "/barangs")
    fun getBarangs(): ResponseEntity<*> = ResponseEntity(barangs, HttpStatus.OK)

    @PostMapping(value = "/barangs")
    fun postBarang(@RequestBody barang: Barang): ResponseEntity<*> {
        this.barangs.add(barang)
        return ResponseEntity(barang, HttpStatus.CREATED)
    }

}