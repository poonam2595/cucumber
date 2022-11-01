package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActitimeTask {
	
	@BeforeTest
	public void login() {
		//TODO:write a code to open browser and login into the application
	}

	@Test
	public void testTaskCreation() {
		//TODO: write a code to create new task and validate it
	}
	
	@Test
	public void testTaskModification() {
		//TODO: write a code to modify newly created task and validate it
	}
	
	@Test
	public void testTaskDeletion() {
		//TODO: write a code to delete newly created task and validate it
	}
	@AfterMethod
	public void logout() {
		//TODO: write a code to logout and close the browser
	}
}
