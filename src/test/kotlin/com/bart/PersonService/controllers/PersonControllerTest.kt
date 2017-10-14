package com.bart.PersonService.controllers

import com.bart.PersonService.models.Person
import com.bart.PersonService.services.PersonService
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito.given
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType.APPLICATION_JSON_UTF8
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@WebMvcTest(controllers = arrayOf(PersonController::class))
class PersonControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @MockBean
    lateinit var personService: PersonService

    @Test
    fun `should list all persons`() {
        val person = Person("personFirstName", "personLastName", 19)
        given(personService.getPersons()).willReturn(listOf(person))

        val result = mockMvc.perform(MockMvcRequestBuilders.get("/api/persons"))
                .andExpect(status().isOk)
                .andExpect(content().contentType(APPLICATION_JSON_UTF8))
                .andReturn()

        assertThat(result.response.contentAsString, `is`("""[{"firstName":"personFirstName","lastName":"personLastName","age":19}]"""))
    }
}