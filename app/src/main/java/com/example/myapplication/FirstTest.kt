package com.example.myapplication

class FirstTest (p:(Any)->Unit) : TestClass(p){

    override fun doTest() {
        println ("hi")
    }
}