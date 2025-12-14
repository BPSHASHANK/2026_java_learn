import org.testng.annotations.Test;

public class PaymentTest {
	@Test(groups= {"regression","sanity"})
	
	
void PaymentByRs() {
		System.out.println("Done by indian rs");
	
}
	@Test(priority=2,groups= {"regression","sanity"})
	
	
void PaymentByDoller() {
		System.out.println("Done by US doller");
	
}
}
