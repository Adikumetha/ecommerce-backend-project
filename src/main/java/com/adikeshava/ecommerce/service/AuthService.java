package com.adikeshava.ecommerce.service;

import com.adikeshava.ecommerce.payload.AuthenticationResult;
import com.adikeshava.ecommerce.payload.UserResponse;
import com.adikeshava.ecommerce.security.request.LoginRequest;
import com.adikeshava.ecommerce.security.request.SignupRequest;
import com.adikeshava.ecommerce.security.response.MessageResponse;
import com.adikeshava.ecommerce.security.response.UserInfoResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

public interface AuthService {

    AuthenticationResult login(LoginRequest loginRequest);

    ResponseEntity<MessageResponse> register(SignupRequest signUpRequest);

    UserInfoResponse getCurrentUserDetails(Authentication authentication);

    ResponseCookie logoutUser();

    UserResponse getAllSellers(Pageable pageable);
}
