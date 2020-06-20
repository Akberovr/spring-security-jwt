package com.ardevd.security.spring.auth.dao;

import com.ardevd.security.spring.auth.ApplicationUser;

import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ApplicationUserDao {
    Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
