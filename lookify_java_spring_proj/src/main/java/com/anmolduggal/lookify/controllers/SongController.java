package com.anmolduggal.lookify.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.anmolduggal.lookify.models.Song;
import com.anmolduggal.lookify.services.SongService;

@Controller

public class SongController {
	 private final SongService songService;
	    
	    public SongController(SongService songService) {
	        this.songService = songService;
	    }
	    
	    @RequestMapping("/")
	    public String index(){
	    	return "/WEB-INF/index.jsp";
	    }
	    
	    
	    @RequestMapping("/dashboard")
	    public String dashboard(Model model, @ModelAttribute("song") Song song) {
	        List<Song> songs = songService.allSongs();
	        model.addAttribute("songs", songs);
	        return "/WEB-INF/dashboard.jsp";
	    }
	    
	    @RequestMapping("/songs/new")
	    public String newSong(@ModelAttribute("song") Song song) {
	        return "/WEB-INF/new.jsp";
	    }
	    
	    @RequestMapping(value="/dashboard", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/WEB-INF/new.jsp";
	        } else {
	        	songService.createSong(song);
	            return "redirect:/dashboard";
	        }
	    }
	    
	    @RequestMapping("/songs/{id}")
	    public String show(@PathVariable("id") Long id, Model model) {
	        Song song = songService.findSong(id);
	        model.addAttribute("song", song);
	        return "/WEB-INF/show.jsp";
	    }
	    
	    @RequestMapping("/search/topTen")
	    public String topTen(Model model, @ModelAttribute("song") Song song) {
	    	List<Song> songs = songService.allSongs();
	    	ArrayList<Song> topten = new ArrayList<Song>();
	    	for(int i=0; i<songs.size(); i++) {
	    		topten.add(songs.get(i));
	    	}
	    	Collections.sort(topten, new Comparator<Song>(){
	    		public int compare(Song s1, Song s2) {
	    			return s1.getRating().compareTo(s2.getRating());
	    		}
	    	});
	    	Collections.reverse(topten);
	    	model.addAttribute("topten", topten);
	    	return "/WEB-INF/topten.jsp";
	    }
	    
	    @RequestMapping(value="/search", method=RequestMethod.POST)
	    public String searchByArtist(Model model, @ModelAttribute("song") Song song, @RequestParam(value="search") String search, BindingResult result) {
	    	List<Song> songs = songService.allSongs();
	    	ArrayList<Song> artistSongList = new ArrayList<Song>();
	    	for(int i=0; i<songs.size(); i++) {
	    		if(songs.get(i).getArtist().equals(search))
	    		artistSongList.add(songs.get(i));
	    	}
	    	model.addAttribute("artistSongList", artistSongList);
	    	return "/WEB-INF/searchresult.jsp";
	    }
	    
	    @RequestMapping(value="/song/{id}/delete")
	    public String destroy(@PathVariable("id") Long id) {
	        songService.deleteById(id);
	        return "redirect:/dashboard";
	    }
}
