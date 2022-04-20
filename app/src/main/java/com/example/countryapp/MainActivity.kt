package com.example.countryapp

import GetCountriesQuery
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.coroutines.await
import com.apollographql.apollo.exception.ApolloException
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

class MainActivity : AppCompatActivity() {

    lateinit var activity: MainActivity
    private val BASE_URL = "https://countries.trevorblades.com"
    private lateinit var client: ApolloClient


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity = this
        setContentView(R.layout.activity_main)
        client = setUpApolloClient()
        
        client.query(
            GetCountriesQuery()
        ).enqueue(object : ApolloCall.Callback<GetCountriesQuery.Data>() {
            override fun onFailure(e: ApolloException) {

            }

            override fun onResponse(response: Response<GetCountriesQuery.Data>) {

            }

        })

    }

    /**
     * Basic set up for graphql API, OkHttp is used for graphql with apollo client
     */
    private fun setUpApolloClient(): ApolloClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttp = OkHttpClient
            .Builder()
            .addInterceptor(logging)
        return ApolloClient.builder()
            .serverUrl(BASE_URL)
            .okHttpClient(okHttp.build())
            .build()
    }

}