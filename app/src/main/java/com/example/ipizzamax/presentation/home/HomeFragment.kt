package com.example.ipizzamax.presentation.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.ipizzamax.R
import com.example.ipizzamax.databinding.FragmentHomeBinding
import com.example.ipizzamax.presentation.cart.CartFragment
import com.example.ipizzamax.presentation.details.DetailsFragment
import com.example.ipizzamax.utils.navigateTo

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)
    private var detailsFragment: DetailsFragment? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onResume() {
        super.onResume()
        detailsFragment?.show(parentFragmentManager, DetailsFragment.TAG)
    }
}