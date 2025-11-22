package learn;
class car{
	String brand;
	int price;

void display() {
	System.out.println("MOdel of car is "+brand+"and it sprice is"+price);
	
}
}

public class Student {
	public static void main(String args[]){
		 car a=new car() ;
			a.brand="Tesla";
			a.price=192323;
			a.display();
		 
	}
}
	

		



