import java.util.ArrayList;
import java.util.Scanner;
public class Runner{
	static Scanner input=new Scanner(System.in); 	
  
	public static void main(String[] args){
		System.out.println("enter your choice");
		int choice=input.nextInt();
		
		switch(choice){
		
		case 1: 
		      
	           Constructor call=new Constructor();
	           break;
	    case 2:
	           System.out.println("enter the name");
	           String name=input.next();
	           Constructor call1=new Constructor(name);   
	           break; 
	    case 3:
	           System.out.println("enter the number");
	           int  number=input.nextInt();
	           Constructor call2=new Constructor(number);          
	          break;   
	             
	    case 4:
	           System.out.println("enter the name");
	           name=input.next();
	 
	           Constructor call3=new Constructor(name);          
	           break;  
	               
	   case 5:
	           System.out.println("enter the name");
	           String names=input.next();
	           //S//tring cum =custom1.add(name);
	           //System.out.println("enter the number");
	            //name =input.next();
	           Constructor call4=new Constructor(names);          
	           break;  
	           
	  case 6:   
	          
	          System.out.println("enter your name");
	           name=input.next();
	          System.out.println("enter your age");
	          int age=input.nextInt();
	          
	          Employee detailsOne=new Employee(name,age);
	       
	           System.out.println("enter your name");
	           name=input.next();
	           System.out.println("enter your age");
	           age=input.nextInt();
	          
	          Employee detailsTwo=new Employee(name,age);
	          
	            System.out.println("enter your name");
	            name=input.next();
	            System.out.println("enter your age");
	            age=input.nextInt();
	            
	         Employee detailsThree=new Employee(name,age);
	          
	          System.out.println(detailsOne.toString());
	          System.out.println(detailsTwo.toString());
	          System.out.println(detailsThree.toString());
	        break;            
	   }        
	}
}	
