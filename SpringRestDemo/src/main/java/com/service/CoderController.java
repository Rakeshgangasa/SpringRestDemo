package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Coder;
import com.repository.CoderRepository;

@Service
public class CoderService {
	
	@Autowired
	CoderRepository coderrepo;
	
	public List<Coder> getCoders()
	{
		List<Coder> lc=coderrepo.findAll();
		return lc;
		
	}
	public Coder addCoder(Coder c) {
		Coder c1=coderrepo.save(c);
		return c1;
	}
	public List<Coder> addCoders(List<Coder>lc)
	{
		List<Coder> lc1=coderrepo.saveAll(lc);
		return lc1;
		
	}
	
	

}