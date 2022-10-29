package Kodlama.io.Kodlama.io.Devs.webApi.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	private LanguageService languageService;
	
    @Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
    @GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	
    @GetMapping("/getbyId")
	public Language getById( int id) {
		return languageService.getById(id);
	}
    
    @PostMapping("/add-language")
	public void add(@RequestBody Language language) throws Exception{
		languageService.add(language);
	}
	
    @PutMapping("/update-language")
	public void update(@RequestBody int id,String name) throws Exception{
		languageService.update(id, name);
	}
    @DeleteMapping("delete-language")
	public void delete(@RequestBody int id )throws Exception{
		languageService.delete(id);
	}
	

}
