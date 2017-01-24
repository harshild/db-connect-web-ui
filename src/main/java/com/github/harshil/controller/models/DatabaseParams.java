package com.github.harshil.controller.models;

/**
 * Created by W18NM36 on 1/23/2017.
 */
public class DatabaseParams {
    private String hostName;

    public DatabaseParams setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    public DatabaseParams build() {
        return this;
    }

    public String getHostName() {
        return hostName;
    }
}
