package com.bnu.sg.system.dao;

import com.bnu.sg.system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {

    User findByStudentIdAndPassword(String studentId,String password);
    
}
