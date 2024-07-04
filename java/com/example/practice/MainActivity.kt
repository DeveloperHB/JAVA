package com.example.practice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.practice.R.id.btn_start
import java.util.Random
import java.util.Timer
import kotlin.concurrent.timer
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    var p_num = 3
    var k = 1
    val point_List = mutableListOf<Float>()
    var isBlind = false


    fun start() {
        setContentView(R.layout.activity_start)
        val tv_pnum: TextView = findViewById(R.id.tv_pnum)
        val btn_plus: Button = findViewById(R.id.btn_plus)
        val btn_minus: Button = findViewById(R.id.btn_minus)
        val btn_start:  Button = findViewById(R.id.btn_start)
        val btn_blind:  Button = findViewById(R.id.btn_blind)

        btn_blind.setOnClickListener{
            isBlind = !isBlind

            if (isBlind == true) {
                btn_blind.text = "Blind 모드 on"
            }else {
                btn_blind.text = "Blind 모드 off"

            }
        }

        tv_pnum.text = p_num.toString()
        btn_minus.setOnClickListener{
            p_num --
            if(p_num == 0) {
                p_num = 1
            }
            tv_pnum.text = p_num.toString()
        }
        btn_plus.setOnClickListener{
            p_num ++
            tv_pnum.text = p_num.toString()
        }
        btn_start.setOnClickListener{
            main()
        }
    }


    fun main() {
        setContentView(R.layout.activity_main)
        var timerTask: Timer? = null
        var stage = 1
        var sec: Int = 0
        val tv_point: TextView = findViewById(R.id.tv_point)
        val tv_timer: TextView = findViewById(R.id.tv_timer)
        val tv_random: TextView = findViewById(R.id.tv_random)
        val tv_people: TextView = findViewById(R.id.tv_pnum)
        val btn: Button = findViewById(R.id.btn_plus)
        val btn_i: Button = findViewById(R.id.btn_i)
        val random_box = Random()
        val num = random_box.nextInt(1001)

        tv_random.text = ((num.toFloat()) / 100).toString()
        btn.text = "시작"
        tv_people.text = "참가자 $k"

        btn_i.setOnClickListener{
            point_List.clear()
            k = 1
            start()
            p_num = 3

        }

        btn.setOnClickListener {
            stage++
            if (stage == 2) {
                timerTask = timer(period = 10) {
                    sec++
                    runOnUiThread {
                        if (isBlind == false) {

                            tv_timer.text = (sec.toFloat() / 100).toString()
                        } else if (isBlind == true && stage == 2) {
                            tv_timer.text = "???"
                        }
                    }

                }
                btn.text = "정지"
            } else if (stage == 3) {
                tv_timer.text = (sec.toFloat() / 100).toString()
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
                    end()
                    }
            }
        }
    }
fun end() {
    setContentView(R.layout.activity_end)
    val tv_last : TextView = findViewById(R.id.tv_last)
    val tv_lpoint : TextView = findViewById(R.id.tv_lpoint)
    val btn_init : TextView = findViewById(R.id.btn_init)

    tv_lpoint.text = (point_List.maxOrNull()).toString()
    var index_last = point_List.indexOf(point_List.maxOrNull())
    tv_last.text = "참가자 "+(index_last+1).toString()

    btn_init.setOnClickListener {
        point_List.clear()
        k = 1
        p_num = 3
        start()
    }


}

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
              start()

            }
        }











