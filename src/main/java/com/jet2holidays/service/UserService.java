package com.jet2holidays.service;

import com.jet2holidays.model.User;
import com.jet2holidays.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> GetAllUser() {
        return userRepository.findAll();
    }
}
