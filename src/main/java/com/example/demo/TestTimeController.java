package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/time")
@RequiredArgsConstructor
public class TestTimeController {

	@GetMapping
	public ResponseEntity<String> findAll() {
		return ResponseEntity.ok("Tudo bem");
	}
}
