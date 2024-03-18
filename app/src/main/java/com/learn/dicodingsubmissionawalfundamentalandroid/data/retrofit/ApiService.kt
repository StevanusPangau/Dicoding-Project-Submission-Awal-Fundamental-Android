package com.learn.dicodingsubmissionawalfundamentalandroid.data.retrofit

import com.learn.dicodingsubmissionawalfundamentalandroid.BuildConfig
import com.learn.dicodingsubmissionawalfundamentalandroid.data.response.UsersResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("search/users?q={username}")
    @Headers("Authorization: token ${BuildConfig.API_KEY}")
    fun getUsers(
        @Path("username") username: String
    ): Call<UsersResponse>

    @GET("users/{username}")
    @Headers("Authorization: token ${BuildConfig.API_KEY}")
    fun getDetailUser(
        @Path("username") username: String
    ): Call<UsersResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token ${BuildConfig.API_KEY}")
    fun getFollowers(
        @Path("username") username: String
    ): Call<UsersResponse>

    @GET("users/{username}/following")
    @Headers("Authorization: token ${BuildConfig.API_KEY}")
    fun getFollowing(
        @Path("username") username: String
    ): Call<UsersResponse>
}