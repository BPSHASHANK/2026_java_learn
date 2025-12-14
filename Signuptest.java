import org.testng.annotations.Test;

public class Signuptest {
	@Test(priority=1,groups= {"regression"})

	void SignUpByEmail() {
		System.out.println("user sign up by eamil");
	}
	@Test(priority=2,groups= {"regression"})

	void SignUpByFB() {
		System.out.println("user sign up by FB");
	}
	@Test(priority=3,groups= {"regression"})

	void SignUpByTwitter() {
		System.out.println("user sign up by Twitter");
	}
	
		

}
