# NativeApp-Kotlin-Study-


## Android

### AdapterView
 + AdapterViewはどんなデータがどんなレイアウトで表示されているかなど全く知りませんが、何番目のアイテムがクリックされたのかぐらいはわかります。
 + 一緒に使うinterface
   + onItemClickListener (別途記述あり)
     + AdapterViewクラス内にあるinterface関数
     + onItemClick関数を持っている
       + onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
         + 第一引数(parent: AdapterView<*>?)
           + タップされたリスト全体
         + 第二引数(view: View?)
           + タップされた1行分
         + 第三引数(position: Int)
           + タップされた行数
         + 第四引数(id: Long)
           + DBの主key（無ければ第三引数と同じ値）
     + リストビューを[タップ(クリック)]した時のリスナ関数

### onItemClickListener（Kotlinの仕様）
  val lvMenu = findViewById<ListView>(R.id.lvMenu)
  val listItemClick = ListItemClickListener()
  lvMenu.setOnItemClickListener(listItemClick)

  上記の様な記述や

  val lvMenu = findViewById<ListView>(R.id.lvMenu)
  lvMenu.setOnItemClickListener(ListItemClickListener())

  上記のようにsetOnItemClickListenerメソッドのようにセットメソッドを記述するのではなく、Kotlinでは
  setメソッドを呼び出さずに代入でsetすることができる
  下記のような記述

  val lvMenu = findViewById<ListView>(R.id.lvMenu)
  lvMenu.onItemClickListener = ListItemClickListener()

### Toast
 + JSでいうアラートみたいなやつ
   + makeTaxt
     + 第一引数(content: Contenttext)
       + 表示させるアクティブオブジェクト（場所）を指定
     + 第二引数(text: CharSequence)
       + 表示させる文字列
     + 第三引数(duration: Int)
       + 表示させる長さ