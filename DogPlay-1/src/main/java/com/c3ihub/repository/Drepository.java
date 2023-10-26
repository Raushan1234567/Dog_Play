package com.c3ihub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.c3ihub.model.Dog;

public interface Drepository extends JpaRepository<Dog, Integer>{

	public Dog findByName(String dogName);

	public void deleteByName(String dogName);

}
