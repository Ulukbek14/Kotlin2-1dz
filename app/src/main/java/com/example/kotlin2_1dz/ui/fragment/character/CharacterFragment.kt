package com.example.kotlin2_1dz.ui.fragment.character

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin2_1dz.databinding.FragmentCharacterBinding
import com.example.kotlin2_1dz.ui.adapter.CharacterAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class CharacterFragment : Fragment() {

    private lateinit var binding: FragmentCharacterBinding
    private val characterAdapter: CharacterAdapter = CharacterAdapter()
    private val viewModel: CharacterViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharacterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
        setupObserves()
    }

    private fun setupViews() {
        binding.recView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = characterAdapter
        }
    }

    private fun setupObserves() {
        viewModel.getCharacterList().observe(viewLifecycleOwner, { it->
            characterAdapter.submitList(it.results)
        })
    }
}