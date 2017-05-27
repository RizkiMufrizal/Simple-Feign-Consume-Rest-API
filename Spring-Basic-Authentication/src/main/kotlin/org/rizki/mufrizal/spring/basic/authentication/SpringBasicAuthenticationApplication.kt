package org.rizki.mufrizal.spring.basic.authentication

import org.rizki.mufrizal.spring.basic.authentication.controller.BarangController
import org.rizki.mufrizal.spring.basic.authentication.domain.Barang
import org.rizki.mufrizal.spring.basic.authentication.domain.JenisBarang
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.math.BigDecimal

@SpringBootApplication
class SpringBasicAuthenticationApplication {
    @Bean
    fun runner(): CommandLineRunner {
        return CommandLineRunner {
            for (i in 0..10) {
                BarangController.barangs.add(Barang(
                        idBarang = "B00$i",
                        hargaBarang = BigDecimal(i + 1000),
                        jenisBarang = if (i % 2 == 0) JenisBarang.cair else JenisBarang.padat,
                        jumlahBarang = i + 10,
                        namaBarang = "Barang-00$i"
                ))
            }
        }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringBasicAuthenticationApplication::class.java, *args)
}
