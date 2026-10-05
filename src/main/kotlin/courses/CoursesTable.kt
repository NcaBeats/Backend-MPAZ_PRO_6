package com.example.courses

import org.jetbrains.exposed.v1.core.dao.id.LongIdTable

object CoursesTable: LongIdTable("course") {
    val level = varchar("name", 255).uniqueIndex()
    var year = integer("year")
}