package com.example.firstrealworkapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.choose_btn)
        button.setOnClickListener {
            val bottomSheetFragment = BottomFragment()
            bottomSheetFragment.show(supportFragmentManager, "MyBottomSheetDialogFragment")
        }
    }
}