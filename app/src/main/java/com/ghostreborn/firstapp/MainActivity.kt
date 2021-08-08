package com.ghostreborn.firstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /* Called when user taps Send Button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(Companion.EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    companion object {
        const val EXTRA_MESSAGE = "com.ghostreborn.firstapp.EXTRA_MESSAGE"
    }

}