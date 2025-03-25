//package com.viiku.ratelimiter.service;
//
//import com.viiku.ratelimiter.common.CreateUserRestModel;
//import com.viiku.ratelimiter.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//import java.util.Optional;
//
//@Service
//public class UserService {
//
//    @Autowired
//    UserRepository userRepository;
//
//    public User createUser(CreateUserRestModel createUserRestModel) {
//
//        User user = new User(
//                createUserRestModel.getFirstName(),
//                createUserRestModel.getMiddleName(),
//                createUserRestModel.getPassword(),
//                createUserRestModel.getUserId(),
//                createUserRestModel.getEmail(),
//                createUserRestModel.getPassword(),
//                new Date()
//        );
//
//        userRepository.save(user);
//        return user;
//    }
//
//    public Optional<User> getUser(String userId) {
//        return userRepository.findById(userId);
//    }
//}
