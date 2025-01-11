package com.example.emzhranpam.ui.viewmodel

import com.example.emzhranpam.model.Mahasiswa


data class FormErrorState(
    val nim: String? = null,
    val nama: String? = null,
    val jeniskelamin: String? = null,
    val alamat: String? = null,
    val kelas: String? = null,
    val angkatan: String? = null,
){
    fun isValid():Boolean{
        return nim == null && nama == null && jeniskelamin == null
                && alamat == null && kelas == null && angkatan == null
    }
}

data class MahasiswaEvent(
    val nim: String = "",
    val nama: String = "",
    val jeniskelamin: String = "",
    val alamat: String = "",
    val kelas: String = "",
    val angkatan: String = ""
)

fun MahasiswaEvent.toMhsModel(): Mahasiswa = Mahasiswa(
    nim = nim,
    nama = nama,
    jeniskelamin = jeniskelamin,
    alamat = alamat,
    kelas = kelas,
    angkatan = angkatan
)
