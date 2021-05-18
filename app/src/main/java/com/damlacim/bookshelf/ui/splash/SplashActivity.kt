package com.damlacim.bookshelf.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.BaseActivity
import com.damlacim.bookshelf.MainActivity
import com.damlacim.bookshelf.databinding.ActivitySplashBinding
import com.damlacim.bookshelf.ui.onboarding.OnBoardingActivity
import kotlinx.coroutines.delay

class SplashActivity : BaseActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launchWhenStarted {
            delay(3700)

            if (clientPreferences.getTutorialCompleted()) {
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this@SplashActivity, OnBoardingActivity::class.java)
                startActivity(intent)
            }
        }
    }
}