	import java.awt.*;  
	import java.awt.event.*;  
 	  
public class AEvent extends Frame implements ActionListener{
   	TextField tf;  
	AEvent(){  
	  
	tf=new TextField();  
	tf.setBounds(60,50,170,20);  
	  
	Button b=new Button("click me");  
	b.setBounds(100,120,80,30);  
	  
	b.addActionListener(this);  
	  
	add(b);add(tf);  
	  
	setSize(300,300);  
	setLayout(null);  
	setVisible(true);  
	  
	}  
	  
	public void actionPerformed(ActionEvent e){  
	tf.setText("Welcome");  
	}  


   	public static void main(String args[]) {  
 	  	new AEvent();  
	}  
	}  
output:
Exception in thread "main" java.awt.HeadlessException: 
No X11 DISPLAY variable was set, but this program performed an operation which requires it.
	at java.desktop/java.awt.GraphicsEnvironment.checkHeadless(GraphicsEnvironment.java:208)
	at java.desktop/java.awt.Window.<init>(Window.java:548)
	at java.desktop/java.awt.Frame.<init>(Frame.java:423)
	at java.desktop/java.awt.Frame.<init>(Frame.java:388)
	at AEvent.<init>(AEvent.java:6)
	at AEvent.main(AEvent.java:30)
