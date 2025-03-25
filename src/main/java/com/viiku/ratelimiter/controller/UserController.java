//package com.viiku.ratelimiter.controller;
//
//import com.viiku.ratelimiter.common.CreateUserRestModel;
//import com.viiku.ratelimiter.service.UserService;
//import jakarta.validation.Valid;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
//@RestController
//@RequestMapping("/api/v1/users")
//public class UserController {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
//
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping("/create")
//    public ResponseEntity<Map<String, Object>> createNewUser(@Valid @RequestBody CreateUserRestModel createUserRestModel) {
//        User savedUser = userService.createUser(createUserRestModel);
//
//        Map<String, Object> response = new HashMap<>();
//        response.put("message", "User created successfully");
//        response.put("userId", savedUser.getUserId());
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getUserById(@PathVariable String userId) {
//        Optional<User> user = userService.getUser(userId);
//
//        return user.isEmpty()
//        ? ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Not Found")
//        : ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
//    }
//
//    @PutMapping("/{id}")
//    public String updateUser() {
//        return "Update a user";
//    }
//
//    @DeleteMapping("{id}")
//    public String deleteUser() {
//        return "Delete user";
//    }
//
//    @GetMapping
//    public List<String> userList() {
//        List<String> ll = new ArrayList<>();
//        ll.add("vivek");
//        return ll;
//    }
//}
