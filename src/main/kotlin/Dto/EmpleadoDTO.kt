package org.example.Dto

import kotlinx.serialization.Serializable
import org.example.models.Personal
import java.time.LocalDateTime

@Serializable
class EmpleadoDTO (

    val id: Int,
    val nombre: String,
    val apellidos: String,
    val fechaNacimiento: String,
    val fechaIncorporacion: String,
    val salario: Double,
    val pais: String,
    val rol: Personal.Rol

)