package com.wooyj.pokedex.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.wooyj.pokedex.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 *
 * Created on 2022/09/23.
 *
 * 첫 진입점 화면인 fragment.
 *
 * @author wooyj
 *
 */
@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val viewModel: HomeViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        observeViewModel()
        val view = binding.root
        return view
    }

    private fun observeViewModel() {
        viewModel.pokemonList.observe(viewLifecycleOwner) {
            binding.test.text = it.toString()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}