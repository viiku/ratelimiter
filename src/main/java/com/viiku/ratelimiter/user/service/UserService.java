package com.viiku.ratelimiter.user.service;

import com.viiku.ratelimiter.user.User;
import com.viiku.ratelimiter.user.payload.request.CreateUserRequest;
import com.viiku.ratelimiter.user.payload.request.UpdateUserRequest;

/**
 * Service interface named {@link UserService} for managing user operations.
 */
public interface UserService {

    /**
     * Creates a new user based on the provided CreateUserRequest.
     *
     * @param createUserRequest the CreateUserRequest containing user details
     * @return the created User object
     */
    User createuser(CreateUserRequest createUserRequest);

    /**
     * Retrieves a user by their unique identifier.
     *
     * @param id the identifier of the user to retrieve
     * @return the User object if found, otherwise null
     */
    User getUserById(String id);

    /**
     * Updates an existing user identified by their unique identifier.
     *
     * @param id               the identifier of the user to update
     * @param updateUserRequest the UpdateUserRequest containing updated user details
     * @return the updated User object
     */
    User updateUser(String id, UpdateUserRequest updateUserRequest);

    /**
     * Deletes a user by their unique identifier.
     *
     * @param id the identifier of the user to delete
     */
    void deleteUserById(String id);
}
