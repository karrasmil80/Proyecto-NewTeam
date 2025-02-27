package org.example.models

class Entrenador (
    val especialidad: String,
    override val id: Int,
    override val nombre: String,
    override val apellidos: String,
    override val fechaNacimiento: String,
    override val fechaIncorporacion: String,
    override val salario: Double,
    override val pais: String
) : Empleado(id, nombre, apellidos, fechaNacimiento, fechaIncorporacion, salario, pais)