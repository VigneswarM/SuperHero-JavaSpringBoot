package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.HeroDao.HeroDao;

@Service
public class HeroService {
	
	@Autowired
	private HeroDao heroDao;


}
