package com.savelov.filmicpro.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.savelov.filmicpro.databinding.FragmentCollectionsBinding
import com.savelov.filmicpro.utils.AnimationHelper

class CollectionsFragment : Fragment() {
    private lateinit var binding: FragmentCollectionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCollectionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        AnimationHelper.performFragmentCircularRevealAnimation(binding.collectionsFragmentRoot, requireActivity(), 4)
    }
}