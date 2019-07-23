package de.Malebu.tutorial.programms;

public enum Gender {
	
	MALE("m�nnlich"),
	FEMALE("weiblich");
	
	private Gender(String translation) {
		this.translation = translation;
	}
	
	private String translation;
	
	public String getTranslation() {
		return translation;
	}

}
