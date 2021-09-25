public class A{
    			 
    public static void main(String args[]) {
       	StringBuffer sb=new StringBuffer();  
	System.out.println(sb.capacity());  
	sb.append("Hello");  
	System.out.println(sb.capacity());  
	sb.append("java is my favourite language");  
	System.out.println(sb.capacity());
	}  
	}  
output:
16
16
34
