package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.LoginService;

public class LoginServiceImpl implements LoginService {
    public void login() {
        System.out.println("User logged in successfully.");
    }
}
