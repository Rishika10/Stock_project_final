package com.stockAnalyzer.service;

import com.stockAnalyzer.model.User;

public interface UserService {

    User signUp(User user);

    User signIn(String username, String password);
}

