	
	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.*;
public class Aftertestc2 {

	@Test
		void test1() {
			System.out.println("Test print its Before test");
			
		}
		@AfterTest
		void Before() {
			System.out.println("Before operation");
		}

	}


