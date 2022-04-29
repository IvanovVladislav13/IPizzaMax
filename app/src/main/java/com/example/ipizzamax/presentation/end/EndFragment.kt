package com.example.ipizzamax.presentation.end

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.ipizzamax.R
import com.example.ipizzamax.databinding.FragmentEndBinding
import com.example.ipizzamax.presentation.home.HomeFragment
import com.example.ipizzamax.utils.navigateTo

class EndFragment : Fragment(R.layout.fragment_end) {

    private val binding by viewBinding(FragmentEndBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                binding.backMenuButton.performClick()
            }
        })

        binding.backMenuButton.setOnClickListener {
            parentFragmentManager.navigateTo(
                HomeFragment(),
                false
            ).commit()
        }
    }
}