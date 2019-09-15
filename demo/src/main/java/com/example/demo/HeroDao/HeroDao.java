package com.example.demo.HeroDao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroDao extends CrudRepository<SuperHero, String> {

}