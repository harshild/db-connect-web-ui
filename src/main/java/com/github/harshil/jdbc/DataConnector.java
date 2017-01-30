package com.github.harshil.jdbc;

import com.github.harshil.model.DBCredential;

/**
 * Created by W18NM36 on 1/30/2017.
 */
public interface DataConnector {
    String createJdbcURL(DBCredential databaseParams);
}
