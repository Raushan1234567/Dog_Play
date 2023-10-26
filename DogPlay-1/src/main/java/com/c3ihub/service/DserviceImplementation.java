package com.c3ihub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c3ihub.model.Dog;
import com.c3ihub.repository.Drepository;

@Service
public class DserviceImplementation implements DserviceInterface{
	@Autowired
	private Drepository drepository;
	
	@Override
	public Dog addDog(Dog dog) {
		// TODO Auto-generated method stub
		return drepository.save(dog);
	}

	@Override
	public String getDog(String dogName) {
		// TODO Auto-generated method stub
		Dog dn=drepository.findByName(dogName);
		String s="Dog Breed ="+dn.getBreed()+ ", Dog Nature=" +dn.getNature();
		return s;
		
	}

	@Override
	public List<Dog> getAllDog() {
		// TODO Auto-generated method stub
		return drepository.findAll();
	}

	@Override
	public String deleteAll() {
		// TODO Auto-generated method stub
		drepository.deleteAll();
		return "All the dogs data deleted";
	}

	@Override
	public String delete(String dogName) {
		Dog f=drepository.findByName(dogName);
		drepository.deleteById(f.getDog_uniqueid());
		return dogName+" the dogs data deleted";
	}

	@Override
	public Dog update(Integer dog_uniqueid, String name, String nature, String breed) {
		Optional<Dog> t=drepository.findById(dog_uniqueid);
		
		Dog r=t.get();
		r.setName(name);
		r.setNature(nature);
		r.setBreed(breed);
		drepository.save(r);
		return r;
	}

	

}
