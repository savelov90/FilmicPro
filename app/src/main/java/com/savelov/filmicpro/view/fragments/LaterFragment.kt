package com.savelov.filmicpro.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.savelov.filmicpro.databinding.FragmentLaterBinding
import com.savelov.filmicpro.utils.AnimationHelper

class LaterFragment : Fragment() {
    private lateinit var binding: FragmentLaterBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLaterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        AnimationHelper.performFragmentCircularRevealAnimation(binding.laterFragmentRoot, requireActivity(), 3)
    }
}