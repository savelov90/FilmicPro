package com.savelov.filmicpro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.savelov.filmicpro.databinding.FragmentLaterBinding
import kotlinx.android.synthetic.main.fragment_later.*

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