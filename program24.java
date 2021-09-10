public class S {
     	 void m(){  
	  System.out.println("method is invoked");  
	  }  
	  void n(){  
	  this.m();  
	  }  
	  void p(){  
	  n();  
	  }  
	      
    public static void main(String args[]) {
    S s1 = new S();  
	  s1.p();  
	  
    }
}
output:
method is invoked
