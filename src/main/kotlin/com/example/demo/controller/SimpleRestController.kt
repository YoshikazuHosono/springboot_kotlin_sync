package com.example.demo.controller

import com.example.demo.service.SleepService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/simple")
class SimpleRestController {

    @Autowired
    private lateinit var sleepService: SleepService

    @GetMapping("/sleep")
    fun sleep() {
        println("start sleep service")
        sleepService.sleep()
        println("end sleep service")
    }

    @GetMapping("/asyncSleep")
    fun asyncSleep() {
        println("start asyncSleep service")
        sleepService.asyncSleep()
        println("end asyncSleep service")
    }

}
