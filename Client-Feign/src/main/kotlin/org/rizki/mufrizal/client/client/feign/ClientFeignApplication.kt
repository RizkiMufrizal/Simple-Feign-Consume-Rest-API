package org.rizki.mufrizal.client.client.feign

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ClientFeignApplication

fun main(args: Array<String>) {
    SpringApplication.run(ClientFeignApplication::class.java, *args)
}
