package com.iroyoraso.comicville

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.iroyoraso.characters.CharactersListScreen

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.app_content, CharactersListScreen())
        transaction.commit()
    }
    
}
