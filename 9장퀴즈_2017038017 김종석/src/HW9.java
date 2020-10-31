import java.awt.FlowLayout;
import javax.swing.*; 
import java.awt.*; 

class NorthPanel extends JPanel { 
	NorthPanel() 
	{ 
		this.setBackground(Color.LIGHT_GRAY); 
		this.setLayout(new FlowLayout()); 
		add(new JButton("OPEN")); 
		add(new JButton("READ")); 
		add(new JButton("CLOSE")); 
		} 
	} 
class CenterPanel extends JPanel { 
	CenterPanel() 
	{ 
		setLayout(null); 
		JLabel a =new JLabel("HELLO"); 
		JLabel b =new JLabel("JAVA"); 
		JLabel c =new JLabel("LOVE"); 
		a.setBounds(100,200,50,20); 
		b.setBounds(200,100,50,20); 
		c.setBounds(150,150,50,20); 
		add(a); add(b); add(c); 
		} 
	} 
class ExFrame extends JFrame { 
	ExFrame() 
	{ 
		this.setTitle("HW#9"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		NorthPanel np =new NorthPanel(); 
		CenterPanel cp =new CenterPanel();
		add(np, BorderLayout.NORTH);
		add(cp, BorderLayout.CENTER);
		this.setSize(300,300);
		this.setVisible(true);
		} 
	} 
public class HW9 { 
	public static void main(String[] args) { 
		new ExFrame(); 
		} 
	}