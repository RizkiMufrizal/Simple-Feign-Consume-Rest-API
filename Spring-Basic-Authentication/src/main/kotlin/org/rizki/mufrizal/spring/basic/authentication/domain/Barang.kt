package org.rizki.mufrizal.spring.basic.authentication.domain

import java.util.Date
import kotlin.reflect.KClass

/**
 * Created by rizkimufrizal on 5/25/17.
 */

enum class JenisBarang {
    cair, pada, gas
}

data class Barang(val idBarang: String? = null, val namaBarang: String? = null, val jumlahBarang: Int? = null, val tanggalKadaluarsa: Date? = null, val jenisBarang: JenisBarang? = null)