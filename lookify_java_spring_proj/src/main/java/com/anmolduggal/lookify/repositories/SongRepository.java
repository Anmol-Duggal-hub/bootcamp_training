package com.anmolduggal.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anmolduggal.lookify.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long>{
    // this method retrieves all the languages from the database
    List<Song> findAll();
}
