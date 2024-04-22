package com.windcf.sprintbootdemo.repository;

import com.windcf.sprintbootdemo.model.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsernameAndPassword(String username, String password);
}
