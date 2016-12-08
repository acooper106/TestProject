package mytestproject;

public class Computer {

	private String welcomeMessage;

	public String welcome(Person person) {
		welcomeMessage = "Welcome " + person.getFirstName() + " " +  person.getLastName() + "! How was your day?"; 
		return welcomeMessage;
	}

	

}
