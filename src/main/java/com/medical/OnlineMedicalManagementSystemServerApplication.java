package com.medical;


import java.util.HashSet;
import java.util.Set;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.medical.model.Role;
import com.medical.model.User;
import com.medical.model.UserRole;
import com.medical.service.UserService;

@SpringBootApplication
public class OnlineMedicalManagementSystemServerApplication implements CommandLineRunner{
	@Autowired
	private UserService userService;
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	public static void main(String[] args) {
		
		SpringApplication.run(OnlineMedicalManagementSystemServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting code...");
		//User user=new User();
		
//		user.setFirstName("Abhay");
//		user.setLastName("Gupta");
//		user.setUsername("Abhay@1234");
//		user.setPasssword(this.bcryptPasswordEncoder.encode("Abhay@123456"));
//		user.setEmail("");
//		user.setProfile("abh.png");
//		Role role1=new Role();
//		role1.setRoleId(45L);
//		role1.setRoleName("Admin");
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		User user1=this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
	}

}