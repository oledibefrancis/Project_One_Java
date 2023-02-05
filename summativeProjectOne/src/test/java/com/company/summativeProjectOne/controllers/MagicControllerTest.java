package com.company.summativeProjectOne.controllers;
import com.company.summativeProjectOne.models.Answer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MagicController.class)
public class MagicControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnAnswer() throws Exception{
        Answer answer = new Answer(1,"What is your name", "");

        String inputJson = mapper.writeValueAsString(answer);



        mockMvc.perform(post("/magic")
                .content(inputJson)
                .contentType(MediaType.APPLICATION_JSON)

        )
                .andExpect(status().isCreated())
                .andDo(print())
                .andExpect(jsonPath("$").isNotEmpty());

    }


}
