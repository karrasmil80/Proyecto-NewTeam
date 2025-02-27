package org.example.models

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
    override val fechaNacimiento: String,
    override val fechaIncorporacion: String,
    override val salario: Double,
    override val pais: String
): Empleado(id, nombre, apellidos, fechaNacimiento, fechaIncorporacion, salario, pais)