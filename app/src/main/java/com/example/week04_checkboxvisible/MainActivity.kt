package com.example.week04_checkboxvisible

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import com.example.week04_checkboxvisible.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//        인형 옷 입히기 (체크박스 체크 시, 해당하는 이미지 덧입히기)
//        필요한 것 :  체크박스 각각의 이벤트리스너(?)
//            어떤 객체가 이벤트를 발생시켰는지를 알아낸다.
//            그 객체의 텍스트정보(이미지의 이름?)를 받아온다. : getIdentifier
//            이미지 파일명과 체크박스 텍스트를 일치시켜 놓으면, 객체의 텍스트정보를 받아와서 옷을 입힐 수 있을 것
    lateinit var binding: ActivityMainBinding
    lateinit var checkBoxArray: ArrayList<CheckBox>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    fun init(){
        binding.apply {
            checkBoxArray = arrayListOf(check1, check2, check3, check4, check5, check6, check7, check8, check9, check10)
            for (check in checkBoxArray){
                check.setOnCheckedChangeListener { button, isChecked ->
                    val imgID = resources.getIdentifier(button.text.toString(), "id", packageName)
                    val imgView = findViewById<ImageView>(imgID)
                    if (isChecked)
                        imgView.visibility = View.VISIBLE
                    else
                        imgView.visibility = View.INVISIBLE
                }
            }
        }
    }
}