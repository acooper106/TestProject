package mytestproject;


import org.junit.Assert;
import org.junit.Test;


public class ComputerTest {

	@Test
	public void testWelcomeMessage() {
		Computer computer = new Computer();
		Person person = new Person("John", "Lockhart"); 
		String welcomeMessage = computer.welcome(person);
		Assert.assertEquals("Welcome John Lockhart!", welcomeMessage);
	}
	


}
