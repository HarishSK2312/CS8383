	import javax.swing.*;  
	import java.awt.event.*;  

public class RadioExample extends JFrame implements ActionListener{
   		JRadioButton rb1,rb2;  
	JButton b;  
	RadioExample(){  
	  
	rb1=new JRadioButton("Male"); 
    rb1.setBounds(100,50,100,30);  
	  
	rb2=new JRadioButton("Female");  
	rb2.setBounds(100,100,100,30);  
	  
	ButtonGroup bg=new ButtonGroup();  
	bg.add(rb1);bg.add(rb2);  
	  
  b=new JButton("click");  
	b.setBounds(100,150,80,30);  
	b.addActionListener(this);  
	  
	add(rb1);add(rb2);add(b);  
	  
	setSize(300,300);  
	setLayout(null);  
	setVisible(true);  
	}  
	public void actionPerformed(ActionEvent e){  
	if(rb1.isSelected()){  
	JOptionPane.showMessageDialog(this,"You are male");  
	}  
	if(rb2.isSelected()){  
	JOptionPane.showMessageDialog(this,"You are female");  
	}  
	} 

   	public static void main(String args[]) {  
 	  	   	new RadioExample();  
	}}
output:
Exception in thread "main" java.awt.HeadlessException: 
No X11 DISPLAY variable was set, but this program performed an operation which requires it.
	at java.desktop/java.awt.GraphicsEnvironment.checkHeadless(GraphicsEnvironment.java:208)
	at java.desktop/java.awt.Window.<init>(Window.java:548)
	at java.desktop/java.awt.Frame.<init>(Frame.java:423)
	at java.desktop/java.awt.Frame.<init>(Frame.java:388)
	at java.desktop/javax.swing.JFrame.<init>(JFrame.java:180)
	at RadioExample.<init>(RadioExample.java:7)
	at RadioExample.main(RadioExample.java:38)
