package com.example.balonoro.datos
import java.io.Serializable

data class Futbolistas(
    val id: Int,
    val title: String,
    val equipo: String,
    val description: String,
    val futbolistaImageId: Int = 0
): Serializable
