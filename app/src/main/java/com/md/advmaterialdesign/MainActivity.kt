package com.md.advmaterialdesign

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            //Material CardView
            val i = Intent(this@MainActivity, MaterialCardView::class.java)
            startActivity(i)
        }

        button2.setOnClickListener {
            //Material AlertDialog Builder
            val i = Intent(this@MainActivity, MaterialAlertBuilder::class.java)
            startActivity(i)
        }

        button3.setOnClickListener {
            //Cards
            val i = Intent(this@MainActivity, CardActivity::class.java)
            startActivity(i)
        }

        button4.setOnClickListener {
            //Backdrop Menu
            val i = Intent(this@MainActivity, BackdropActivity::class.java)
            startActivity(i)
        }

        button5.setOnClickListener {
            //Navigation rail (BETA)
            val i = Intent(this@MainActivity, NavigationRailActivity::class.java)
            startActivity(i)
        }

        button6.setOnClickListener {
            //Bottom App Bar
            val i = Intent(this@MainActivity, BottomAppBarActivity::class.java)
            startActivity(i)
        }

    }
}
