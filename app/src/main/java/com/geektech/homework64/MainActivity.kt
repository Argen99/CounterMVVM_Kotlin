package com.geektech.homework64

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.geektech.homework64.databinding.ActivityMainBinding
import com.geektech.homework64.ui.CounterFragment
import com.geektech.homework64.ui.HistoryFragment
import com.geektech.homework64.ui.ResultFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragments: ArrayList<Fragment> = arrayListOf(
            CounterFragment(),ResultFragment(),HistoryFragment()
        )
        val adapter = ViewPagerAdapter(fragments,this)
        binding.viewPager.adapter = adapter
    }

    override fun onBackPressed() {
        if(binding.viewPager.currentItem == 0){
            super.onBackPressed()
        }else{
            binding.viewPager.currentItem = binding.viewPager.currentItem - 1
        }
    }
}