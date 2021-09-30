	import java.net.*;  
	import java.io.*;  

public class URLDemo{
    
   	public static void main(String args[]){  
 		try{  
	URL url=new URL("http://www.google.com");  
	  
	System.out.println("Protocol: "+url.getProtocol());  
	System.out.println("Host Name: "+url.getHost());  
	System.out.println("Port Number: "+url.getPort());  
	System.out.println("File Name: "+url.getFile());  
	  
	}catch(Exception e){System.out.println(e);}  
	}  
	} 
output:
Protocol: http
Host Name: www.google.com
Port Number: -1
File Name:catch.java
