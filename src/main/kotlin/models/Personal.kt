package org.example.models

import java.time.LocalDateTime

class Personal (
    val id: Int,
    val nombre: String,
    val apellidos: String,
    val fechaNacimiento: LocalDateTime,
    val fechaIncorporacion: LocalDateTime,
    val salario: Double,
    val pais: String,
    val rol: Rol,
    val posicion: String,
    val dorsal: Int,
    val altura: Double,
    val peso: Double,
    val goles: Int,
    val partidosJugados: Int,

    ){
    enum class Rol {
        DEFENSA, CENTROCAMPISTA, DELANTERO, PORTERO, ENTRENADOR, AUXILIAR
    }
}