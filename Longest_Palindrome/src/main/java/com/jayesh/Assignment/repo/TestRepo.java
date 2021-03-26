package com.jayesh.Assignment.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jayesh.Assignment.entity.Palin;

@Repository
public interface TestRepo extends CrudRepository<Palin, Integer>{
	public Optional<Palin> findByName(String name);
}
