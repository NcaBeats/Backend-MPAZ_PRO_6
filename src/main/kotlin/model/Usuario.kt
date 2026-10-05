package com.example.model

import com.example.enums.Rol

class Usuario(
    val id : Long,
    val nombre :String,
    val username : String,
    val contraseña: String,
    val rol : Rol,
    val cursoId : Long,
) {
}