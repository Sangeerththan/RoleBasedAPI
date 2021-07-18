package com.server.roleBasedAPI.service;

import com.server.roleBasedAPI.domain.User;

import java.util.Optional;

public interface UserService {

     Optional<User> getUser(Long id);
     public User createUser(User user);
}
