package org.example.models

import java.time.LocalDateTime

class Entrenador (
    val especialidad: String,
    override val id: Int,
    override val nombre: String,
    override val apellidos: String,
    override val fechaNacimiento: LocalDateTime,
    override val fechaIncorporacion: LocalDateTime,
    override val salario: Double,
    override val pais: String
) : Empleado(id, nombre, apellidos, fechaNacimiento, fechaIncorporacion, salario, pais)