package com.example.myapplication1.ui.dashboard

import androidx.lifecycle.ViewModelProvider
import com.example.myapplication1.base.BaseFragment
import com.example.myapplication1.databinding.FragmentDashboardBinding
import com.example.myapplication1.ui.dashboard.adapter.EpisodeAdapter

class DashboardFragment : BaseFragment<FragmentDashboardBinding>(FragmentDashboardBinding::inflate) {
    private lateinit var adapter: EpisodeAdapter
    private val viewModel by lazy{
        ViewModelProvider(requireActivity())[DashboardViewMadel::class.java]
    }
    override fun setupUI() {
    }
    override fun setupObserver() {
        super.setupObserver()
        viewModel.episode.observe(viewLifecycleOwner) {
            adapter.setList(it.episode)

        }
    }
}