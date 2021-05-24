package com.example.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //インナークラス
    private inner class HelloListener: View.OnClickListener{
        override fun onClick(view:View){
            var inpur = findViewById<EditTect>(R.id.etName);
        }
    }
}