package com.example.myapplication.step1

import com.example.myapplication.TestClass

class FirstTest (p:(Any)->Unit) : TestClass(p){

    override fun doTest() {

            println("종결자(;) 없어도 됩니다.")
            println("var는 읽기 쓰기. val는 읽기전용")

            var nCount : Int = 0
            var name = "psw"

            val age = 0
            //age++

            var MyMoney : Int? = null
            //println(message)
            var message = "위에서 엑세스 불가함"

            println(hiMessge)
        }
    val hiMessge : String = "Hi"
}