package com.example.ipizzamax.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.ipizzamax.R
import com.example.ipizzamax.databinding.FragmentDetailsBinding
import com.example.ipizzamax.presentation.preview.PreviewFragment
import com.example.ipizzamax.utils.navigateTo
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class DetailsFragment : BottomSheetDialogFragment() {

    private val binding by viewBinding(FragmentDetailsBinding::bind)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.swipeBottomSheet.setOnClickListener {
            dismiss()
        }

        binding.textDetails.setOnClickListener {
            dismiss()
            parentFragmentManager.navigateTo(PreviewFragment(), true).commit()
        }
    }
}