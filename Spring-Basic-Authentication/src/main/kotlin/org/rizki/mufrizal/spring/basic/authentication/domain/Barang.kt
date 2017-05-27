package org.rizki.mufrizal.spring.basic.authentication.domain

import java.math.BigDecimal

/**
 * Created by rizkimufrizal on 5/25/17.
 */

enum class JenisBarang {
    cair, pada, gas
}

data class Barang(val idBarang: String? = null, val namaBarang: String? = null, val jumlahBarang: Int? = null, val jenisBarang: JenisBarang? = null, val hargaBarang: BigDecimal? = null)