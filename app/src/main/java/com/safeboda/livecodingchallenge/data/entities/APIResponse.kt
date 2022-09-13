package com.safeboda.livecodingchallenge.data.entities

import com.google.gson.annotations.SerializedName

data class APIResponse(
    @SerializedName("API") val name: String,
    @SerializedName("Description") val description: String,
    @SerializedName("Auth") val authenticationMethod: String,
    @SerializedName("HTTPS") val isEncrypted: Boolean,
    @SerializedName("Cors") val corsPolicy: String,
    @SerializedName("Link") val href: String,
    @SerializedName("Category") val category: String,
)

data class APIResponseWrapper(
    @SerializedName("count") val count: Int,
    @SerializedName("entries") val data: List<APIResponse>,
)