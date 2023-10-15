package com.tjlab.uikotlinpractice_genie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjlab.uikotlinpractice_genie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.okBtn.setOnClickListener {
            val inputContent = binding.contentEdt.text.toString()
            binding.resultTxt.text = inputContent
        }
    }
}