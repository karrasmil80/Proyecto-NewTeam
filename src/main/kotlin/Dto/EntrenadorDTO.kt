package org.example.Dto

import kotlinx.serialization.Serializable
import org.example.models.Personal

@Serializable
class EntrenadorDTO (

    val especialidad: String,
    val id: Int,
    val nombre: String,
    val apellidos: String,
    val fechaNacimiento: String,
    val fechaIncorporacion: String,
    val salario: Double,
    val pais: String,
    val rol: Personal.Rol

)
