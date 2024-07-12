package org.login.repository;

import org.login.dto.LoginDTO;

import java.util.HashMap;
import java.util.Map;

public class LoginRepositoryImpl {

    public void getDatafromDatabase(LoginDTO loginDTO){
        Map<String, String> database = new HashMap<String, String>();

        database.put("Aditya", "Aditya123");
        database.put("Rajan", "Rajan123");
        database.put("Tanuja", "Tanuja123");

        //implement rest of the implementaion
    }
}
