package com.example.myapplication1.ui.home

import androidx.lifecycle.ViewModelProvider
import com.example.myapplication1.base.BaseFragment
import com.example.myapplication1.databinding.FragmentHomeBinding
import com.example.myapplication1.ui.home.adapter.CharacterAdapter

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private lateinit var adapter: CharacterAdapter
    private val viewModel by lazy{
        ViewModelProvider(requireActivity())[HomeViewModel::class.java]
    }
    override fun setupUI() {
        TODO("Not yet implemented")
    }

    override fun setupObserver() {
        super.setupObserver()
        viewModel.liveDate.observe(viewLifecycleOwner) {
            adapter.setList(it.results)

        }
    }
}