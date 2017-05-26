package org.rizki.mufrizal.spring.basic.authentication.controller

import org.rizki.mufrizal.spring.basic.authentication.domain.User
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

/**
 * Created by rizkimufrizal on 5/25/17.
 */
@RestController
class LoginController {

    @PostMapping(value = "/login")
    fun postLogin(@RequestBody user: User): ResponseEntity<*> {
        val map = hashMapOf<String, Any>()
        if (user.username == "rizki" && user.password == "mufrizal") {
            map.put("Success", true)
            return ResponseEntity(map, HttpStatus.OK)
        } else {
            map.put("Success", false)
            return ResponseEntity(map, HttpStatus.UNAUTHORIZED)
        }
    }

}