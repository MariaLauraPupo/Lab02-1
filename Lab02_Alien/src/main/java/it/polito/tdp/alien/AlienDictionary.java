package it.polito.tdp.alien;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AlienDictionary {
	
	Map<String,Word> parole;
	
	public AlienDictionary() {
		super();
		parole= new HashMap<String,Word>();
	}

	
	
	
	public void addWord(String alienWord, String translate) {
		
		Word parola=new Word(alienWord,translate);
		parole.put(alienWord+translate,parola);

	}
	
	public String translateWord(String alienWord) {
		for(Word w:parole.values()) {
			if(w!=null && w.getAlienWord().equals(alienWord)) {
				return w.getTranslation();
			}
		}
		return null;
	}




	public Map<String, Word> getParole() {
		return parole;
	}
	

}
