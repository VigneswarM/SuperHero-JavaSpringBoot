package com.example.demo.MissionDao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionDao extends CrudRepository<Mission, String> {

}