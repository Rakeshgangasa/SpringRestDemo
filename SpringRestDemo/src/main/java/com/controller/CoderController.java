package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Coder;
import com.service.CoderService;

@RestController
@RequestMapping("api")
public class CoderController {
	
	@Autowired
	CoderService coderservice;
	
	@GetMapping(path="getcoders")
	public List<Coder> getCoders()
	{
		List<Coder> lc=coderservice.getCoders();
		
		return lc;	
	}
	@PostMapping("addcoder")
	public Coder addCoder(@RequestBody Coder c) {
		Coder c1=coderservice.addCoder(c);
		return c1;
	}
	@PostMapping(path="addcoders")
	public List<Coder> addCoders(@RequestBody List<Coder>lc)
	{
		List<Coder> lc1=coderservice.addCoders(lc);
		
		return lc1;	
	}
	
	
	
	
	

}