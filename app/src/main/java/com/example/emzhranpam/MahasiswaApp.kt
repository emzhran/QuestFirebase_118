package com.example.emzhranpam

import android.app.Application
import com.example.emzhranpam.di.MahasiswaContainer

class MahasiswaApp : Application(){
    lateinit var containerApp: MahasiswaContainer
    override fun onCreate(){
        super.onCreate()
        containerApp = MahasiswaContainer(this)
    }
}