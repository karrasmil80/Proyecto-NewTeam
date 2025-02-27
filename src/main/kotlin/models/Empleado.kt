package org.example.models

import java.sql.Date

open class Empleado (
    open val id: Int,
    open val nombre: String,
    open val apellidos: String,
    open val fechaNacimiento: String,
    open val fechaIncorporacion: String,
    open val salario: Double,
    open val pais: String
)