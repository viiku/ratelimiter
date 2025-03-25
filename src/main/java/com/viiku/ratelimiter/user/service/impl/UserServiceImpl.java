package com.viiku.ratelimiter.user.service.impl;

import com.viiku.ratelimiter.user.User;
import com.viiku.ratelimiter.user.entity.UserEntity;
import com.viiku.ratelimiter.user.payload.request.CreateUserRequest;
import com.viiku.ratelimiter.user.payload.request.UpdateUserRequest;
import com.viiku.ratelimiter.user.repository.UserRepository;
import com.viiku.ratelimiter.user.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public User createuser(CreateUserRequest createUserRequest) {

        final UserEntity userEntityToBeSaved = createUserRequest.
        return null;
    }

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public User updateUser(String id, UpdateUserRequest updateUserRequest) {
        return null;
    }

    @Override
    public void deleteUserById(String id) {

    }
}
