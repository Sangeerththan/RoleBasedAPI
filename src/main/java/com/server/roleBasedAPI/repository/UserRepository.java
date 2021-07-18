package com.server.roleBasedAPI.repository;

import com.server.roleBasedAPI.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
