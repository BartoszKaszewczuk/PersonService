package com.bart.PersonService.controllers

import com.bart.PersonService.models.Person
import com.bart.PersonService.services.PersonService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController(val personService: PersonService) {

    @GetMapping
    fun getPersons(): ResponseEntity<List<Person>> {
        return ResponseEntity.ok(personService.getPersons())
    }
}