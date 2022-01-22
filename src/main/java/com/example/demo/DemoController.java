package com.example.demo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/demo")
@RequiredArgsConstructor
public class DemoController {

	private final BreweryFeign breweryFeign;
	
	@GetMapping("/{id}")
	public ResponseEntity<BreweryDTO> findById(@PathVariable String id ) {
		return ResponseEntity.ok( breweryFeign.findById(id).orElse(new BreweryDTO()));
	}
	
	@GetMapping
	public ResponseEntity<List<BreweryDTO>> findAll() {
		return ResponseEntity.ok( breweryFeign.getBreweries());
	}
}
