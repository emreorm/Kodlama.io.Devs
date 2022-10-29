package Kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	List<Language> languages;
	

	public InMemoryLanguageRepository() {
		languages =new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));
	}


	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}
	
	public void add(Language language) throws Exception {
		if(!isNameExist(language));
	}


	@Override
	public void update(int id, String name) {
		for(Language language : languages) {
			if(language.getId()==id) {
				language.setName(name);
				break;
			}
		}
		
		
	}


	@Override
	public void delete(int id) {
		for(Language language: languages) {
			if(language.getId()==id) {
				languages.remove(language);
				break;
				
			}
		}
		
	}


	@Override
	public Language getById(int id) {
		for(Language language : languages) {
			if(language.getId()==id) {
				return language;
			}
		}
		return null;
		
	}
	public boolean isNameExist(Language language) throws Exception {
		boolean isThere = false;
		for (Language programmingLanguage : languages) {
			if (language.getName().equalsIgnoreCase(programmingLanguage.getName())) {
				isThere = true;
				break;
			}
		}
		if (language.getName().isEmpty() || language.getName().isBlank() ) {
			throw new Exception("Programlama ismi boş geçilemez!");

		} else if (!isThere && !(language.getName().isEmpty() || language.getName().isBlank())) {
			languages.add(language);
		} else {

			throw new Exception("Programlama dili tekrar edemez");
		}
		return isThere;
	}
	


	
	
	

}
