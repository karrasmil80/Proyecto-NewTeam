package org.example.models

import java.time.LocalDateTime

class Jugador (
    val posicion: String,
    val dorsal: Int,
    val altura: Double,
    val peso: Double,
    val goles: Int,
    val partidosJugados: Int,
    override val id: Int,
    override val nombre: String,
    override val apellidos: String,
    override val fechaNacimiento: LocalDateTime,
    override val fechaIncorporacion: LocalDateTime,
    override val salario: Double,
    override val pais: String
): Empleado(id, nombre, apellidos, fechaNacimiento, fechaIncorporacion, salario, pais)