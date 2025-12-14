import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Advancetestng {
	public class check{
	@BeforeMethod
	void login() {
		System.out.println("Login started");
		
	}
	@Test(priority=1)
    void Search() {
		System.out.println("Search started");
	
    }
	@Test(priority=1)

     void Advancesearch() {
		System.out.println("AdvanceSearch started");
		
	
    }
	@AfterMethod
   void logout(){
		System.out.println("Logged out");
		
	
    }
}
}
