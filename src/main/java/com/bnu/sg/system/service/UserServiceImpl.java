package com.bnu.sg.system.service;

import com.bnu.sg.system.dao.UserRepository;
import com.bnu.sg.system.model.User;
import com.bnu.sg.system.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserRepository userRepository;


    @Override
    public User checkUser(String studentId, String password) {
        User user = userRepository.findByStudentIdAndPassword(studentId, MD5Utils.code(password));
        return user;
    }

    @Transactional
    @Override
    public User addUser(User user1) {
        return userRepository.save(user1);
    }

}
