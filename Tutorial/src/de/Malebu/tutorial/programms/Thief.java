package de.Malebu.tutorial.programms;

public class Thief extends Human {
	
	private int robbedPeople;

	public Thief(String name, int age, String hobby, int robbedPeople, Gender gender) {
		super(name, age, "Dieb", hobby, gender);
		this.robbedPeople = robbedPeople;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printInformation() {
		System.out.println(getName() + " ist ein Dieb. Deshalb sind keine Informationen bekannt");
		System.out.println("auﬂer dass er schon " + robbedPeople + " Personen ausgebraubt hat");
	}
	
	 
	public int getRobbedPeople() {
		return robbedPeople;
	}

	

}
