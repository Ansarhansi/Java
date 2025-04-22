package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.UserService;

public class UserServiceImpl implements UserService {
    public void registerUser() {
        System.out.println("User registered.");
    }
    public void updateUser() {
        System.out.println("User updated.");
    }
    public void deleteUser() {
        System.out.println("User deleted.");
    }
}
