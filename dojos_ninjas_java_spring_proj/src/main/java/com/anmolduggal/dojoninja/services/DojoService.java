package com.anmolduggal.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anmolduggal.dojoninja.models.Dojo;
import com.anmolduggal.dojoninja.models.Ninja;
import com.anmolduggal.dojoninja.repositories.DojoRepository;
import com.anmolduggal.dojoninja.repositories.NinjaRepository;


@Service
public class DojoService {
	
	@Autowired
	private DojoRepository dojoRepo;
	
	@Autowired
	private NinjaRepository ninjaRepo;
	
	
	public Dojo createDojo(Dojo b) {
		return dojoRepo.save(b);
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}

	public List<Dojo> getAllDojos() {
		// TODO Auto-generated method stub
		return dojoRepo.findAll();
	}
	
	public List<Ninja> getAllNinjas() {
		// TODO Auto-generated method stub
		return ninjaRepo.findAll();
	}
	
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepo.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
}
