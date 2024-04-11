package com.management.registerloginstm.service;

import com.management.registerloginstm.RegisterLoginStmApplication;
import com.management.registerloginstm.dto.UserRegistrationDto;
import com.management.registerloginstm.model.Role;
import com.management.registerloginstm.model.User;
import com.management.registerloginstm.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(
                registrationDto.getFirstName(),
                registrationDto.getLastName(),
                registrationDto.getEmail(),
                registrationDto.getPassword(),
                Arrays.asList(new Role("ROLE_USER"))
        );
        return userRepository.save(user);
    }
}
