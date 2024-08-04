package com.vita.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vita.repositoty.VehicleRepository;
import com.vita.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;

//	Fetch only Standard components
	@Override
	public List<?> getCompByModelID(long id, char c) {
		return vehicleRepository.findCompByModelId(id, c);
	}

	
	@Override
	public List<?> getConfugrableComponents(long id,String c) {
		return vehicleRepository.findConfugurableComponents(id,c);
	}
	
}