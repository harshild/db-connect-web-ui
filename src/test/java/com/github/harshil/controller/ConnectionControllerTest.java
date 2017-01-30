package com.github.harshil.controller;

import com.github.harshil.model.DBCredential;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by W18NM36 on 1/24/2017.
 */
public class ConnectionControllerTest {

    DBCredential dbCredential;
    ConnectionController connectionController;
    @Before
    public void setUp(){
        connectionController = new ConnectionController();
    }

    @Test
    public void validateDatabaseCredentialsAsPASSIfMandatoryFieldsAreSpecified() throws Exception {
        dbCredential = DBCredential.builder()
                .hostName("HOST")
                .build();
        assertTrue(connectionController.validateDatabaseCredentials(dbCredential));
    }

    @Test
    public void validateDatabaseCredentialsAsFAILIfMandatoryFieldsAreNOTSpecified() throws Exception {
        dbCredential = DBCredential.builder().build();
        assertFalse(connectionController.validateDatabaseCredentials(dbCredential));
    }

}