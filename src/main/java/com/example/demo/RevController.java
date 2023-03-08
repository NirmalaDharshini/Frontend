package com.example.demo;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RevController {
	@Autowired
	RevRepo serviceRepsitory;
	@Autowired
	RevService service;
	
	@GetMapping("/get")
	List<Growth>getList()
	{
		return serviceRepsitory.findAll();
	}
	@PostMapping("/post")
	public Growth create(@RequestBody Growth arg) {
		return serviceRepsitory.save(arg);
	}
	@GetMapping
	public Optional<Growth> getbyid(@PathVariable int id)
	{
		return service.getGrowth(id);
	}
	@PutMapping("/put")
	public String update(@RequestBody Growth arg)
	{
		return service.updateDetails(arg);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		return service.deleteDetails(id);	

	}
}
