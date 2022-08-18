package com.geektech.pixabay.model

data class PixabayModel(

    val total : Int,
    val totalHits : Int,
    val hits : List<ImageModel>

)

data class ImageModel(
    val largeImageURL: String
)