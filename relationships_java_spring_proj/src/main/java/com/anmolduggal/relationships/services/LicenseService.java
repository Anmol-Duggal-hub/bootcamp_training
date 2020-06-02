package com.anmolduggal.relationships.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anmolduggal.relationships.models.License;
import com.anmolduggal.relationships.models.Person;
import com.anmolduggal.relationships.repositories.LicenseRepository;
import com.anmolduggal.relationships.repositories.PersonRepository;

@Service
public class LicenseService {
	
	@Autowired
	private PersonRepository personRepo;
	
    @Autowired
	private LicenseRepository licenseRepo;
	
	public Person createPerson(Person b) {
		return personRepo.save(b);
	}
	
	public License createLicense(License license) {
		return licenseRepo.save(license);
	}

	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return personRepo.findAll();
	}
}
