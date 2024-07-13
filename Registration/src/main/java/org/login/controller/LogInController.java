package org.login.controller;

import org.login.dto.LoginDTO;
import org.login.service.LoginServiceImpl;

public class LogInController {
    public void logIn(LoginDTO loginDTOFromUserInterface) {
        //call to the service class method for the login process
        // controller will use a method defined in one of the classes of service layer to authenticate user
        LoginServiceImpl loginService = new LoginServiceImpl();
        boolean isAuthenticated = loginService.login(loginDTOFromUserInterface);
        if(isAuthenticated) {
            System.out.println("Login successful");
        }
        else{
            System.out.println("Login failed");
        }
    }
}
