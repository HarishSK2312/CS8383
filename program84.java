	import java.io.*;  
public class Simple {
     
    public static void main(String args[]) {
   	  	  try{  
	   FileWriter fw=new FileWriter("abc.txt");  
	   fw.write("my name is sachin");  
	   fw.close();  
	  }catch(Exception e){System.out.println(e);}  
	  System.out.println("success");  
	 }  
	}  
output:
success
