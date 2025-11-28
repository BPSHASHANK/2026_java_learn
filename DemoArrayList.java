import java.util.ArrayList;


public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList Mylist=new ArrayList();
		//if we want store homojinous element
		//ArrayList<INteger>name=new ArrayList<INTEHER>
		// TODO Auto-generated method stub
		
		
		//operation on ArrayList
		//add
		Mylist.add(100);
		Mylist.add("shashank");
		
		Mylist.add(45);
		Mylist.add(100);
		Mylist.add(10.7);
		Mylist.add(100);
		System.out.println(Mylist);
		
		
		//Removing one element from the ArrayList
		System.out.println(Mylist.remove(1));
		
		//inserting 
		System.out.println(Mylist.add("ram"));
		
		//modify
		System.out.println(Mylist.set(2, "java"));
		//retrive teh specific data from the rray List
		System.out.println(Mylist.get(2));
		//Accessing the methods
		
//		//method one by for loop
//		for(int i=0;i<=Mylist.size();i++) {
//			System.out.println(Mylist.get(i));
//			
//		
//			
//		}
		
		//for each method
//		for (Object x:Mylist) {
//			System.out.println(x);
//		}
		
//		another method
//		//Iteation method ###############################
//		Iterator a=Mylist.iterator();
//		while(Mylist.hasNext)){
//			Sysyem.out.println(it.next());
//		}
		ArrayList v=new ArrayList();
		v.add(100);
		v.add("Shashank");
		Mylist.removeAll(v);
		System.out.println((v));
		System.out.println("after remove"+Mylist);
		
//		

	}

}
