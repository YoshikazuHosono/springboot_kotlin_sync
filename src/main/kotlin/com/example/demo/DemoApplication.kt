package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@ComponentScan("com.example.demo.controller", "com.example.demo.service")
@EnableAsync
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
