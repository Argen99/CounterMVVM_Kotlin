package com.geektech.homework64.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.geektech.homework64.MainViewModel
import com.geektech.homework64.base.BaseFragment
import com.geektech.homework64.databinding.FragmentCounterBinding

class CounterFragment : BaseFragment<FragmentCounterBinding>() {

    private lateinit var viewModel: MainViewModel

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }
    override fun inflateViewBinding(): FragmentCounterBinding {
        return FragmentCounterBinding.inflate(layoutInflater)
    }
    override fun observe() {

    }
    override fun initClickListener() {
        binding.plus.setOnClickListener {
            viewModel.increment()
        }
        binding.minus.setOnClickListener {
            viewModel.decrement()
        }
    }
}