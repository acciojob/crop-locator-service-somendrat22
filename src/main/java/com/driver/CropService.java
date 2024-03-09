package com.driver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CropService {
	private List<Crop> crops = new ArrayList<>();

	public void addCrop(Crop crop) {
		crops.add(crop);
	}

	public Crop findCropByLocation(double latitude, double longitude) {
		return crops.stream()
				.filter(crop -> crop.getLatitude() == latitude && crop.getLongitude() == longitude)
				.findFirst()
				.orElse(null);
	}
}