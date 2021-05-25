package com.example.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ボタンの取得
        val btClick = findViewById<Button>(R.id.btClick)
        //名前表示のクラスをインスタンス化して取得
        val listener = HelloListener()
        //setOnClickListenerの中にlistenerのインスタンスを入れると動く
        btClick.setOnClickListener(listener)
    }

    //ボタンを押したときに名前を表示させる処理（インナークラス）
    private inner class HelloListener: View.OnClickListener{
        override fun onClick(view:View) {
            val input = findViewById<EditText>(R.id.etName)
            val output = findViewById<TextView>(R.id.tvOutput)

            when (view.id) {
                R.id.btClick -> {
                    val inputStr = input.text.toString()
                    output.text = inputStr + "さん。こんにちは！"
                }
                R.id.btClear -> {
                    input.setText("")
                    output.text = ""
                }
            }
        }
    }
}