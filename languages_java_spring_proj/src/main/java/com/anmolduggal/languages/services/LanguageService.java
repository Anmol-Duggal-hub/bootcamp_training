package com.anmolduggal.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.anmolduggal.languages.models.Language;
import com.anmolduggal.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
    // adding the book repository as a dependency
    private final LanguageRepository languageRepository;
    
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    // returns all the books
    public List<Language> allLanguage() {
        return languageRepository.findAll();
    }
    // creates a book
    public Language createLanguage(Language b) {
        return languageRepository.save(b);
    }
    // retrieves a book
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
   
    
    // deletes a book by id
    public void deleteById(Long id) {
    	languageRepository.deleteById(id);
    }
}
