package com.example.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_search = findViewById<Button>(R.id.search_but)
        val button_media = findViewById<Button>(R.id.media_but)
        val button_settings = findViewById<Button>(R.id.settings_but)
        // Лямбда-выражение для первой кнопки
        button_search.setOnClickListener {
            Toast.makeText(this, "Нажали на кнопку" + " Поиск", Toast.LENGTH_SHORT).show()
        }

        // Анонимный класс для второй кнопки
        val buttonClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на кнопку (анонимный класс)" + " Медиатека", Toast.LENGTH_SHORT).show()
            }
        }
        button_media.setOnClickListener(buttonClickListener)

        //Лямбда-выражение для третьей кнопки
        button_settings.setOnClickListener {
            val displayIntent = Intent(this, SettingsActivity::class.java)
            startActivity(displayIntent)
        }
    }
}
