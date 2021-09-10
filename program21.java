public class Student11 {
        	    int id;  
	    String name;  
	    Student11(int id,String name){  
	    this.id = id;  
	    this.name = name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
    public static void main(String args[]) {
	Student11 s1 = new Student11(111,"Karan");  
	    Student11 s2 = new Student11(222,"Aryan");  
	    s1.display();  
	    s2.display();
   

    }
}
output:
111 Karan
222 Aryan
