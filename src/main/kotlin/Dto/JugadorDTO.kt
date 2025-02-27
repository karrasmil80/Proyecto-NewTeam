package org.example.Dto

import kotlinx.serialization.Serializable
import org.example.models.Personal

@Serializable
class JugadorDTO (

    val id: Int,
    val nombre: String,
    val apellidos: String,
    val fechaNacimiento: String,
    val fechaIncorporacion: String,
    val salario: Double,
    val pais: String,
    val rol: Personal.Rol,
    val posicion: String,
    val dorsal: Int,
    val altura: Double,
    val peso: Double,
    val goles: Int,
    val partidosJugados: Int

)