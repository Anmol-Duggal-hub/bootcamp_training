package com.anmolduggal.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.anmolduggal.lookify.models.Song;
import com.anmolduggal.lookify.repositories.SongRepository;

@Service
public class SongService {
    // adding the book repository as a dependency
    private final SongRepository songRepository;
    
    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }
    // returns all the books
    public List<Song> allSongs() {
        return songRepository.findAll();
    }
    // creates a book
    public Song createSong(Song b) {
        return songRepository.save(b);
    }
    // retrieves a book
    public Song findSong(Long id) {
        Optional<Song> optionalSong = songRepository.findById(id);
        if(optionalSong.isPresent()) {
            return optionalSong.get();
        } else {
            return null;
        }
    }
   
    
    // deletes a book by id
    public void deleteById(Long id) {
    	songRepository.deleteById(id);
    }
}
