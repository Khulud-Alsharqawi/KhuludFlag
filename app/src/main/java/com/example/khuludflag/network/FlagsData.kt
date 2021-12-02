package com.example.khuludflag.network

import com.squareup.moshi.Json

data class FlagsData(

	@Json(name="msg")
	val msg: String? = null,

	@Json(name="data")
	val data: List<DataItem?>? = null,

	@Json(name="error")
	val error: Boolean? = null
)

data class DataItem(

	@Json(name="flag")
	val flag: String? = null,

	@Json(name="name")
	val name: String? = null
)
