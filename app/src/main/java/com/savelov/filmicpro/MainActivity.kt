package com.savelov.filmicpro


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initMenuButtons()

    }

    fun initMenuButtons() {
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
    }


}