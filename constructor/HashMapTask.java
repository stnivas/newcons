import java.util.Scanner;
import java.util.HashMap;

public class HashMapTask{

	static Scanner input=new Scanner(System.in);
	
	public HashMap<String,String> addString(int count){
					HashMap<String,String> map=new HashMap<>();
		   		
		   			for(int run=0;run<count; run++){
		   				System.out.println("enter the keys");
		   				String keys=input.next();
		   			System.out.println("enter the values");
		   				String values=input.next();
		   				map.put(keys,values);
		   			}
	
		return map;
	}
	 
	 
	public static void main(String[] args){
	
		System.out.println("enter your choice");
		int	choice=input.nextInt();
		
		switch(choice){
		
		case 1: 
				System.out.println("enter the number of pairs you need to put map");
		   		int count=input.nextInt();
		      	HashMap<String,String> map = addString(count);  
		   		
	
	}
  }	
}
