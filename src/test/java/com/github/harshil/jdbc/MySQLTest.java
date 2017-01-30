package com.github.harshil.jdbc;

import com.github.harshil.model.DBCredential;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by W18NM36 on 1/30/2017.
 */
public class MySQLTest {

    private DataConnector mySQLConnector;
    private DBCredential databaseParams;

    @Before
    public void setUp(){
        mySQLConnector = new MySQL();
        databaseParams = DBCredential.builder()
                .hostName("Host")
                .port(22)
                .instance("Test")
                .userName("user")
                .password("pass")
                .build();

    }

    @Test
    public void itShouldCreateJdbcUrlForMySQL(){
        String expectedURL = "jdbc:mysql://user:pass@Host:22/Test";
        String actualURL = mySQLConnector.createJdbcURL(databaseParams);

        assertEquals(expectedURL,actualURL);
    }
}
