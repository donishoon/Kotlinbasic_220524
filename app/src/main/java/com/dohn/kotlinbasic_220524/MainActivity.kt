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


            Toast.makeText( this, "이건 알람이다" , Toast.LENGTH_SHORT).show()


        }



    }
}