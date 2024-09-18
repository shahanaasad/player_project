package Beans;


import Interfaces.Person;
import Interfaces.Sports;

public class Player {
	private Sports sports;
	private Person person;
    public Player(Sports sports, Person person) {
		super();
		this.sports = sports;
		this.person = person;
	}



	public void playgame ()
	{
		System.out.println("Player belongs to : ");
		sports.sportsname();
		person.personname();
	}

}

	
