package com.github.harshil.controller.interactor;

import com.github.harshil.controller.models.DatabaseParams;

/**
 * Created by W18NM36 on 1/24/2017.
 */
public class ConnectionInteractor {
    public boolean validateDatabaseCredentials(DatabaseParams databaseParams){
        return databaseParams.getHostName() != null && !databaseParams.getHostName().equals("");
    }
}
