package org.login.controller;

import org.login.dto.LoginDTO;
import org.login.service.LoginService;
import org.login.service.LoginServiceImpl;

public class LogInController {
    private LoginServiceImpl loginService = new LoginServiceImpl();
    public void logIn(LoginDTO loginDTOFromUserInterface) {
        //call to the service class method for the login process
        // controller will use a method defined in one of the classes of service layer to authenticate user

        boolean isAuthenticated = loginService.login(loginDTOFromUserInterface);
        if(isAuthenticated) {
            System.out.println("Login successful");
        }
        else{
            System.out.println("Login failed");
        }
    }

    public void updatePassword(LoginDTO loginDTO){

        loginService.updatePassword(loginDTO);
    }
}
