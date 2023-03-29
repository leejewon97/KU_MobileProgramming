package com.example.prac_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        인형 옷 입히기 (체크박스 체크 시, 해당하는 이미지 덧입히기)
//        필요한 것 :  체크박스 각각의 이벤트리스너(?)
//            어떤 객체가 이벤트를 발생시켰는지를 알아낸다.
//            그 객체의 텍스트정보(이미지의 이름?)를 받아온다. : getIdentifier
//            이미지 파일명과 체크박스 텍스트를 일치시켜 놓으면, 객체의 텍스트정보를 받아와서 옷을 입힐 수 있을 것

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}