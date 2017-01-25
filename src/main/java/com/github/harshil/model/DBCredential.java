package com.github.harshil.model;

/**
 * Created by W18NM36 on 1/23/2017.
 */
public class DBCredential {
    private String hostName;
    private int port;
    private String userName;
    private String password;
    private String instance;
    private String initialDB;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public String getInitialDB() {
        return initialDB;
    }

    public void setInitialDB(String initialDB) {
        this.initialDB = initialDB;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostName() {
        return hostName;
    }
}
