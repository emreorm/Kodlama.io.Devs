package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	void add(Language language)throws Exception;
	void update(int id, String name);
	void delete(int id);
	Language getById(int id);
	

}
