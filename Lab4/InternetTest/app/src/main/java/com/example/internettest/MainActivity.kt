package com.example.internettest

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import okhttp3.*
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL
import java.util.logging.Level
import java.util.logging.Logger
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val url: String = "https://api.flickr.com/services/rest/?method=flickr.photos.search&api_key=ff49fcd4d4a08aa6aafb6ea3de826464&tags=cat&format=json&nojsoncallback=1"
        val button1: Button = findViewById(R.id.btnHTTP)
        val buttonOkHttp: Button = findViewById(R.id.btnOkHTTP)
        button1.setOnClickListener {
            thread {
                val s = getConnection1(url)
                Log.d("Flickr Cats",s.toString())
            }
        }
        buttonOkHttp.setOnClickListener {
            thread {
                val o = getOktHttp(url)
                Log.i("Flickr OkCats",o.toString())
            }
        }
    }
    private  fun getOktHttp(url: String,TimeOut: Int = 1000):String? {
        val u = URL(url)
        val client: OkHttpClient = OkHttpClient()
        val request: Request = Request.Builder().url(url).build()
        try {
            val response: Response = client.newCall(request).execute()
            return response.body!!.string()
        }catch (ex: Exception){
            ex.printStackTrace()
        }
        return null
    }


    private fun getConnection1(url: String, TimeOut: Int = 1000): String? {
        var c: HttpURLConnection? = null
        try {
            val v = URL(url)
            c = v.openConnection() as HttpURLConnection
            c.setRequestMethod("GET")
            c.setRequestProperty("Content-lenght", "0")
            c.setUseCaches(false)
            c.setAllowUserInteraction(false)
            c.setConnectTimeout(TimeOut)
            c.setReadTimeout(TimeOut)
            c.connect()
            val status: Int = c.getResponseCode()
            when (status) {
                200, 201 -> {
                    val streamReader = InputStreamReader(c.inputStream)
                    var text: String
                    streamReader.use {
                        text = it.readText()
                    }
                    return text
                }
            }
        } catch (ex: MalformedURLException) {
            Logger.getLogger(javaClass.name).log(Level.SEVERE, null, ex)
        } catch (ex: IOException) {
            Logger.getLogger(javaClass.name).log(Level.SEVERE, null, ex)
        } finally {
            if (c != null) {
                try {
                    c.disconnect()
                } catch (ex: Exception) {
                    Logger.getLogger(javaClass.name).log(Level.SEVERE, null, ex)
                }
            }
        }
        return null
    }
}