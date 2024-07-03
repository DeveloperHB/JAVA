package com.example.practice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random
import java.util.Timer
import kotlin.concurrent.timer
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    var p_num = 3
    var k = 1
    val point_List = mutableListOf<Float>()


    fun main() {
        setContentView(R.layout.activity_main)
        var timerTask: Timer? = null
        var stage = 1
        var sec: Int = 0
        val tv_point: TextView = findViewById(R.id.tv_point)
        val tv_timer: TextView = findViewById(R.id.tv_timer)
        val tv_random: TextView = findViewById(R.id.tv_random)
        val tv_people: TextView = findViewById(R.id.tv_people)
        val btn: Button = findViewById(R.id.btn_kor)
        val random_box = Random()
        val num = random_box.nextInt(1001)

        tv_random.text = ((num.toFloat()) / 100).toString()
        btn.text = "시작"
        tv_people.text = "참가자 $k"

        btn.setOnClickListener {
            stage++
            if (stage == 2) {
                timerTask = timer(period = 10) {
                    sec++
                    runOnUiThread {
                        tv_timer.text = (sec.toFloat() / 100).toString()
                    }

                }
                btn.text = "정지"
            } else if (stage == 3) {
                timerTask?.cancel()
                val point = abs(sec - num).toFloat() / 100
                point_List.add(point)
                tv_point.text = point.toString()
                btn.text = "다음"
                stage = 0
            } else if (stage == 1) {
                if (k < p_num) {
                    k++
                    main()
                } else {
                    btn.text = "게임종료"
                    btn.isEnabled = false
                    println(point_List)
                    }
            }
        }
    }


            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                main()

            }
        }











