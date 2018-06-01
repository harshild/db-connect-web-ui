package com.github.harshil.service;

import com.github.harshil.model.DBCredential;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by W18NM36 on 1/24/2017.
 */
public class ConnectionServiceTest {

    DBCredential dbCredential;
    ConnectionService connectionService;
    @Before
    public void setUp(){
        connectionService = new ConnectionService();
    }

    @Test
    public void validateDatabaseCredentialsAsPASSIfMandatoryFieldsAreSpecified() throws Exception {
        dbCredential = DBCredential.builder()
                .hostName("HOST")
                .build();
        assertTrue(connectionService.validateDatabaseCredentials(dbCredential));
    }

    @Test
    public void validateDatabaseCredentialsAsFAILIfMandatoryFieldsAreNOTSpecified() throws Exception {
        dbCredential = DBCredential.builder().build();
        assertFalse(connectionService.validateDatabaseCredentials(dbCredential));
    }

}