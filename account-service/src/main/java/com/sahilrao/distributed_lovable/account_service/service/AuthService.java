package com.sahilrao.distributed_lovable.account_service.service;


import com.sahilrao.distributed_lovable.account_service.dto.auth.AuthResponse;
import com.sahilrao.distributed_lovable.account_service.dto.auth.LoginRequest;
import com.sahilrao.distributed_lovable.account_service.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
