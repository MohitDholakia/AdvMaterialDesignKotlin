package com.md.advmaterialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.Toolbar
import com.evolve.backdroplibrary.BackdropContainer





class BackdropActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backdrop)

       val  backdropContainer = findViewById(R.id.backdropcontainer) as BackdropContainer
       val  toolbar = findViewById(R.id.toolbar) as androidx.appcompat.widget.Toolbar
        val height = this.resources.getDimensionPixelSize(R.dimen.sneek_height)

        backdropContainer.attachToolbar(toolbar)
            .dropInterpolator(LinearInterpolator())
            .dropHeight(height)
            .build()

    }
}
