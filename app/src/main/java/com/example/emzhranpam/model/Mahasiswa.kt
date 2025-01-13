package com.example.emzhranpam.model

data class Mahasiswa(
    val nim: String,
    val nama: String,
    val alamat: String,
    val kelas: String,
    val gender: String,
    val angkatan: String,
    val judulskripsi: String,
    val DB1: String,
    val DB2: String
){
    constructor(): this("","","","","","","","","")
}
