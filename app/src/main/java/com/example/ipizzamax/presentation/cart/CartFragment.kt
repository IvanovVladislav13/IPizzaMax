package com.example.ipizzamax.presentation.cart

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.ipizzamax.R
import com.example.ipizzamax.databinding.FragmentCartBinding
import com.example.ipizzamax.presentation.end.EndFragment
import com.example.ipizzamax.presentation.home.HomeFragment
import com.example.ipizzamax.utils.navigateTo

class CartFragment : Fragment(R.layout.fragment_cart) {

    private val binding by viewBinding(FragmentCartBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.placeOrderButton.setOnClickListener {
            parentFragmentManager.navigateTo(
                EndFragment(),
                false
            ).commit()
        }
    }
}