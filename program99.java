	import javax.swing.*;  
public class Radio{
   		JFrame f;  
	  
	Radio(){  
	f=new JFrame();  
	  
	JRadioButton r1=new JRadioButton("A) Male");  
	JRadioButton r2=new JRadioButton("B) FeMale");  
	r1.setBounds(50,100,70,30);  
	r2.setBounds(50,150,70,30);  
	  
	ButtonGroup bg=new ButtonGroup();  
	bg.add(r1);bg.add(r2);  
	  
	f.add(r1);f.add(r2);  
	  
	f.setSize(300,300);  
	f.setLayout(null);  
	f.setVisible(true);  
	}  

   	public static void main(String args[]) {  
 	  	    new Radio();  
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
	at Radio.<init>(Radio.java:6)
	at Radio.main(Radio.java:24)
