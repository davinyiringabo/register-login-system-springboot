package com.management.registerloginstm.service;

import com.management.registerloginstm.dto.UserRegistrationDto;
import com.management.registerloginstm.model.User;

public interface UserService {

    User save(UserRegistrationDto registrationDto);
}
