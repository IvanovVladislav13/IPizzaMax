package com.example.ipizzamax.presentation.preview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.ipizzamax.R
import com.example.ipizzamax.databinding.FragmentPreviewBinding
import com.example.ipizzamax.presentation.details.DetailsFragment
import com.example.ipizzamax.utils.navigateTo

class PreviewFragment : Fragment(R.layout.fragment_preview) {

    private val binding by viewBinding(FragmentPreviewBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backButton.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}