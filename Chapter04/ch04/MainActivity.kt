package com.cookandroid.exam

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

// ex4_18
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ex4_17)

        var tv1: TextView
        var tv2: TextView
        var tv3: TextView

        tv1 = findViewById<TextView>(R.id.textView1)
        tv2 = findViewById<TextView>(R.id.textView2)
        tv3 = findViewById<TextView>(R.id.textView3)

        tv1.setText("안녕하세요?")
        tv1.setTextColor(Color.RED)
        tv2.setTextSize(30.3f)  // xml 속성의 textSize="30sp"와 동일한 역할
        tv2.setTypeface(
            android.graphics.Typeface.SERIF,
            android.graphics.Typeface.BOLD_ITALIC
        )
        tv3.setText("가나다라마바사아자차카타파하가나다라마바사아자차카타파하")
        tv3.setSingleLine()
    }
}
