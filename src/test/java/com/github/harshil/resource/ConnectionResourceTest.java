package com.github.harshil.resource;

import com.github.harshil.constant.URIConstants;
import com.github.harshil.model.DBCredential;
import net.minidev.json.JSONValue;
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

import java.nio.charset.Charset;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by W18NM36 on 1/23/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ConnectionResourceTest {
    DBCredential dbCredential;
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));


    @Autowired
    private MockMvc mvc;

    String dbCredentialString;

    @Before
    public void setUp(){
        dbCredential = DBCredential.builder()
                .hostName("HOST")
                .build();
        dbCredentialString = JSONValue.toJSONString(dbCredential);
    }

    @Test
    public void testConnectionToDatabase() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post(URIConstants.TEST_CONNECTION_URI)
                .content(dbCredentialString)
                .contentType(contentType)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("true")));
    }
}