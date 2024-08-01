package com.vita.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vita.model.Model;
import com.vita.service.ModelService;

@RestController
@CrossOrigin
@RequestMapping("/api/models")
public class ModelController {

	@Autowired
	private ModelService mod_serv;
	
	@GetMapping("/")
	public ResponseEntity<List<Model>> getAllModels() {
		try {
			List<Model> models=mod_serv.getAllModels();
			return new ResponseEntity<>(models,HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	
	@GetMapping("/{manuId}/{segId}")
	public ResponseEntity<List<Model>> fetchCombinedSegmentAndManufacturer(@PathVariable Long segId, @PathVariable Long manuId) {
		try {
			List<Model>models= mod_serv.getAllModelsByManuIdAndSegId(segId,manuId);
			return new ResponseEntity<>(models,HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		}

	@GetMapping("/{modId}")
	public ResponseEntity<Model>fetchModelsById(@PathVariable Long modId) {
		try {
			Model models= mod_serv.getModelsById(modId);
			return new ResponseEntity<>(models,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		}
	

}
