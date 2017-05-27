package org.rizki.mufrizal.client.client.feign.restclient

import feign.Headers
import feign.RequestLine
import org.rizki.mufrizal.client.client.feign.domain.Barang

/**
 * Created by rizkimufrizal on 5/27/17.
 */
interface BarangServiceClient {
    @RequestLine("GET /api/barangs")
    @Headers("Content-Type: application/json")
    fun getBarangs(): List<Barang>
}