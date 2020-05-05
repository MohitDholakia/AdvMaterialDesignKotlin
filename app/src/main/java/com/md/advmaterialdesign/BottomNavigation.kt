package com.md.advmaterialdesign

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.badge.BadgeUtils
import com.google.android.material.badge.BadgeDrawable





class BottomNavigation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material_card_view)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { item: MenuItem ->
            return@setOnNavigationItemSelectedListener when (item.itemId) {
                R.id.bottomNavigationAlarmMenuId -> {
                    println("Alarm item click")
                    true
                }
                R.id.bottomNavigationClockMenuId -> {
                    println("Clock item clicked")
                    true
                }
                R.id.bottomNavigationTimerMenuId -> {
                    println("Timer item clicked")
                    true
                }
                R.id.bottomNavigationStopWatchMenuId -> {
                    println("stop-watch item clicked")
                    true
                }
                else -> false
            }
        }

        val badgeDrawable = bottomNavigationView.getBadge(R.id.bottomNavigationAlarmMenuId)
        if (badgeDrawable == null)
            bottomNavigationView.getOrCreateBadge(R.id.bottomNavigationAlarmMenuId).setNumber(2)
            bottomNavigationView.getOrCreateBadge(R.id.bottomNavigationAlarmMenuId).backgroundColor=resources.getColor(android.R.color.holo_red_dark)

        val badgeDrawable2 = bottomNavigationView.getBadge(R.id.bottomNavigationTimerMenuId)
        if (badgeDrawable2 == null)
            bottomNavigationView.getOrCreateBadge(R.id.bottomNavigationTimerMenuId).setNumber(100)
        bottomNavigationView.getOrCreateBadge(R.id.bottomNavigationTimerMenuId).backgroundColor=resources.getColor(android.R.color.holo_orange_dark)


    }
}
