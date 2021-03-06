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


            val address = "서울시 구로구 살아염"

            Toast.makeText(this, address, Toast.LENGTH_SHORT).show()


        }

        btnCondition.setOnClickListener {

            val userAge = 15 // Int 형태로 자동 형태 완성

//            나이가 20살 이상이라면? => "성인입니다" 토스트로
            if ( userAge >= 20 ) {

                Toast.makeText(this, "성인입니다.", Toast.LENGTH_SHORT).show()

            }

            else if ( userAge >= 14 ) {

                Toast.makeText(this, "초딩입니다", Toast.LENGTH_SHORT).show()

            }


            else if ( userAge >= 17 ) {

                Toast.makeText(this, "고등학생입니다", Toast.LENGTH_SHORT).show()

            }

//            그렇지 않다면? => "미성년자입니다." 토스트로
            else {

                Toast.makeText(this, "미성년자입니다", Toast.LENGTH_SHORT).show()
                
            }

//            조건식 논리 연산 예시

//            1. 급여 높음 2. 거리가 가까움 3. 근로시간이 적으면

            val salary = 7800
            val minutes = 80
            val workHour = 35

//            연봉 4000 이상 AND 거리는 50분 이내내

            if ( salary >= 4000 && minutes > 50) {
                Log.d("조건문", "연봉과 거리 모두 만족")
            }

//            거리가 20분 이내 or 근무시간 40시간 이내
            if ( minutes < 20 || workHour < 40 ) {
                Log.d("조건문연습", "거리나 근무시간 만족")
            }

            if ( !(workHour < 50) ) {
                Log.d("조건문 not", "근무시간 빼고 다 좋아")
            }


        }

//        복사 버튼이 눌리면 > 입력된 내용을 받아서 > 텍스트뷰에 반영

        btnCopy.setOnClickListener {

//            (edtMeessage에)입력된 내용 (text 속성에 들어있는 값)을 기억 해야 > 텍스트뷰에 적을 수 있다.
//            변수에 담아두자

            val inputMessage = edtMessage.text.toString()

            txtMessage.text = inputMessage

        }


    }
}