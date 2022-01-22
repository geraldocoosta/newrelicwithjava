package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "breweries-service", url = "https://api.openbrewerydb.org/")
public interface BreweryFeign {

	@GetMapping("/breweries/")
	List<BreweryDTO> getBreweries();

	@GetMapping("/breweries/{id}")
	Optional<BreweryDTO> findById(@PathVariable String id);
}
