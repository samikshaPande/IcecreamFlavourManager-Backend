package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.models.FlavourModel;
import com.sam.models.ResponseModel;
import com.sam.repository.FlavourRepository;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/icecream")
public class IcecreamController {
	
	@Autowired
	FlavourRepository repository;
	
	@GetMapping
	public List<FlavourModel> getAllNotes() {		
		return repository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<?> saveNote(@RequestBody FlavourModel model) {
		repository.save(model);
		return ResponseEntity.ok(new ResponseModel("Flavour has been saved successfully"));
	}

}
