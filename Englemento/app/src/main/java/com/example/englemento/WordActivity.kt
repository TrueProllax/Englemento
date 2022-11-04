package com.example.englemento

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ListView
import android.widget.TextView
import com.example.englemento.list.ListAdapter
import com.example.englemento.list.listOfWords

class WordActivity : AppCompatActivity() {

    val listOfWords : com.example.englemento.list.listOfWords = listOfWords();

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_words)

        val listView : ListView = findViewById(R.id.list_reigns)
        val textViewTopic : TextView = findViewById(R.id.textViewTopic)
        val activeRusOnOff : CheckBox = findViewById(R.id.checkBoxRusOnOff)
        val activeEngOnOff : CheckBox = findViewById(R.id.checkBoxEngOnOff)

        val topic: String  = intent.getStringExtra("topic").toString()
        var rusActive : Boolean = activeRusOnOff.isChecked
        var engActive : Boolean = activeEngOnOff.isChecked

        var adapter = checkTopic(topic, rusActive,engActive)

        textViewTopic.setText(topic)

        listView.adapter = adapter

        // to back
        var toBack : Button = findViewById(R.id.btnToBack)
        toBack.setOnClickListener {
            val intent = Intent(this@WordActivity, MainActivity::class.java)
            startActivity(intent)
        }

        activeRusOnOff.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                rusActive = activeRusOnOff.isChecked
                engActive = activeEngOnOff.isChecked
                listView.adapter = checkTopic(topic, rusActive,engActive)
            } else {
                rusActive = activeRusOnOff.isChecked
                engActive = activeEngOnOff.isChecked
                listView.adapter = checkTopic(topic, rusActive,engActive)
            }

        }

        activeEngOnOff.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                rusActive = activeRusOnOff.isChecked
                engActive = activeEngOnOff.isChecked
                listView.adapter = checkTopic(topic, rusActive,engActive)
            } else {
                rusActive = activeRusOnOff.isChecked
                engActive = activeEngOnOff.isChecked
                listView.adapter = checkTopic(topic, rusActive,engActive)
            }

        }
    }


    fun checkTopic (topic : String, rusActive : Boolean, engActive : Boolean) : ListAdapter {
        if (topic == "Reign") {
            return ListAdapter(this, listOfWords.returnListReigns(), engActive, rusActive)
        } else if (topic == "Math") {
            return ListAdapter(this, listOfWords.returnListMath(), engActive, rusActive)
        } else if (topic == "Animals") {
            return ListAdapter(this, listOfWords.returnListAnimals(), engActive, rusActive)
        } else if (topic == "Culture") {
            return ListAdapter(this, listOfWords.returnListCulture(), engActive, rusActive)
        }else if (topic == "Brain") {
            return ListAdapter(this, listOfWords.returnListBrain(), engActive, rusActive)
        }
        return ListAdapter(this, listOfWords.returnListReigns(), engActive, rusActive)
    }
}