package com.github.harshil.controller;

import com.github.harshil.controller.models.DatabaseParams;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by W18NM36 on 1/23/2017.
 */
@RestController
public class DatabaseConnectionController {

    @RequestMapping("/testcon")
    public boolean testConnectionToDatabase(){
        return true;
    }
}
