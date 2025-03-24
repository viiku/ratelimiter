package com.viiku.ratelimiter.repository;

import com.viiku.ratelimiter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUserId(String userId);
}
