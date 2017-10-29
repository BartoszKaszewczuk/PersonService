package com.bart.PersonService.services

import com.bart.PersonService.models.Person

interface PersonService {
    fun getPersons(): List<Person>
    fun addPerson(person: Person)
    fun getPersonByFirstname(firstname: String)
}
