	import java.net.*;  
	import java.io.*;  
public class HttpURLConnectionDemo{
    
   	public static void main(String args[]){  
 		try{    
	URL url=new URL("http://www.google.com");    
	HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
	for(int i=1;i<=8;i++){  
	System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
	}  
	huc.disconnect();   
	}catch(Exception e){System.out.println(e);}    
	}    
	}
output:
null = null
null = null
null = null
null = null
null = null
null = null
null = null
null = null
