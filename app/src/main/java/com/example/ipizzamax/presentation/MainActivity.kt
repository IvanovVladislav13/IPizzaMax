package com.example.ipizzamax.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ipizzamax.R
import com.example.ipizzamax.presentation.home.HomeFragment
import com.example.ipizzamax.utils.navigateTo

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_IPizzaMax)
        super.onCreate(savedInstanceState)
        supportFragmentManager.navigateTo(HomeFragment(), false).commit()
    }
}