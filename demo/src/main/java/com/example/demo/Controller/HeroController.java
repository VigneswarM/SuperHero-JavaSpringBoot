package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.HeroDao.SuperHero;
import com.example.demo.Service.HeroService;

@RestController
@RequestMapping("/SuperHero")
public class HeroController {

	@Autowired
	private HeroService heroService;
	

	
	
	
}
