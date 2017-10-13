package com.bart.PersonService.services

import com.bart.PersonService.models.Person
import org.springframework.stereotype.Service

@Service
class PersonService {
    fun getPersons(): List<Person> {
        return emptyList()
    }
}