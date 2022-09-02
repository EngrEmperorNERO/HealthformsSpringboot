package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Healthmodel;
import com.example.demo.repository.HealthRepo;


@Service
public class HealthServiceImplement implements HealthService {
	
	@Autowired
	private HealthRepo repo;

	@Override
	public void SavedUser(Healthmodel user) {
		repo.save(user);
		
	}
	
	
}
