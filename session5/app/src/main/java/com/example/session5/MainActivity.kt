package com.example.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ListViewオブジェクト
        val lvMenu = findViewById<ListView>(R.id.lvMenu)
        lvMenu.onItemClickListener = ListItemClickListener()
        //
    }

    //タップされたときの挙動
    private inner class ListItemClickListener: AdapterView.OnItemClickListener{
        //AdapterViewクラスのOnItemClickListeneインターフェイスの継承書き換え
        override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            //parentはタップされたもの
            //テキストを取得
            val item = parent?.getItemAtPosition(position) as String
            //テキストを定義
            val show_food = "あなたが選んだ定食：$item"
            //Toast.makeText(引数１，引数２，引数３)
            Toast.makeText(this@MainActivity,show_food,Toast.LENGTH_LONG).show()
        }
    }
}