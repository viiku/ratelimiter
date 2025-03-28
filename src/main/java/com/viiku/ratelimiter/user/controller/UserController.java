package com.viiku.ratelimiter.user.controller;

import com.viiku.ratelimiter.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller named {@link UserController} for managing user operations.
 * This controller provides endpoints to create, retrieve, update, and delete users,
 * as well as retrieve a paginated list of users.
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;


}
