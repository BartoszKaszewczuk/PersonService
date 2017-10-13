package com.bart.PersonService

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class PersonServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(PersonServiceApplication::class.java, *args)
}
