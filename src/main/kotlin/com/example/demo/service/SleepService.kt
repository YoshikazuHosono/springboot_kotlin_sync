package com.example.demo.service

import org.springframework.stereotype.Service

@Service
class SleepService {

    fun sleep() {
        println("good night ...")
        Thread.sleep(5000)
        println("good morning !!!!!")
    }

}