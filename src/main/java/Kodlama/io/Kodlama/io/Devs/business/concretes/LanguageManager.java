package Kodlama.io.Kodlama.io.Devs.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	private LanguageRepository languageRepository;
	List<Language> languages;
    @Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
		
	}
	

	@Override
	public Language getById(int id) {
		
		return languageRepository.getById(id);
	}

	@Override
	public void add(Language language)throws Exception {
		
		
		languageRepository.add(language);
		
	}

	@Override
	public void update(int id,String name) {
		languageRepository.update(id, name);
		
		
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
		
	}
	

}
