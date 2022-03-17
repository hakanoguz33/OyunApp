package com.example.csTasarim.repository

import com.example.csTasarim.api.RetrofitInstance
import com.example.csTasarim.models.Post

class Repository {
    suspend fun getPost() :Post{
        return RetrofitInstance.api.getPost()
    }
}