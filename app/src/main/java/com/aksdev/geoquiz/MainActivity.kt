package com.aksdev.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){
private lateint var trueButton: Button
private lateint var falseButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        true_button = findViewById(R.id.true_button)
        false_button = findViewById(R.id.false_button)

        trueButton.setOnClickListener{view: view->
        }

    }
}
