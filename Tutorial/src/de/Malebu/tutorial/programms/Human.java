package de.Malebu.tutorial.programms;

public class Human extends Creature{
	
	private static int HumanCounter;
	
	private String name;
    private int age;
    private String job;
    private String hobby;
    private Gender gender;
    
	public Human(String name, int age, String job, String hobby, Gender gender) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.hobby = hobby;
		this.gender = gender;
		
		
		HumanCounter++;
	}
	
	public void printInformation() {
		System.out.println("Name der Person: " + name);
		System.out.println("Alter der Person: " + age);
		System.out.println("Beruf der Person: " + job);
		System.out.println("Hobby der Person: " + hobby);
	}
	

	@Override
	public void breed() {
		
		
	}
	

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int string) {
		this.age = string;
	}

	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public Gender getGender() {
		return gender;
	}

	
}
    
    