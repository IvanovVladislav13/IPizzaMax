package com.example.ipizzamax.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.ipizzamax.R

fun FragmentManager.navigateTo(
    target: Fragment,
    addToBackStack: Boolean
): FragmentTransaction {

    val fragmentTransaction = this.beginTransaction()
        .replace(R.id.fragmentContainer, target)
        .setReorderingAllowed(true)

    if (addToBackStack) {
        fragmentTransaction.addToBackStack(target::class.java.simpleName)
    }

    return fragmentTransaction
}