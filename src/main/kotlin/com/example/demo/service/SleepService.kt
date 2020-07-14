package com.example.demo.service

import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service

@Service
class SleepService {

    fun sleep() {
        println("good night ...")
        Thread.sleep(5000)
        println("good morning !!!!!")
    }

    @Async
    fun asyncSleep() {
        println("async good night ...")
        Thread.sleep(5000)
        println("async good morning !!!!!")
    }

}