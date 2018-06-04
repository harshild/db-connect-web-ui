package com.github.harshil.service;

import com.github.harshil.jdbc.DataConnector;
import com.github.harshil.jdbc.MySQL;
import com.github.harshil.model.DBCredential;
import org.springframework.stereotype.Service;

/**
 * Created by W18NM36 on 1/24/2017.
 */
@Service
public class ConnectionService {

    DataConnector dataConnector = new MySQL();

    public boolean validateDatabaseCredentials(DBCredential dbCredential){
        return dbCredential.getHostName() != null && !dbCredential.getHostName().equals("");
    }

    public boolean testConnection(DBCredential credential){
        if(validateDatabaseCredentials(credential))
            return dataConnector.testConnection(dataConnector.createJdbcURL(credential));
        return false;
    }
}
