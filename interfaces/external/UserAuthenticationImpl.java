package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.UserAuthentication;

public class UserAuthenticationImpl implements UserAuthentication {
    @Override
    public void registerUser() {
        System.out.println("Registering user...");
    }

    @Override
    public void loginUser() {
        System.out.println("Logging in user...");
    }

    @Override
    public void logoutUser() {
        System.out.println("Logging out user...");
    }

    @Override
    public void resetPassword() {
        System.out.println("Resetting password...");
    }

    @Override
    public void changePassword() {
        System.out.println("Changing password...");
    }

    @Override
    public void verifyEmail() {
        System.out.println("Verifying email...");
    }

    @Override
    public void resendVerificationEmail() {
        System.out.println("Resending verification email...");
    }
}
