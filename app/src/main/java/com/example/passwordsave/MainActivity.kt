package com.example.passwordsave

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.Typeface.BOLD
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.text.style.TypefaceSpan
import com.example.passwordsave.databinding.ActivityMainBinding

//로그인 화면
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var accountDB : DB? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = Intent(this, MainView::class.java)
       // accountDB = DB.getInstance(this)
        val r = Runnable {
            // 데이터에 읽고 쓸때는 쓰레드 사용
        }

        val thread = Thread(r)
        thread.start()

        binding.loginlater.setOnClickListener {
            startActivity(intent)
        }
        val textData = binding.loginThird.text.toString()
        val builder = SpannableStringBuilder(textData)
        builder.apply {
            setSpan(ForegroundColorSpan(Color.rgb(3,218,197)),0 ,2,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            setSpan(StyleSpan(Typeface.BOLD),0,2,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        binding.loginThird.text=builder
    }
}

// 정민서 왔다감 2022.07.21 번창하세요
//push pull test
//2022 07 26 wjdalstj
