package com.anmolduggal.dojoninja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anmolduggal.dojoninja.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{
    // this method retrieves all the languages from the database
    List<Dojo> findAll();
}

