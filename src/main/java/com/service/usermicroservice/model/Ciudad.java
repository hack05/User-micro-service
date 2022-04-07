package com.service.usermicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ciudad {
	
	private Double lat;
	private Double lon;
	private String cityName;
	private Double temp;

}
