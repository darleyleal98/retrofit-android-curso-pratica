package com.darleyleal.retrofitandroid

import retrofit2.Call
import retrofit2.http.GET

interface PostService {

    @GET("posts")
    fun listarPostagens(): Call<List<PostModel>>
}