package com.github.harshil.model;

import lombok.*;

/**
 * Created by W18NM36 on 1/23/2017.
 */
@Builder
@ToString
@AllArgsConstructor
@Getter
@Setter
public class DBCredential {
    private String hostName;
    private int port;
    private String userName;
    private String password;
    private String instance;
    private String initialDB;
}
