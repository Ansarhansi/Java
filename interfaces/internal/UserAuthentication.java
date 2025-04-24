package com.ansar.interfaces.internal;

public interface UserAuthentication {
    void registerUser();
    void loginUser();
    void logoutUser();
    void resetPassword();
    void changePassword();
    void verifyEmail();
    void resendVerificationEmail();
}
