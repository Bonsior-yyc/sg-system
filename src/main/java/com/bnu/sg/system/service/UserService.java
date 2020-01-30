package com.bnu.sg.system.service;

import com.bnu.sg.system.model.User;

public interface UserService {

    User checkUser(String studentId, String password);

    User addUser(User user1);
}
