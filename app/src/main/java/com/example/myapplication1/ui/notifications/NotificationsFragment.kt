package com.example.myapplication1.ui.notifications

import androidx.lifecycle.ViewModelProvider
import com.example.myapplication1.base.BaseFragment
import com.example.myapplication1.databinding.FragmentNotificationsBinding
import com.example.myapplication1.ui.notifications.adapter.LocationAdapter

class NotificationsFragment : BaseFragment<FragmentNotificationsBinding>(FragmentNotificationsBinding::inflate) {
    private lateinit var adapter: LocationAdapter
    private val viewModel by lazy{
        ViewModelProvider(requireActivity())[NotificationViewMadel::class.java]
    }
    override fun setupUI() {
        TODO("Not yet implemented")
    }

    override fun setupObserver() {
        super.setupObserver()
        viewModel.location.observe(viewLifecycleOwner) {
            adapter.setList(it.location)

        }
    }
}