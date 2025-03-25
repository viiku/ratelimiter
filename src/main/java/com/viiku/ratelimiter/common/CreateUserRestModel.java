//package com.viiku.ratelimiter.common;
//
//import jakarta.persistence.Id;
//import jakarta.validation.constraints.NotBlank;
//
//public class CreateUserRestModel {
//
//    @NotBlank(message = "First Name can not be blank")
//    private String firstName;
//
//    private String middleName;
//
//    @NotBlank(message = "Last Name can not be blank")
//    private String lastName;
//
//    @Id
//    @NotBlank(message = "User ID can not be blank")
//    private String userId;
//
//    @NotBlank(message = "Email can not be blank")
//    private String email;
//
//    @NotBlank(message = "Password can not be blank")
//    private String password;
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName = middleName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
