package com.example.countrylist

import com.google.gson.annotations.SerializedName

data class RegionalBlocsItem(

	@field:SerializedName("acronym")
	val acronym: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("otherNames")
	val otherNames: List<String?>? = null,

	@field:SerializedName("otherAcronyms")
	val otherAcronyms: List<String?>? = null
)

data class CountryModel(

	@field:SerializedName("nativeName")
	val nativeName: String? = null,

	@field:SerializedName("capital")
	val capital: String? = null,

	@field:SerializedName("demonym")
	val demonym: String? = null,

	@field:SerializedName("flag")
	val flag: String? = null,

	@field:SerializedName("alpha2Code")
	val alpha2Code: String? = null,

	@field:SerializedName("independent")
	val independent: Boolean? = null,

	@field:SerializedName("borders")
	val borders: List<String?>? = null,

	@field:SerializedName("flags")
	val flags: Flags? = null,

	@field:SerializedName("numericCode")
	val numericCode: String? = null,

	@field:SerializedName("alpha3Code")
	val alpha3Code: String? = null,

	@field:SerializedName("topLevelDomain")
	val topLevelDomain: List<String?>? = null,

	@field:SerializedName("cioc")
	val cioc: String? = null,

	@field:SerializedName("translations")
	val translations: CountryModel? = null,

	@field:SerializedName("altSpellings")
	val altSpellings: List<String?>? = null,

	@field:SerializedName("area")
	val area: Any? = null,

	@field:SerializedName("languages")
	val languages: List<LanguagesItem?>? = null,

	@field:SerializedName("subregion")
	val subregion: String? = null,

	@field:SerializedName("callingCodes")
	val callingCodes: List<String?>? = null,

	@field:SerializedName("regionalBlocs")
	val regionalBlocs: List<RegionalBlocsItem?>? = null,

	@field:SerializedName("gini")
	val gini: Any? = null,

	@field:SerializedName("population")
	val population: Int? = null,

	@field:SerializedName("timezones")
	val timezones: List<String?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("region")
	val region: String? = null,

	@field:SerializedName("latlng")
	val latlng: List<Any?>? = null,

	@field:SerializedName("currencies")
	val currencies: List<CurrenciesItem?>? = null
)

data class CurrenciesItem(

	@field:SerializedName("symbol")
	val symbol: String? = null,

	@field:SerializedName("code")
	val code: String? = null,

	@field:SerializedName("name")
	val name: String? = null
)

data class LanguagesItem(

	@field:SerializedName("nativeName")
	val nativeName: String? = null,

	@field:SerializedName("iso639_2")
	val iso6392: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("iso639_1")
	val iso6391: String? = null
)

data class Flags(

	@field:SerializedName("svg")
	val svg: String? = null,

	@field:SerializedName("png")
	val png: String? = null
)
