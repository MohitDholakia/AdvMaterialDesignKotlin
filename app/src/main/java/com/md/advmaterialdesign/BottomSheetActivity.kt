package com.md.advmaterialdesign

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior


class BottomSheetActivity : AppCompatActivity() {

    var textViewBottomSheetState: TextView? = null
    var toggleBottomSheet: Button? = null
    var bottomSheetBehavior: BottomSheetBehavior<*>? = null

    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottomsheet)

        toggleBottomSheet = findViewById<Button>(R.id.buttonToggleBottomSheet)
        textViewBottomSheetState = findViewById<TextView>(R.id.textViewState)

        // get the bottom sheet view
        val bottomSheetLayout = findViewById<ConstraintLayout>(R.id.bottom_sheet)

        // init the bottom sheet behavior
        bottomSheetBehavior = BottomSheetBehavior.from<ConstraintLayout>(bottomSheetLayout)

        // set callback for changes
        bottomSheetBehavior?.setBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            @SuppressLint("SwitchIntDef")
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when (newState) {
                    BottomSheetBehavior.STATE_HIDDEN -> textViewBottomSheetState?.text = "STATE HIDDEN"
                    BottomSheetBehavior.STATE_EXPANDED -> {
                        textViewBottomSheetState?.text = "STATE EXPANDED"
                        // update toggle button text
                        toggleBottomSheet?.text = "Expand BottomSheet"
                    }
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                        textViewBottomSheetState?.text = "STATE COLLAPSED"
                        // update collapsed button text
                        toggleBottomSheet?.text = "Collapse BottomSheet"
                    }
                    BottomSheetBehavior.STATE_DRAGGING -> textViewBottomSheetState?.text = "STATE DRAGGING"
                    BottomSheetBehavior.STATE_SETTLING -> textViewBottomSheetState?.text = "STATE SETTLING"
                }

                Log.d(TAG, "onStateChanged: $newState")
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {

            }
        })
        // set listener on button click
        toggleBottomSheet?.setOnClickListener {
            if (bottomSheetBehavior?.getState() !== BottomSheetBehavior.STATE_EXPANDED) {
                bottomSheetBehavior?.setState(BottomSheetBehavior.STATE_EXPANDED)
                toggleBottomSheet?.text = "Collapse BottomSheet"
            } else {
                bottomSheetBehavior?.setState(BottomSheetBehavior.STATE_COLLAPSED)
                toggleBottomSheet?.text = "Expand BottomSheet"
            }
        }
    }
}
