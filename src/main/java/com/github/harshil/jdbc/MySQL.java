package com.github.harshil.jdbc;

import com.github.harshil.model.DBCredential;

/**
 * Created by W18NM36 on 1/30/2017.
 */
public class MySQL implements DataConnector {
    @Override
    public String createJdbcURL(DBCredential databaseCredential) {
        return "jdbc:mysql://" +
                getUserPasswordPair(databaseCredential) +
                "@" +
                getHostPortPair(databaseCredential) +
                "/" +
                databaseCredential.getInstance();
    }

    private String getHostPortPair(DBCredential databaseCredential) {
        return databaseCredential.getHostName() + ":" + databaseCredential.getPort();
    }

    private String getUserPasswordPair(DBCredential databaseCredential) {
        return databaseCredential.getUserName() + ":" + databaseCredential.getPassword();
    }
}
