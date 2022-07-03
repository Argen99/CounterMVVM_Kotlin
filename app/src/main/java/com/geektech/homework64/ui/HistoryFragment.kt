package com.geektech.homework64.ui

import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProvider
import com.geektech.homework64.MainViewModel
import com.geektech.homework64.base.BaseFragment
import com.geektech.homework64.databinding.FragmentHistoryBinding

class HistoryFragment: BaseFragment<FragmentHistoryBinding>() {

    private lateinit var viewModel: MainViewModel

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun inflateViewBinding(): FragmentHistoryBinding {
        return FragmentHistoryBinding.inflate(layoutInflater)
    }

    override fun observe() {
        viewModel.mList.observe(this){
            val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
                requireContext(),android.R.layout.simple_list_item_1, it
            )
            binding.listView.adapter = arrayAdapter
        }
    }

    override fun initClickListener() {

    }
}