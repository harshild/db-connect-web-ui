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
        dbCredential = new DBCredential();
        dbCredential.setHostName("HOST");
        assertTrue(connectionController.validateDatabaseCredentials(dbCredential));
    }

    @Test
    public void validateDatabaseCredentialsAsFAILIfMandatoryFieldsAreNOTSpecified() throws Exception {
        dbCredential = new DBCredential();
        assertFalse(connectionController.validateDatabaseCredentials(dbCredential));
    }

}