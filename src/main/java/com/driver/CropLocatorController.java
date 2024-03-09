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
		this.cropService = cropService;
	}

	@PostMapping("/register")
	public ResponseEntity<String> registerCrop(@RequestBody Crop crop) {
		cropService.addCrop(crop);
		return new ResponseEntity<>("Crop registered successfully!", HttpStatus.CREATED);
	}

	@GetMapping("/locate/{latitude}/{longitude}")
	public ResponseEntity<Crop> getCropByLocation(@RequestParam double latitude, @RequestParam double longitude) {
		Crop foundCrop = cropService.findCropByLocation(latitude, longitude);

		if (foundCrop != null) {
			return new ResponseEntity<>(foundCrop, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}