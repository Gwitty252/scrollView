package io.gideon.aboutmelession2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.getSystemService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.donebutton).setOnClickListener {
            inputNickName(it)
        }

    }
    private fun inputNickName ( view: View){
        var edit = findViewById<EditText>(R.id.editTextPersonName)
        val nick = findViewById<TextView>(R.id.unseenText)
        nick.text = edit.text
        edit.visibility = View.GONE
        nick.visibility = View.VISIBLE

        val hidpass = getSystemService(Context.INPUT_METHOD_SERVICE)as InputMethodManager
        hidpass.hideSoftInputFromWindow(view.windowToken, 0)


    }
}