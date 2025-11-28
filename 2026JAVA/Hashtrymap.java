import java.util.HashMap;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Hashtrymap {
	//Hashmap from the map class which declare the key value pairs
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> ab = new HashMap<>();

		//adding data to the HashMap
		
		ab.put(101,"Shashank");
		ab.put(102,"Ram");
		ab.put(103,"Sham");
		ab.put(104,"bheem");
		ab.put(105,"Shiva");
		ab.put(106,"Maheshvara");
		ab.put(107,"Shashank");
        System.out.println(ab);//note if key repeates it will ignore that value key always should be unique
        //operationin an hashmap
        
        //retrive perticulaer data
        System.out.println(ab.get(101));
        //by all the key
        System.out.println(ab.keySet());
        //by value
        System.out.println(ab.values());
        
        //by all the data 
        System.out.println(ab.keySet());
        
        //by noraml for loop it not able to retrive the data
        //we need to use for each
        
        for (int a:ab.keySet()) {
        	System.out.println(a+ "  "+ab.get(a));
        	
        }
        //iterator method
       
 
}
}

