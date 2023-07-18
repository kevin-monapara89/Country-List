package com.example.countrylist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.countrylist.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: CountryAdapter
    companion object {
        var countryList = ArrayList<CountryModel>()
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = CountryAdapter()

        ApiCall()
//        binding.imgsearch.setOnClickListener {
//            var name = binding.search.text.toString()
//                searchApi(name)
//        }
    }

    private fun ApiCall() {

        var api= ApiClient.getApiClient()?.create(ApiInterface::class.java)
        api?.getcountry()?.enqueue(object : Callback<List<CountryModel>> {
            override fun onResponse(
                call: Call<List<CountryModel>>,
                response: Response<List<CountryModel>>,
            ) {
                if (response.isSuccessful) {
                    var flags = response.body()
                    adapter.setFlag(flags as List<CountryModel>)
                    binding.rcvcountryflag.layoutManager = LinearLayoutManager(this@MainActivity)
                    binding.rcvcountryflag.adapter = adapter
                }
            }
            override fun onFailure(call: Call<List<CountryModel>>, t: Throwable) {

            }
        })
    }

    private fun searchApi(name: String){

        var api= ApiClient.getApiClient()?.create(ApiInterface::class.java)
        api?.searchname(name)?.enqueue(object : Callback<List<CountryModel>> {
            override fun onResponse(
                call: Call<List<CountryModel>>,
                response: Response<List<CountryModel>>,
            ) {
                if (response.isSuccessful) {
                    var name = response.body()
//                        adapter.search(name as List<CountryModel>)
                        binding.rcvcountryflag.layoutManager = GridLayoutManager(this@MainActivity, 1)
                        binding.rcvcountryflag.adapter = adapter
                }
            }
            override fun onFailure(call: Call<List<CountryModel>>, t: Throwable) {

            }
        })
    }
}