package com.dohn.kotlinbasic_220524

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {


            Log.d( "메인화면", "로그 버튼 눌림" )
            Log.e( "메인화면", "이거 에러야" )


        }

        btnToast.setOnClickListener {


            Toast.makeText(this, "이건알람이다", Toast.LENGTH_SHORT).show()



        }


        btnVariable.setOnClickListener {

//          여기는 변수 문법 연습 (주석 - Ctrl + / )


//           var / val로 기록 공간(변수) 만들기

            var name1 : String
            val name2 : String

//            두개의 이름 각각 저장하기 (메모 기록하기)

            name1 = "강도훈"
            name2 = "강도치"

            name1 = "박철수"
//            name2 = "끙아"

//            name1 = 1234

//            name1, name2에 기록한 값 로그로 찍어보기

            Log.d( "변수", name1 ) // 내부에 들어있는 박철수가 출력 되겠지
            Log.d( "변수", name2 ) // 이러면 도치가 출력되겠지

        }



    }
}