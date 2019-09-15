package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.MissionDao.MissionDao;

@Service
public class MissionService {

	@Autowired
	private MissionDao missionDao;

	
}
