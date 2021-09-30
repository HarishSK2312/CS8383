	import java.net.*;  
	import java.io.*;  
public class InetDemo{
    
   	public static void main(String args[]){  
 	 	try{  
	InetAddress ip=InetAddress.getByName("www.google.com");  
	  
	System.out.println("Host Name: "+ip.getHostName());  
	System.out.println("IP Address: "+ip.getHostAddress());  
	}catch(Exception e){System.out.println(e);}  
	}  
	}  
output:
java.net.UnknownHostException: www.google.com: Temporary failure in name resolution
