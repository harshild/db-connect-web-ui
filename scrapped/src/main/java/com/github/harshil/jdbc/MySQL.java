package com.github.harshil.jdbc;

import com.github.harshil.model.DBCredential;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by W18NM36 on 1/30/2017.
 */
public class MySQL implements DataConnector {
    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private Connection con;

    @Override
    public String createJdbcURL(DBCredential databaseCredential) {
        return "jdbc:mysql://" +
                getUserPasswordPair(databaseCredential) +
                "@" +
                getHostPortPair(databaseCredential) +
                "/" +
                databaseCredential.getInstance();
    }

    @Override
    public boolean testConnection(String jdbcUrl) {
        initConnection(jdbcUrl);
        return con != null;
    }

    private void initConnection(String jdbcUrl) {
        try {
            Class.forName(DRIVER_CLASS);
            con = DriverManager.getConnection(jdbcUrl);
        }catch (Exception ignored){}
    }

    private String getHostPortPair(DBCredential databaseCredential) {
        return databaseCredential.getHostName() + ":" + databaseCredential.getPort();
    }

    private String getUserPasswordPair(DBCredential databaseCredential) {
        return databaseCredential.getUserName() + ":" + databaseCredential.getPassword();
    }
}
