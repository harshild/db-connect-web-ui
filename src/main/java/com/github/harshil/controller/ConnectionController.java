package com.github.harshil.controller;

import com.github.harshil.constant.URIConstants;
import com.github.harshil.model.DBCredential;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by W18NM36 on 1/23/2017.
 */
@RestController
public class ConnectionController {

    @RequestMapping(value = URIConstants.TEST_CONNECTION_URI, method = RequestMethod.POST )
    public boolean testConnectionToDatabase(@RequestBody DBCredential dbCredential){
        return true;
    }
}
