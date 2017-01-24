package com.github.harshil.controller.interactor;

import com.github.harshil.controller.models.DatabaseParams;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by W18NM36 on 1/24/2017.
 */
public class ConnectionInteractorTest {

    DatabaseParams databaseParams;
    ConnectionInteractor connectionInteractor;
    @Before
    public void setUp(){
        connectionInteractor = new ConnectionInteractor();
    }

    @Test
    public void validateDatabaseCredentialsAsPASSIfMandatoryFieldsAreSpecified() throws Exception {
        databaseParams = new DatabaseParams()
                .setHostName("HOST")
                .build();
        assertTrue(connectionInteractor.validateDatabaseCredentials(databaseParams));
    }

    @Test
    public void validateDatabaseCredentialsAsFAILIfMandatoryFieldsAreNOTSpecified() throws Exception {
        databaseParams = new DatabaseParams();
        assertFalse(connectionInteractor.validateDatabaseCredentials(databaseParams));
    }

}