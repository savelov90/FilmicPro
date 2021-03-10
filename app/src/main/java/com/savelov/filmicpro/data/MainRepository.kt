package com.savelov.filmicpro.data

import com.savelov.filmicpro.R
import com.savelov.filmicpro.domain.Film

class MainRepository {
    val filmsDataBase = listOf(
        Film("The Mandalorian",
            R.drawable.mando, "The travels of a lone bounty hunter in the outer reaches of the galaxy, far from the authority of the New Republic.", 7.7f),
        Film("The Boys", R.drawable.boys, "A group of vigilantes set out to take down corrupt superheroes who abuse their superpowers."),
        Film("Game of Thrones",
            R.drawable.game, "Nine noble families fight for control over the lands of Westeros, while an ancient enemy returns after being dormant for millennia.", 7.7f),
        Film("Better Call Saul",
            R.drawable.saul, "The trials and tribulations of criminal lawyer Jimmy McGill in the time before he established his strip-mall law office in Albuquerque, New Mexico.", 7.7f),
        Film("Breaking Bad ",
            R.drawable.bad, "A high school chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine in order to secure his family's future.", 7.7f),
        Film("Stranger Things",
            R.drawable.stranger, "When a young boy disappears, his mother, a police chief and his friends must confront terrifying supernatural forces in order to get him back.", 7.7f),
        Film("Sex Education",
            R.drawable.sex, "A teenage boy with a sex therapist mother teams up with a high school classmate to set up an underground sex therapy clinic at school.", 7.7f),

        )
}