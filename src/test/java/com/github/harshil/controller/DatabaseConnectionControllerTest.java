package com.github.harshil.controller;

import com.github.harshil.controller.models.DatabaseParams;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by W18NM36 on 1/23/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DatabaseConnectionControllerTest {
    DatabaseParams databaseParams;

    @Autowired
    private MockMvc mvc;

    @Before
    public void setUp(){
        databaseParams = new DatabaseParams()
                .setHostName("")
                .build();
    }

    @Test
    public void testConnectionToDatabase() throws Exception {

        mvc.perform(MockMvcRequestBuilders.get("/testcon")
               // .content(databaseParams)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("true")));
    }

}