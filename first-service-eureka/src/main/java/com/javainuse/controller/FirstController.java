package com.javainuse.controller;

import com.javainuse.entities.Application;
import com.javainuse.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;


@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/application")
public class FirstController {
	@Autowired
	private ApplicationService applicationService;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/save")
	public Application save(@Valid @RequestBody Application application) {
		return applicationService.save(application);
	}
	@GetMapping(value = "/all")
	public ResponseEntity<List<Application>> getAll() {
		return applicationService.getAll();
	}

	@GetMapping("/message")
	public String test() {
		return "Hello JavaInUse Called in First Service";
	}
}
