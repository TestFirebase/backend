package com.example.teamdev.ProjectPFE.service;

import com.example.teamdev.ProjectPFE.model.User;
import com.example.teamdev.ProjectPFE.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
