package com.anmolduggal.dojoninja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anmolduggal.dojoninja.models.Dojo;
import com.anmolduggal.dojoninja.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{
    // this method retrieves all the languages from the database
    List<Ninja> findAll();
    List<Ninja> findByDojo(Dojo dojo);
}
