package com.damlacim.bookshelf.ui.onboarding

import android.content.Intent
import android.os.Bundle
import com.damlacim.bookshelf.BaseActivity
import com.damlacim.bookshelf.MainActivity
import com.damlacim.bookshelf.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : BaseActivity() {
    private lateinit var binding: ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.container.adapter = OnBoardingViewPagerAdapter(applicationContext)
        binding.skipButton.setOnClickListener {
            clientPreferences.setTutorialCompleted(true)
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}