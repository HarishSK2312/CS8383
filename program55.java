import java.util.regex.*;   
public class RegexExample4 {
    	  
    public static void main(String args[]) {
     	System.out.println("? quantifier ....");  
	System.out.println(Pattern.matches("[amn]?", "a"));
	System.out.println(Pattern.matches("[amn]?", "aaa"));  
	System.out.println(Pattern.matches("[amn]?", "aammmnn"));  
	System.out.println(Pattern.matches("[amn]?", "aazzta"));
	  
	System.out.println("+ quantifier ....");  
	System.out.println(Pattern.matches("[amn]+", "a"));  
	System.out.println(Pattern.matches("[amn]+", "aaa"));  
	System.out.println(Pattern.matches("[amn]+", "aammmnn"));  
	System.out.println(Pattern.matches("[amn]+", "aazzta")); 
	  
	System.out.println("* quantifier ....");  
	System.out.println(Pattern.matches("[amn]*", "ammmna"));  
	  
	}}
output:
? quantifier ....
true
false
false
false
+ quantifier ....
true
true
true
false
* quantifier ....
true
