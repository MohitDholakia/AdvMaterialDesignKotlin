package com.md.advmaterialdesign

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_material_alert_builder.*


class MaterialAlertBuilder : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material_alert_builder)

        button.setOnClickListener {
            //showDialog()
            cutDialog()
        }

    }

    fun showDialog() {
        val builder = AlertDialog.Builder(this@MaterialAlertBuilder, R.style.CutShapeTheme)
        builder.setTitle(R.string.app_name)
        //list of items
        val items = resources.getStringArray(R.array.array_drugs)
        // set ingle choice items
        builder.setSingleChoiceItems(items, 2) { dialog, which ->
            // item selected logic
        }
        val positiveText = getString(R.string.ok)
        builder.setPositiveButton(positiveText) { dialog, which ->
            // positive button logic here
            // dismiss dialog too
        }
        val negativeText = getString(R.string.cancel)
        builder.setNegativeButton(negativeText) { dialog, which ->
            // negative button logic
        }
        val dialog = builder.create()
        // display dialog
        dialog.show()
    }

    fun cutDialog() {
        val items = resources.getStringArray(R.array.array_drugs)
        val builder = MaterialAlertDialogBuilder(this@MaterialAlertBuilder, R.style.CutShapeTheme)
        builder.setTitle("Title")
        builder.setSingleChoiceItems(items, 2) { dialog, which ->
            // item selected logic
        }
        builder.setPositiveButton(
            "GOT IT"
        ) {
                dialogInterface, i ->

        }
        builder.setNeutralButton(
            "LATER"
        )
        {
                dialogInterface, i ->

        }
        builder.show()
    }
}
