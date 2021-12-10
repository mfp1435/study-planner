package com.example.studyplanner.ui.plan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.studyplanner.R
import com.example.studyplanner.databinding.FragmentPlanBinding
import com.example.studyplanner.viewmodel.PlanViewModel

class Plan : Fragment() {

    private val viewModel: PlanViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentPlanBinding.inflate(inflater)
        binding.apply {
            floatingActionButton.setOnClickListener{
                findNavController().navigate(R.id.action_plan_to_add)
            }
        }

        return binding.root
    }
}

