package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RevService {
	@Autowired
	RevRepo repository;
	
	public Optional<Growth>getGrowth(int id){
		return repository.findById(id);
	}
	public String updateDetails(Growth arg) {
		repository.save(arg);
		return "Updated";
	}
	public String deleteDetails(int id) {
		repository.deleteById(id);
		return "Deleted";
	}

}
