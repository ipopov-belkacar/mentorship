package com.example.goncharov1.data.model

data class ArticModel(var data: List<ArticModelData>)

data class ArticModelData(
    var id: Int? = 1,
    var title: String? = "Empty",
    var altTitles: String? = "Empty",
)