package com.example.englemento

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var block_reigns : ConstraintLayout = findViewById(R.id.block_reigns)
        var block_math : ConstraintLayout = findViewById(R.id.block_math)
        var block_animals : ConstraintLayout = findViewById(R.id.block_animals)
        var block_brain : ConstraintLayout = findViewById(R.id.block_brain)
        var block_culture : ConstraintLayout = findViewById(R.id.block_culture)


        block_reigns.setOnClickListener {
            block_reigns.setBackgroundColor(resources.getColor(R.color.on_click))

            val intent = Intent(this@MainActivity, WordActivity::class.java)
            intent.putExtra("topic", "Reign")
            startActivity(intent)
        }

        block_math.setOnClickListener {
            block_math.setBackgroundColor(resources.getColor(R.color.on_click))

            val intent = Intent(this@MainActivity, WordActivity::class.java)
            intent.putExtra("topic", "Math")
            startActivity(intent)
        }

        block_animals.setOnClickListener {
            block_animals.setBackgroundColor(resources.getColor(R.color.on_click))

            val intent = Intent(this@MainActivity, WordActivity::class.java)
            intent.putExtra("topic", "Animals")
            startActivity(intent)
        }

        block_brain.setOnClickListener {
            block_brain.setBackgroundColor(resources.getColor(R.color.on_click))

            val intent = Intent(this@MainActivity, WordActivity::class.java)
            intent.putExtra("topic", "Brain")
            startActivity(intent)
        }

        block_culture.setOnClickListener {
            block_culture.setBackgroundColor(resources.getColor(R.color.on_click))

            val intent = Intent(this@MainActivity, WordActivity::class.java)
            intent.putExtra("topic", "Culture")
            startActivity(intent)
        }

    }
}