import org.testng.annotations.Test;

public class Logintest {
	@Test(priority=1,groups= {"sanity"})
	void LoginByEmail()
	{
		System.out.println("user loggeed in by email");
	}
	@Test(priority=2,groups= {"sanity"})
	void LoginByFacebook()
	{
		System.out.println("user loggeed in by Facebook");
	}
	@Test(priority=3,groups= {"sanity"})
	void LoginByTwitter()
	{
		System.out.println("user loggeed in by email");
	}
}
