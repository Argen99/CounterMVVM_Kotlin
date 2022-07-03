package com.geektech.homework64.ui


import androidx.lifecycle.ViewModelProvider
import com.geektech.homework64.MainViewModel
import com.geektech.homework64.base.BaseFragment
import com.geektech.homework64.databinding.FragmentResultBinding


class ResultFragment: BaseFragment<FragmentResultBinding>() {

    private lateinit var viewModel: MainViewModel

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun inflateViewBinding(): FragmentResultBinding {
        return FragmentResultBinding.inflate(layoutInflater)
    }

    override fun observe() {
        viewModel.counter.observe(this){ count ->
            binding.tvCount.text = count.toString()
        }
    }

    override fun initClickListener() {

    }
}


