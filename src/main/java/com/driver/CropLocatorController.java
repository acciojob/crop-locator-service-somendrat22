package com.driver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crop-locator")
public class CropLocatorController {
	 private final CropService cropService;

	    public CropLocatorController(CropService cropService) {
	    	// your code goes here
	    
	    }

	    @PostMapping("/register")
	    public ResponseEntity<String> registerCrop(@RequestBody Crop crop) {
	    	// your code goes here
	        return null;
	    }

	    @GetMapping("/locate")
	    public ResponseEntity<Crop> getCropByLocation(@RequestParam double latitude, @RequestParam double longitude) {
	    	// your code goes here
	    	return null;
	    }

}
