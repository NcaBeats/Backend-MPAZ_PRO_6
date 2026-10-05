package com.example.users

import com.example.enums.Rol
import org.jetbrains.exposed.v1.core.dao.id.LongIdTable

object UsersTable : LongIdTable("user"){
    val nombre = varchar("nombre", 100)
    val username = varchar("username", 50).uniqueIndex()
    val contraseña = varchar("contrasena", 255)
    val rol = enumerationByName("rol", 20, Rol::class)

    // Si tuvieras una tabla CursosTable, usarías: reference("curso_id", CursosTable)
    // Como ejemplo simple, guardamos el ID numérico directamente:
    val cursoId = long("curso_id")
}