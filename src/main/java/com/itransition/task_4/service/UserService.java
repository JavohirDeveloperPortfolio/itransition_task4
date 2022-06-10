package com.itransition.task_4.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.itransition.task_4.model.User;
import com.itransition.task_4.web.dto.UserRegistrationDto;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
	List<User> getAllUsers();
	User deleteUsers(List<Long> list);
	User blockUser(List<Long> list);
	User unblockUser(List<Long> list);
}
