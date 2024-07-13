package org.login.repository;

import org.login.dto.LoginDTO;

public interface LoginRepository {

    public LoginDTO getDatafromDatabase(LoginDTO loginDTO);
}
