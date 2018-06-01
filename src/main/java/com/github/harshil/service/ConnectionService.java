package com.github.harshil.service;

import com.github.harshil.model.DBCredential;

/**
 * Created by W18NM36 on 1/24/2017.
 */
public class ConnectionService {
    public boolean validateDatabaseCredentials(DBCredential dbCredential){
        return dbCredential.getHostName() != null && !dbCredential.getHostName().equals("");
    }
}
