public class Student{
    		 int rollno;  
	 String name;  
	 String city;  
	  
	 Student(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
		 
    public static void main(String args[]) {
       	Student s1=new Student(101,"Raj","lucknow");  
	   Student s2=new Student(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);  
	   System.out.println(s2); 
	 }  
	}  
output:
Student@7960847b
Student@6a6824be
