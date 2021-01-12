import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class reverseStringWithSwing
{
	public static void main(String ssss[])
	{	
	JFrame holder=new JFrame("Tester Frame");
	CustomPanel c=new CustomPanel();
	c.setOpaque(true);
	
	holder.add(c);
	holder.setLocationByPlatform(true);
	holder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	holder.setVisible(true);
	}
}
class CustomPanel extends JPanel
{
	String s1,reversed;
	JButton first;
	JButton second;
	JButton exit;
	JTextField tf1;
	JTextField tf2;
	CustomPanel()
	{
		first=new JButton("Enter String:");
		second=new JButton("Click to reverse String");
		tf1=new JTextField(30);
		tf2=new JTextField(30);
		add(first);
		add(tf1);
		add(second);
		add(tf2);
		tf1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				s1=tf1.getText();
				
			}	
		});	
		second.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				reversal(s1);
				System.out.println(reversed);
				tf2.setText(reversed);
				repaint();
				
			}	
		});	
	}	
	void reversal(String s)
	{
		reversed=new StringBuilder(s).reverse().toString();
	}	
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		
	}
}	
	
	