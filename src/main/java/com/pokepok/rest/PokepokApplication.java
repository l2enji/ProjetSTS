package com.pokepok.rest;

import static com.pokepok.rest.constant.FileConstant.*;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PokepokApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokepokApplication.class, args);
		new File(USER_FOLDER).mkdirs();
	}
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

}
