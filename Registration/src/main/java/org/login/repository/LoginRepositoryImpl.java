package org.login.repository;

import org.login.dto.LoginDTO;

import java.util.HashMap;
import java.util.Map;

public class LoginRepositoryImpl implements LoginRepository {

    @Override
    public LoginDTO getDatafromDatabase(LoginDTO loginDTO){
        Map<String, String> database = new HashMap<String, String>();

        database.put("Aditya", "Aditya123");
        database.put("Rajan", "Rajan123");
        database.put("Tanuja", "Tanuja123");

        //implement rest of the implementaion
        String userName = loginDTO.getUsername();
        //logic for getting details of the user from the database
        for(Map.Entry<String, String> entry : database.entrySet()){
        }
        return loginDTO;
    }
}
