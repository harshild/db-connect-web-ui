package com.github.harshil.controller;

import com.github.harshil.model.DBCredential;

/**
 * Created by W18NM36 on 1/24/2017.
 */
public class ConnectionController {
    public boolean validateDatabaseCredentials(DBCredential dbCredential){
        return dbCredential.getHostName() != null && !dbCredential.getHostName().equals("");
    }
}
