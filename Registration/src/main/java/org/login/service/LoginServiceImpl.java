package org.login.service;

import org.login.dto.LoginDTO;
import org.login.repository.LoginRepositoryImpl;

public class LoginServiceImpl implements LoginService {
    /*
    *1. get data from controller class
    *2. send the data to repository and get back the data from persistance layer
    *3. use the data for your business logic
    *4. rerun it back to the controller class
    */
    @Override
    public boolean login(LoginDTO loginDTOFromController) {

        // service layer to get the data from database will take help of a method defined in one of the classes of a persistance layer. because persistance layer can only talk with database

        LoginRepositoryImpl loginRepository = new LoginRepositoryImpl();

        LoginDTO loginDTOFromPersistence = loginRepository.getUserInfoFromUsername(loginDTOFromController);

        //business logic
        if(loginDTOFromPersistence.getPassword().equals(loginDTOFromController.getPassword())){
            return true;
        }
        else{
            return false;
        }
    }
}
