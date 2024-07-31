package com.vita.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vita.model.Segment;
import com.vita.repositoty.SegmentRepository;
import com.vita.service.SegmentService;

@Service
public class SegmentServiceImpl implements SegmentService {
	@Autowired
	private SegmentRepository repo;
	@Override
	public List<Segment> getAllSegments() {
		
		return repo.findAll();
	}

}
