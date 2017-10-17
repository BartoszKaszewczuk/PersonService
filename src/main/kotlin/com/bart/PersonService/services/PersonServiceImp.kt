package com.bart.PersonService.services

import com.bart.PersonService.models.Person
import org.springframework.stereotype.Service

@Service
class PersonServiceImp : PersonService {

    override fun getPersons(): List<Person> {
        return emptyList()
    }

    override fun addPerson(person: Person) {
        TODO("stub")
    }

    override fun getPersonByFirstname(firstname: String) {
        TODO("stub")
    }
}
