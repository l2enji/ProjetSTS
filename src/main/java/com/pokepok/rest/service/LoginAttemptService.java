package com.pokepok.rest.service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

@Service
public class LoginAttemptService {
	private static final int MAXIMUM_NUMBER_OF_ATTEMPT = 5;
	private static final int ATTEMPT_INCREMENT = 1;
	private LoadingCache<String,Integer> loginAttemptCache;
	
	public LoginAttemptService() {
		super();
		loginAttemptCache = CacheBuilder.newBuilder().expireAfterWrite(15,TimeUnit.MINUTES).maximumSize(100)
				.build(new CacheLoader<String,Integer>(){
					public Integer load(String key) {
						return 0;
					}
		});
	}

public void evinctUserFromLoginAttemptCache(String username) {
	loginAttemptCache.invalidate(username);
}

public void addUserToLoginAttemptCache (String username) {
	int attempts = 0;
	try {
		attempts = ATTEMPT_INCREMENT + loginAttemptCache.get(username);
		loginAttemptCache.put(username, attempts);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public boolean hasExceededMaxAttempts(String username) throws ExecutionException {
	
	return loginAttemptCache.get(username)>= MAXIMUM_NUMBER_OF_ATTEMPT;
}
}


