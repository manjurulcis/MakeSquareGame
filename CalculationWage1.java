import java.text.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculationWage1 extends JFrame  //1st step
{

ImageIcon icon=new ImageIcon("jumur.gif");
JButton bb=new JButton(icon);
JButton bb1=new JButton(icon);
JLabel bb2=new JLabel(icon);

	public CalculationWage1()
	{
		super("Mess Calculation");
		Container c=getContentPane();
		c.setLayout(null);
		//Dimension d=new Dimension();
		bb.setSize(150,10);
		bb.setLocation(250,450);
		bb1.setSize(10,150);
		bb1.setLocation(250,450);
		bb2.setSize(1024,740);
				bb2.setLocation(0,0);

		c.add(bb);
		c.add(bb1);
		c.add(bb2);

					setBounds(0,0,1024,740);
					setVisible(true);
					setResizable(false);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
			public static void main (String args[])
	{


		CalculationWage1 cw=new CalculationWage1();




	}


}




