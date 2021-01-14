package com.savelov.filmicpro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var filmsAdapter: FilmListRecyclerAdapter

    val filmsDataBase = listOf(
        Film("The Mandalorian", R.drawable.mando, "The travels of a lone bounty hunter in the outer reaches of the galaxy, far from the authority of the New Republic."),
        Film("The Boys", R.drawable.boys, "A group of vigilantes set out to take down corrupt superheroes who abuse their superpowers."),
        Film("Game of Thrones", R.drawable.game, "Nine noble families fight for control over the lands of Westeros, while an ancient enemy returns after being dormant for millennia."),
        Film("Better Call Saul", R.drawable.saul, "The trials and tribulations of criminal lawyer Jimmy McGill in the time before he established his strip-mall law office in Albuquerque, New Mexico."),
        Film("Breaking Bad ", R.drawable.bad, "A high school chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine in order to secure his family's future."),
        Film("Stranger Things", R.drawable.stranger, "When a young boy disappears, his mother, a police chief and his friends must confront terrifying supernatural forces in order to get him back."),
        Film("Sex Education", R.drawable.sex, "A teenage boy with a sex therapist mother teams up with a high school classmate to set up an underground sex therapy clinic at school."),

        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //находим наш RV
        main_recycler.apply {
            filmsAdapter = FilmListRecyclerAdapter(object : FilmListRecyclerAdapter.OnItemClickListener{
                override fun click(film: Film) {
                    (requireActivity() as MainActivity).launchDetailsFragment(film)
                }
            })
            //Присваиваем адаптер
            adapter = filmsAdapter
            //Присвои layoutmanager
            layoutManager = LinearLayoutManager(requireContext())
            //Применяем декоратор для отступов
            val decorator = TopSpacingItemDecoration(8)
            addItemDecoration(decorator)
        }
        //Кладем нашу БД в RV
        filmsAdapter.addItems(filmsDataBase)
    }

}