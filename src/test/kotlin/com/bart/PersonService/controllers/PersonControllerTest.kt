package com.bart.PersonService.controllers

import com.bart.PersonService.services.PersonService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc

@RunWith(SpringRunner::class)
@WebMvcTest
class PersonControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @MockBean
    lateinit var personService: PersonService

    @Test
    fun `should list all persons`() {

    }
}