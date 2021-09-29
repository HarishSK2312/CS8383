	import java.io.*;  
public class S {
     
    public static void main(String args[])throws Exception {
   		  FileOutputStream fout1=new FileOutputStream("f1.txt");  
	  FileOutputStream fout2=new FileOutputStream("f2.txt");  
	  
	  ByteArrayOutputStream bout=new ByteArrayOutputStream();  
	  bout.write(139);  
	  bout.writeTo(fout1);  
	  bout.writeTo(fout2);  
	  
	  bout.flush();  
	  bout.close();  
	  System.out.println("success...");  
	 }  
	}  
output:
success...
