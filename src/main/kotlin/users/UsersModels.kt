package com.example.users

import com.example.enums.Rol
import kotlinx.serialization.Serializable

@Serializable
data class UserRequest(
    val name :String,
    val username : String,
    var password: String,
    val rol : Rol,
    val courseId : Long,
) {
}

@Serializable
data class UserResponse(
    val id : Long,
    val name : String,
    val username: String,
    val rol : Rol,
    val courseId : Long,
)
