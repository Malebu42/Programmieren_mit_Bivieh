package de.Malebu.tutorial.programms;
 
public class Beispiel {
	
	public static void main(String[] args) {
		Human max = new Human ("Max", 18, "Programmierer", "Badminton", Gender.MALE);
		Thief tom = new Thief("Tom", 45, "stehlen" , 50, Gender.FEMALE);
		
		System.out.println(max.getGender().getTranslation());
		System.out.println(tom.getGender().getTranslation());
		
		if(max instanceof Creature) {
			System.out.println("Er ist eine Kreatur");
			System.out.println("Er ist keinn wildes Tier");
		}
		
	}
}
		
		
		
		
		
		
		
		
		


























		/*
		Human lea = new Human ("Lea", 17, "Ärztin", "Häkeln");
		max.printInformation();
		max.setName("Bernd");
		
		lea.printInformation();
		lea.setName("Maria");
		
		*/
	
	


