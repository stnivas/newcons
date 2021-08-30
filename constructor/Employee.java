public class Employee{

  private String name;
  private int age;
 // private ArrayList<String> list;
  
  
  public Employee(String name,int age){
  this.name=name;
  this.age=age;
  

  }
  
public void setName(String name){
   this.name=name;
  }
 
public String getName(){
   return name;
  }
  
  
 public void setAge(){
   this.age=age;
  } 
 public  int getAge(){
   return age;
  } 
 public String toString(){
  return ("employee name = "+getName()+" , employee age=  "+getAge());
     }
  }   

