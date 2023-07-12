package com.example.countrylist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.countrylist.databinding.ActivityCountryInfoBinding

class CountryInfo : AppCompatActivity() {

    lateinit var Binding: ActivityCountryInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityCountryInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val png = intent?.getStringExtra("png")
        val name = intent?.getStringExtra("name")
        val capital = intent?.getStringExtra("capital")
        val region = intent?.getStringExtra("region")
        val subregion = intent?.getStringExtra("subregion")
        val nativeName = intent?.getStringExtra("nativeName")
        val population = intent?.getIntExtra("population",0)
        val demonym = intent?.getStringExtra("demonym")
//        val borders = intent?.getStringExtra("borders")
        val independent = intent?.getBooleanExtra("independent",true)

        if (png != null) {
            Glide.with(this).load(png).into(binding.imgflag)
        }
        binding.txtcountryname.text = name
        binding.txtcountryname.text = name
        binding.txtcapital.text = capital
        binding.txtregion.text = region
        binding.txtsubregion.text = subregion
        binding.txtnativename.text = nativeName
        binding.txtpopulation.text = population.toString()
        binding.txtdemonym.text = demonym
//        binding.txtbordes.text = borders.toString()
        binding.txtindependent.text = independent.toString()

        binding.txtinformation.setText("$name's information")
    }
}