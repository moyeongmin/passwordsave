package com.example.passwordsave

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.passwordsave.databinding.ActivityMainBinding
import com.example.passwordsave.databinding.ActivityMainBinding.inflate
import com.example.passwordsave.databinding.ActivityMainViewBinding
import com.sothree.slidinguppanel.SlidingUpPanelLayout

//메인 화면
class MainView : AppCompatActivity() {
    lateinit var binding: ActivityMainViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainViewBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main_view)
        setContentView(binding.root)

        val slidePanel = binding.mainFrame

        binding.plusBtn.setOnClickListener{

            val state = slidePanel.panelState
            if (state == SlidingUpPanelLayout.PanelState.COLLAPSED) {
                slidePanel.panelState = SlidingUpPanelLayout.PanelState.ANCHORED
            }
            // 열린 상태일 경우 닫기
            else if (state == SlidingUpPanelLayout.PanelState.EXPANDED) {
                slidePanel.panelState = SlidingUpPanelLayout.PanelState.COLLAPSED
            }
        }
        val intent = Intent(this,testforaddactivity::class.java)
        binding.passwordbtn.setOnClickListener {
            startActivity(intent)
        }

        //리사이클러 뷰
        binding.recyclerView.layoutManager = LinearLayoutManager(this)


    }
}