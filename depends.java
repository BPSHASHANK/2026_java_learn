import org.testng.Assert;
import org.testng.annotations.Test;

//hee we are using dependance method which works

public class depends {
	@Test(priority=1)
	void Test1() {
		Assert.assertTrue(false);
		                   
	}
	@Test(priority=2,dependsOnMethods= {"Test1"})
	void Test2() {
		Assert.assertTrue(true);
		                   
	}
	@Test(priority=3,dependsOnMethods= {"Test2"})
	void Test3() {
		Assert.assertTrue(false);
		                   
	}
	@Test(priority=4)
	void Test4() {
		Assert.assertTrue(true);
		                   
	}


}
