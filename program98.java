	import java.awt.event.*;  
	import javax.swing.*;  

public class ImageButton{
   		ImageButton(){  
	JFrame f=new JFrame();  
	                  
	JButton b=new JButton(new ImageIcon("b.jpg"));  
	b.setBounds(130,100,100, 40);  
	      
	f.add(b);  
	f.setSize(300,400);  
	f.setLayout(null);  
	f.setVisible(true);  
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    }  
   	public static void main(String args[]) {  
 	  new ImageButton();  
	}  
	}  
output:
Exception in thread "main" java.awt.HeadlessException: 
No X11 DISPLAY variable was set, but this program performed an operation which requires it.
	at java.desktop/java.awt.GraphicsEnvironment.checkHeadless(GraphicsEnvironment.java:208)
	at java.desktop/java.awt.Window.<init>(Window.java:548)
	at java.desktop/java.awt.Frame.<init>(Frame.java:423)
	at java.desktop/java.awt.Frame.<init>(Frame.java:388)
	at java.desktop/javax.swing.JFrame.<init>(JFrame.java:180)
	at ImageButton.<init>(ImageButton.java:6)
	at ImageButton.main(ImageButton.java:18)
