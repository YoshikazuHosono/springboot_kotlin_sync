package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.example.demo.controller", "com.example.demo.service")
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
