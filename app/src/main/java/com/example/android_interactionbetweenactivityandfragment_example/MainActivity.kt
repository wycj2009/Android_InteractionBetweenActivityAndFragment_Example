package com.example.android_interactionbetweenactivityandfragment_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_interactionbetweenactivityandfragment_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), FirstFragment.EventListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onButtonClick(text: String) {
        val secondFragment = supportFragmentManager.findFragmentById(R.id.second_fragment) as SecondFragment
        secondFragment.setText(text)
    }

}