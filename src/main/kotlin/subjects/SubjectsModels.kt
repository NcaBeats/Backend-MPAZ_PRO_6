package com.example.subjects

import kotlinx.serialization.Serializable


@Serializable
data class SubjectsModels(
    val id : Long,
    val nombre :String,
) {
}