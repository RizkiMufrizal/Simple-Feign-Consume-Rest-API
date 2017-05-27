package org.rizki.mufrizal.client.client.feign.domain

import java.math.BigDecimal

/**
 * Created by rizkimufrizal on 5/27/17.
 */

enum class JenisBarang {
    cair, pada, gas
}

data class Barang(val idBarang: String? = null, val namaBarang: String? = null, val jumlahBarang: Int? = null, val jenisBarang: JenisBarang? = null, val hargaBarang: BigDecimal? = null)