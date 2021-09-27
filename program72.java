public class TestJoinMethod1 extends Thread{
     		 public void run(){  
	  for(int i=1;i<=5;i++){  
	   try{  
	    Thread.sleep(500);  
	   }catch(Exception e){System.out.println(e);}  
	  System.out.println(i);  
	  }  
	 }  


    public static void main(String args[]) {
     	 TestJoinMethod1 t1=new TestJoinMethod1();  
	 TestJoinMethod1 t2=new TestJoinMethod1();  
	 TestJoinMethod1 t3=new TestJoinMethod1();  
	 t1.start();  
	 try{  
	  t1.join();  
	 }catch(Exception e){System.out.println(e);}  
	  
	 t2.start();  
	 t3.start();  
	 }  
	} 
output:
1
2
3
4
5
1
1
2
2
3
3
4
4
5
5
