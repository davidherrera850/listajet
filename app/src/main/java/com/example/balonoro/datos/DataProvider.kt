package com.example.balonoro.datos

import com.example.balonoro.R

object DataProvider {
    val futbolistaList = listOf(
        Futbolistas(
            id = 1,
            title = "Lionel Andrés Messi",
            equipo = "PSG",
            description = "Considerado el mejor jugador del mundo.Es apodado la pulga.Tiene 6 balones de oro.",
            futbolistaImageId = R.drawable.messi
        ),
        Futbolistas(
            id = 2,
            title = "Cristiano Ronaldo",
            equipo = "Female",
            description = "Junto a Messi son los 2 mejores jugadores del mundo de la ultima decada.Apodado el bicho.Tiene 5 balones de oro.",
            futbolistaImageId = R.drawable.cristiano
        ),
        Futbolistas(
            id = 3,
            title = "Robert Lewandowski",
            equipo = "Bayer Munich",
            description = "Es el tercer jugador en discordia con Messi y Cristiano.Ha ganado las 2 ultimas botas de oro.",
            futbolistaImageId = R.drawable.lewandowski
        ),
        Futbolistas(
            id = 4,
            title = "Kilian Mbappe",
            equipo = "PSG",
            description = "Se dice que sera el sucesor de Messi y Cristiano como mejor jugador. Juega en el PSG formando tripleta con Neymar y Messi",
            futbolistaImageId = R.drawable.mbappe
        ),
        Futbolistas(
            id = 5,
            title = "Pedri Gonzalez",
            equipo = "FC Barcelona",
            description = "Jugador del fc Barcelona.Actualmente a recibido el golden boy a mejor jugador menor de 21 años.",
            futbolistaImageId = R.drawable.pedri
        )
    )
}

