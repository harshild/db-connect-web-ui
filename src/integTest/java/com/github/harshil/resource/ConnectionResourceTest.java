package com.github.harshil.resource;

import com.github.harshil.constant.URIConstants;
import com.github.harshil.model.DBCredential;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;
import java.nio.charset.Charset;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by W18NM36 on 1/23/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConnectionResourceTest {

    DBCredential dbCredential;

    @LocalServerPort
    private int port;

    private URL base;
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port);
        dbCredential = new DBCredential();
        dbCredential.setHostName("HOST");
    }

    @Test
    public void testConnectionToDatabase() throws Exception {

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept-Charset", "UTF-8");
        HttpEntity<DBCredential> request = new HttpEntity<>(dbCredential,headers );
        ResponseEntity<Boolean> response = template.postForEntity(base.toString() + URIConstants.TEST_CONNECTION_URI,request, Boolean.class);

        assertThat(response.getBody(), equalTo(true));
        assertThat(response.getStatusCode().value(), equalTo(200));
    }

}