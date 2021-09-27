import java.util.regex.*;   
public class RegexExample2 {
    	  
    public static void main(String args[]) {
       	System.out.println(Pattern.matches(".s", "as"));
	System.out.println(Pattern.matches(".s", "mk")); 
	System.out.println(Pattern.matches(".s", "mst"));
	System.out.println(Pattern.matches(".s", "amms"));
	System.out.println(Pattern.matches("..s", "mas")); 
	}}  
output:
true
false
false
false
true
