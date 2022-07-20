package com.pokepok.rest.service;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.web.multipart.MultipartFile;

import com.pokepok.rest.entity.User;
import com.pokepok.rest.exception.domaine.EmailExistException;
import com.pokepok.rest.exception.domaine.EmailNotFoundException;
import com.pokepok.rest.exception.domaine.NotAnImageFileException;
import com.pokepok.rest.exception.domaine.UserNotFoundException;
import com.pokepok.rest.exception.domaine.UsernameExistException;

public interface UserService {
	User register(String firstname, String lastname, String username, String email);
	
	List<User> getUsers();
	
	User findUserByUsername(String username);
	
	User findUserByEMail(String email);
	
	User addNewUser (String firstname, String lastname, String username, String email, String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage) throws NotAnImageFileException, UserNotFoundException, UsernameExistException, EmailExistException, IOException;

	User updateUser (String currentUsername, String newFirstname, String newLastname, String newUsername, String newEmail, String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException, NotAnImageFileException;

	void deleteUser (long id);
	
	void resetPassword(String email) throws EmailNotFoundException, MessagingException;
	User updateProfileImage(String username, MultipartFile profileImage) throws NotAnImageFileException;
}
