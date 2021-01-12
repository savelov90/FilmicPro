package com.savelov.filmicpro


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initNavigation()


        main_recycler.apply {
            filmsAdapter = FilmListRecyclerAdapter(object : FilmListRecyclerAdapter.OnItemClickListener{
                override fun click(film: Film) {
                    //Создаем бандл и кладем туда объект с данными фильма
                    val bundle = Bundle()
                    //Первым параметром указывается ключ, по которому потом будем искать, вторым сам
                    //передаваемый объект
                    bundle.putParcelable("film", film)
                    //Запускаем наше активити
                    val intent = Intent(this@MainActivity, DetailsActivity::class.java)
                    //Прикрепляем бандл к интенту
                    intent.putExtras(bundle)
                    //Запускаем активити через интент
                    startActivity(intent)
                }
            })
            adapter = filmsAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)

            val decorator = TopSpacingItemDecoration(8)
            addItemDecoration(decorator)
        }
        filmsAdapter.addItems(filmsDataBase)
    }

    fun initNavigation() {

        topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.settings -> {
                    Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        bottom_navigation.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.favorites -> {
                    Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.watch_later -> {
                    Toast.makeText(this, "Посмотреть похже", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.selections -> {
                    Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }

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



/*    fun initMenuButtons() {
        button_favorite.setOnClickListener {
            Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
        }
        button_russian.setOnClickListener {
            Toast.makeText(this, "Российское кино", Toast.LENGTH_SHORT).show()
        }
        button_top.setOnClickListener {
            Toast.makeText(this, "Топ250", Toast.LENGTH_SHORT).show()
        }
        button_menu.setOnClickListener {
            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
        }
        button_settings.setOnClickListener {
            Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
        }
    }*/


}