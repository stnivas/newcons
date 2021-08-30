import java.util.ArrayList;
public class Constructor{
  private String name;
  private int  age;
  //private ArrayList <String> list;
  //private  Constructor(string name);
   

	public Constructor(){
	  	System.out.println("Default Constructor called");
	 }
   public Constructor(String name){
	       
	  	System.out.println(name);
	 }
	public Constructor(int number){
	   System.out.println(number); 	 
   }
   
   public Constructor(ArrayList<String> list){
	   System.out.println(list); 	 
   }	
   public Constructor(Constructor custom1){
     //Constructor obj1=new Constructor();
     //Constructor obj2=new Constructor();
  System.out.println("first object"+custom1); 	 
     //System.out.println("second object"+custom2); 
      
  
   
   }
  } 
 
