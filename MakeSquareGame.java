import java.text.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MakeSquareGame extends JFrame   //1st step
{
	int answer=0,clickCount=0,Level=0;
	boolean complete=false;
	int stickRemNum[]={4,4,4,3,5,6,8,7,9,5,6,9,7,9,6,4};
	String con[]={"            Remove 4 sticks and make 5 squares","        Remove 4 Sticks and make 7 Squares ","         Remove 4 Sticks and make 1 big & 3 small Squares","         Remove 3 Sticks and make 1 big & 4 small Squares"};
ImageIcon icon=new ImageIcon("kathi.gif");
ImageIcon icon1=new ImageIcon("kathi1.gif");



	 JToggleButton  myButton=new JToggleButton(icon);
	 JButton  myButton1=new JButton(icon);
	 JButton  myButton2=new JButton(icon);
	 JButton  myButton3=new JButton(icon);
	 JButton  myButton4=new JButton(icon);
	 JButton  myButton5=new JButton(icon);
	 JButton  myButton6=new JButton(icon);
	 JButton  myButton7=new JButton(icon);
	 JButton  myButton8=new JButton(icon);
	 JButton  myButton9=new JButton(icon);
	 JButton  myButton10=new JButton(icon);
	 JButton  myButton11=new JButton(icon);
	 JButton  myButton12=new JButton(icon1);
	 JButton  myButton13=new JButton(icon1);
	 JButton  myButton14=new JButton(icon1);
	 JButton  myButton15=new JButton(icon1);
	 JButton  myButton16=new JButton(icon1);
	 JButton  myButton17=new JButton(icon1);
	 JButton  myButton18=new JButton(icon1);
	 JButton  myButton19=new JButton(icon1);
	 JButton  myButton20=new JButton(icon1);
	 JButton  myButton21=new JButton(icon1);
	 JButton  myButton22=new JButton(icon1);
	 JButton  myButton23=new JButton(icon1);
	 JButton  nextLevel=new JButton("NextLevel>>");
	 JButton  tryagian=new JButton("TryAgain>>");
	//private Button  displayButton1;
	 TextField displayArea;
	 TextArea displayArea1;


	Container c=getContentPane();


	public MakeSquareGame()
	{
		super("MakeSquareGame");
		c.setLayout(null);
		c.setBackground(new Color(48,48,48));
		displayArea1 = new TextArea(" 24 Sticks\n9 small SQUARES\n1 big SQUARES");
				c.add(displayArea1);
				displayArea1.setLocation(755, 160);
				displayArea1.setSize(260, 500);

				displayArea1.setFont(new Font("Courier",Font.BOLD,24));
				displayArea1.setForeground(new Color(255,255,255));
				displayArea1.setBackground(new Color(48,48,48));
				displayArea1.setEnabled(false);


		displayArea = new TextField(con[0]);

		c.add(displayArea);
		displayArea.setLocation(30, 10);
		displayArea.setSize(720, 40);

		displayArea.setFont(new Font("Courier",Font.BOLD,20));
		displayArea.setForeground(new Color(255,255,255));
		displayArea.setBackground(new Color(48,48,48));
		displayArea.setEnabled(false);



		c.add(tryagian);
		tryagian.setLocation(755, 80);
	    tryagian.setSize(200, 40);
		tryagian.setFont(new Font("Courier",Font.BOLD,24));
		tryagian.setForeground(new Color(255,241,212));
		tryagian.setBackground(new Color(88,65,56));
		tryagian.setEnabled(false);


		c.add(nextLevel);
		nextLevel.setLocation(755, 10);
	    nextLevel.setSize(200, 40);
		nextLevel.setFont(new Font("Courier",Font.BOLD,24));
		nextLevel.setForeground(new Color(255,241,212));
		nextLevel.setBackground(new Color(41,90,190));
		nextLevel.setEnabled(false);

if(Level==0){
		setLocationthis();
	}
		//start row 1

		c.add(myButton);
myButton.setBackground(new Color(25,43,235));
		c.add(myButton1);

		c.add(myButton2);
		//End row 1
		//start row 2

		c.add(myButton3);

		c.add(myButton4);

		c.add(myButton5);
		//End row 2
		//start row 3

		c.add(myButton6);

		c.add(myButton7);

		c.add(myButton8);
		//End row 3
		//Start row 4

		c.add(myButton9);

		c.add(myButton10);

		c.add(myButton11);
		//End row 4
		//start column 1

		c.add(myButton12);

		c.add(myButton13);

		c.add(myButton14);

		c.add(myButton15);
		//End column 1
		//start column 2

		c.add(myButton16);

		c.add(myButton17);

		c.add(myButton18);

		c.add(myButton19);
	    //End column 2
		//start column 3

		c.add(myButton20);

		c.add(myButton21);

		c.add(myButton22);

		c.add(myButton23);

		//End column 2
		//FOR background
		//JLabel mybackground = new JLabel(icon);
		//mybackground.setBackground(new Color(20,115,21));
		//mybackground.setSize(1100,768);
   		//c.add(mybackground);
		setBounds(0,0,1024,740);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Give the action
        //for button1
		myButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae){
		 answer=answer+1;
		 clickCount=clickCount+1;
		 wrongmsgforDis1();
		 if(clickCount<=stickRemNum[Level]){
		 myButton.setVisible(false); }
		 if(clickCount==stickRemNum[Level]){
			 if(Level==0){
		 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
		 congratulation();
		 else
		 wrongmsg();
	 }else if(Level==1){

	 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
	 		 congratulation();
	 		 else
		 wrongmsg();
	 }
	 else if(Level==2){
		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
	 		congratulation();
	 		else
	 		wrongmsg();

	 }
	 else if(Level==3)
	 {
		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
		 congratulation();
		 else
	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
		 }
		 });
		//for button2
		myButton1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
		clickCount=clickCount+1;

		answer=answer+2;

		wrongmsgforDis1();
		if(clickCount<=stickRemNum[Level]){
		myButton1.setVisible(false);}
		 if(clickCount==stickRemNum[Level]){
					 if(Level==0){
				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
				 congratulation();
				 else
				 wrongmsg();
			 }else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();



	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
		}
		});

		//for button3
		myButton2.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
		answer=answer+3;
		clickCount=clickCount+1;
		wrongmsgforDis1();
		if(clickCount<=stickRemNum[Level]){
		myButton2.setVisible(false);
		}
		 if(clickCount==stickRemNum[Level]){
					 if(Level==0){
				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
				 congratulation();
				 else
				 wrongmsg();
			 }else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
		}
		});

		//for button4
		myButton3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
		answer=answer+4;
		clickCount=clickCount+1;
		wrongmsgforDis1();
		if(clickCount<=stickRemNum[Level]){
		myButton3.setVisible(false);
		}
		 if(clickCount==stickRemNum[Level]){
					 if(Level==0){
				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
				 congratulation();
				 else
				 wrongmsg();
			 }else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
		}
		});

		//for button5
				myButton4.addActionListener(new ActionListener()
		 		 {
		 			 public void actionPerformed(ActionEvent ae)
		 			 {
						 answer=answer+5;

						 clickCount=clickCount+1;
						 wrongmsgforDis1();
						 if(clickCount<=stickRemNum[Level]){
		 				 myButton4.setVisible(false);
					 }
		 if(clickCount==stickRemNum[Level]){
					 if(Level==0){
				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
				 congratulation();
				 else
				 wrongmsg();
			 }else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
		 			 }

				 });

		//for button1
				myButton5.addActionListener(new ActionListener()
		 		 {
		 			 public void actionPerformed(ActionEvent ae)
		 			 {
						 answer=answer+6;

						 clickCount=clickCount+1;
						 wrongmsgforDis1();
						 if(clickCount<=stickRemNum[Level]){
		 				 myButton5.setVisible(false);
					 }


		 if(clickCount==stickRemNum[Level]){
					 if(Level==0){
				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
				 congratulation();
				 else
				 wrongmsg();
			 }else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
		 			 }

				 });


		//for button1
				myButton6.addActionListener(new ActionListener()
		 		 {
		 			 public void actionPerformed(ActionEvent ae)
		 			 {
						 answer=answer+7;

						 clickCount=clickCount+1;
						 wrongmsgforDis1();
						 if(clickCount<=stickRemNum[Level]){
		 				 myButton6.setVisible(false);
					 }
		 if(clickCount==stickRemNum[Level]){
					 if(Level==0){
				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
				 congratulation();
				 else
				 wrongmsg();
			 }else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
		 			 }

				 });


		//for button1
				myButton7.addActionListener(new ActionListener()
		 		 {
		 			 public void actionPerformed(ActionEvent ae)
		 			 {
						 answer=answer+8;

						 clickCount=clickCount+1;
						 wrongmsgforDis1();
						 if(clickCount<=stickRemNum[Level]){
		 				 myButton7.setVisible(false);
					 }
		 if(clickCount==stickRemNum[Level]){
					 if(Level==0){
				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
				 congratulation();
				 else
				 wrongmsg();
			 }else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
		 			 }

				 });


		//for button1
				myButton8.addActionListener(new ActionListener()
		 		 {
		 			 public void actionPerformed(ActionEvent ae)
		 			 {
						 answer=answer+9;

						 clickCount=clickCount+1;
						 wrongmsgforDis1();
						 if(clickCount<=stickRemNum[Level]){
		 				 myButton8.setVisible(false);
					 }
		if(clickCount==stickRemNum[Level]){
			if(Level==0){
							     if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
						  		 congratulation();
						  		 else
						  		 wrongmsg();
							 }
else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }

					 }
					 if(clickCount==stickRemNum[Level]){
					 		 finishedgame();
	 }
		 			 }

				 });



				 //for button1
				 		myButton9.addActionListener(new ActionListener()
				  		 {
				  			 public void actionPerformed(ActionEvent ae)
				  			 {
								 answer=answer+10;

								 clickCount=clickCount+1;
								 wrongmsgforDis1();
								 if(clickCount<=stickRemNum[Level]){
				  				 myButton9.setVisible(false);
							 }
		 if(clickCount==stickRemNum[Level]){
					 if(Level==0){
				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
				 congratulation();
				 else
				 wrongmsg();
			 }else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
				  			 }

				 		 });

				 //for button1
				 		myButton10.addActionListener(new ActionListener()
				  		 {
				  			 public void actionPerformed(ActionEvent ae)
				  			 {
								 clickCount=clickCount+1;
								 answer=answer+11;

				wrongmsgforDis1();
								 if(clickCount<=stickRemNum[Level]){
				  				 myButton10.setVisible(false);
							 }

								 if(clickCount==stickRemNum[Level]){
											 if(Level==0){
										 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
										 congratulation();
										 else
										 wrongmsg();
									 }else if(Level==1){

									 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
									 		 congratulation();
									 		 else
										 wrongmsg();
									 }
									 else if(Level==2){
									 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
									 	 		congratulation();
									 	 		else
									 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
				  			 }

				 		 });

				 //for button1
				 		myButton11.addActionListener(new ActionListener()
				  		 {
				  			 public void actionPerformed(ActionEvent ae)
				  			 {
								 clickCount=clickCount+1;
								 answer=answer+12;
								 wrongmsgforDis1();

								 if(clickCount<=stickRemNum[Level]){
				  				 myButton11.setVisible(false);
							 }
							  if(clickCount==stickRemNum[Level]){
							 			 if(Level==0){
							 		 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
							 		 congratulation();
							 		 else
							 		 wrongmsg();
							 	 }else if(Level==1){

							 	 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
							 	 		 congratulation();
							 	 		 else
							 		 wrongmsg();
							 	 }
							 	 else if(Level==2){
								 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
								 	 		congratulation();
								 	 		else
								 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
				  			 }

				 		 });

				 //for button1
				 		myButton12.addActionListener(new ActionListener()
				  		 {
				  			 public void actionPerformed(ActionEvent ae)
				  			 {
								 clickCount=clickCount+1;
								 answer=answer+13;
								 wrongmsgforDis1();

								 if(clickCount<=stickRemNum[Level]){
				  				 myButton12.setVisible(false);
							 }
		 if(clickCount==stickRemNum[Level]){
					 if(Level==0){
				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
				 congratulation();
				 else
				 wrongmsg();
			 }else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
				  			 }

				 		 });

				 //for button1
				 		myButton13.addActionListener(new ActionListener()
				  		 {
				  			 public void actionPerformed(ActionEvent ae)
				  			 {
								 clickCount=clickCount+1;
								 answer=answer+14;
								 wrongmsgforDis1();

								 if(clickCount<=stickRemNum[Level]){
				  				 myButton13.setVisible(false);
							 }
		 if(clickCount==stickRemNum[Level]){
					 if(Level==0){
				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
				 congratulation();
				 else
				 wrongmsg();
			 }else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
				  			 }

				 		 });

				 //for button1
				 		myButton14.addActionListener(new ActionListener()
				  		 {
				  			 public void actionPerformed(ActionEvent ae)
				  			 {
								 clickCount=clickCount+1;
								 answer=answer+15;
								 wrongmsgforDis1();

								 if(clickCount<=stickRemNum[Level]){
				  				 myButton14.setVisible(false);
							 }
		 if(clickCount==stickRemNum[Level]){
					 if(Level==0){
				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
				 congratulation();
				 else
				 wrongmsg();
			 }else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
				  			 }

				 		 });

				 //for button1
				 		myButton15.addActionListener(new ActionListener()
				  		 {
				  			 public void actionPerformed(ActionEvent ae)
				  			 {
								 clickCount=clickCount+1;
								 answer=answer+16;
								 wrongmsgforDis1();

								 if(clickCount<=stickRemNum[Level]){
				  				 myButton15.setVisible(false);
							 }
		 if(clickCount==stickRemNum[Level]){
					 if(Level==0){
				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
				 congratulation();
				 else
				 wrongmsg();
			 }else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
				  			 }

				 		 });

				 //for button1
				 		myButton16.addActionListener(new ActionListener()
				  		 {
				  			 public void actionPerformed(ActionEvent ae)
				  			 {
								 clickCount=clickCount+1;
								 answer=answer+17;
								 wrongmsgforDis1();

								 if(clickCount<=stickRemNum[Level]){
				  				 myButton16.setVisible(false);
							 }

		if(clickCount==stickRemNum[Level]){
							 if(Level==0){
						 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
						 congratulation();
						 else
						 wrongmsg();
					 }else if(Level==1){

					 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
					 		 congratulation();
					 		 else
						 wrongmsg();
					 }
					 else if(Level==2){
					 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
					 	 		congratulation();
					 	 		else
					 	 		wrongmsg();

			 }
			 else if(Level==3)
			 	 {
			 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
			 		 congratulation();
			 		 else
			 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
				  			 }

				 		 });

				 //for button1
				 		myButton17.addActionListener(new ActionListener()
				  		 {
				  			 public void actionPerformed(ActionEvent ae)
				  			 {
								 clickCount=clickCount+1;
								 answer=answer+18;
								 wrongmsgforDis1();

								 if(clickCount<=stickRemNum[Level]){
				  				 myButton17.setVisible(false);
							 }
		 if(clickCount==stickRemNum[Level]){
					 if(Level==0){
				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
				 congratulation();
				 else
				 wrongmsg();
			 }else if(Level==1){

			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
			 		 congratulation();
			 		 else
				 wrongmsg();
			 }
			 else if(Level==2){
			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
			 	 		congratulation();
			 	 		else
			 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
				  			 }

				 		 });

				 //for button1
				 		myButton18.addActionListener(new ActionListener()
				  		 {
				  			 public void actionPerformed(ActionEvent ae)
				  			 {
								 clickCount=clickCount+1;
								 answer=answer+19;
								 wrongmsgforDis1();

								 if(clickCount<=stickRemNum[Level]){
				  				 myButton18.setVisible(false);
							 }
		if(clickCount==stickRemNum[Level]){
							 if(Level==0){
						 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
						 congratulation();
						 else
						 wrongmsg();
					 }else if(Level==1){

					 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
					 		 congratulation();
					 		 else
						 wrongmsg();
					 }
					 else if(Level==2){
					 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
					 	 		congratulation();
					 	 		else
					 	 		wrongmsg();

			 }
			 else if(Level==3)
			 	 {
			 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
			 		 congratulation();
			 		 else
			 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
				  			 }

				 		 });

				 //for button1
				 		myButton19.addActionListener(new ActionListener()
				  		 {
				  			 public void actionPerformed(ActionEvent ae)
				  			 {
								 clickCount=clickCount+1;
								 answer=answer+20;

								 wrongmsgforDis1();
								 if(clickCount<=stickRemNum[Level]){
				  				 myButton19.setVisible(false);
							 }

				  				  if(clickCount==stickRemNum[Level]){
								 			 if(Level==0){
								 		 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
								 		 congratulation();
								 		 else
								 		 wrongmsg();
								 	 }else if(Level==1){

								 	 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
								 	 		 congratulation();
								 	 		 else
								 		 wrongmsg();
								 	 }
								 	 else if(Level==2){
									 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
									 	 		congratulation();
									 	 		else
									 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }

				  			 }

				 		 });

				 //for button1
				 		myButton20.addActionListener(new ActionListener()
				  		 {
				  			 public void actionPerformed(ActionEvent ae)
				  			 {
								 clickCount=clickCount+1;
								 answer=answer+21;
								 wrongmsgforDis1();

								 if(clickCount<=stickRemNum[Level]){
				  				 myButton20.setVisible(false);
							 }
				  				 if(clickCount==stickRemNum[Level]){
								 					 if(Level==0){
								 				 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
								 				 congratulation();
								 				 else
								 				 wrongmsg();
								 			 }else if(Level==1){

								 			 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
								 			 		 congratulation();
								 			 		 else
								 				 wrongmsg();
								 			 }
								 			 else if(Level==2){
								 			 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
								 			 	 		congratulation();
								 			 	 		else
								 			 	 		wrongmsg();

								 	 }
			else if(Level==3)
	 {
		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
		 congratulation();
		 else
	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }

				  			 }

				 		 });

				 //for button1
				 		myButton21.addActionListener(new ActionListener(){
				  			 public void actionPerformed(ActionEvent ae){
								 clickCount=clickCount+1;
								 answer=answer+22;
								 wrongmsgforDis1();

								 if(clickCount<=stickRemNum[Level]){
				  				 myButton21.setVisible(false);
							 }
				  				  if(clickCount==stickRemNum[Level]){
								 			 if(Level==0){
								 		 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
								 		 congratulation();
								 		 else
								 		 wrongmsg();
								 	 }else if(Level==1){

								 	 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
								 	 		 congratulation();
								 	 		 else
								 		 wrongmsg();
								 	 }
								 	 else if(Level==2){
									 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
									 	 		congratulation();
									 	 		else
									 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 finishedgame();
	 }

				  			 }
				 		 });

				 //for button1
				 		myButton22.addActionListener(new ActionListener(){
				  			 public void actionPerformed(ActionEvent ae) {
								 clickCount=clickCount+1;
								 answer=answer+23;
								 wrongmsgforDis1();

								 if(clickCount<=stickRemNum[Level]){
				  			 myButton22.setVisible(false);
						 }
				  			  if(clickCount==stickRemNum[Level]){
							 			 if(Level==0){
							 		 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
							 		 congratulation();
							 		 else
							 		 wrongmsg();
							 	 }else if(Level==1){

							 	 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
							 	 		 congratulation();
							 	 		 else
							 		 wrongmsg();
							 	 }
							 	 else if(Level==2){
								 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
								 	 		congratulation();
								 	 		else
								 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }
				  		 }
				 		 });
				 //for button1
				 		myButton23.addActionListener(new ActionListener(){
				  			 public void actionPerformed(ActionEvent ae){
								 clickCount=clickCount+1;

								 wrongmsgforDis1();

								 if(clickCount<=stickRemNum[Level]){
				  				 myButton23.setVisible(false);
							 }
				  				 if(clickCount==stickRemNum[Level]){
											 if(Level==0){
										 if(myButton1.isVisible()==false&&myButton10.isVisible()==false&&myButton16.isVisible()==false&&myButton19.isVisible()==false)
										 congratulation();
										 else
										 wrongmsg();
									 }else if(Level==1){

									 if((myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton13.isVisible()==false&&myButton1.isVisible()==false)||(myButton1.isVisible()==false&&myButton14.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton5.isVisible()==false&&myButton19.isVisible()==false)||(myButton19.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false&&myButton11.isVisible()==false)||(myButton23.isVisible()==false&&myButton11.isVisible()==false&&myButton22.isVisible()==false&&myButton10.isVisible()==false)||(myButton10.isVisible()==false&&myButton21.isVisible()==false&&myButton9.isVisible()==false&&myButton20.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton6.isVisible()==false&&myButton16.isVisible()==false)||(myButton16.isVisible()==false&&myButton3.isVisible()==false&&myButton12.isVisible()==false&&myButton1.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton11.isVisible()==false&&myButton23.isVisible()==false)||(myButton.isVisible()==false&&myButton12.isVisible()==false&&myButton2.isVisible()==false&&myButton15.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton23.isVisible()==false&&myButton11.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton9.isVisible()==false&&myButton1.isVisible()==false)||(myButton9.isVisible()==false&&myButton20.isVisible()==false&&myButton11.isVisible()==false&&myButton3.isVisible()==false)||(myButton2.isVisible()==false&&myButton15.isVisible()==false&&myButton20.isVisible()==false&&myButton9.isVisible()==false))
									 		 congratulation();
									 		 else
										 wrongmsg();
									 }
									 else if(Level==2){
									 		 if((myButton3.isVisible()==false&&myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton8.isVisible()==false)||(myButton14.isVisible()==false&&myButton5.isVisible()==false&&myButton6.isVisible()==false&&myButton21.isVisible()==false)||(myButton3.isVisible()==false&&myButton6.isVisible()==false&&myButton5.isVisible()==false&&myButton8.isVisible()==false)||(myButton13.isVisible()==false&&myButton14.isVisible()==false&&myButton21.isVisible()==false&&myButton22.isVisible()==false))
									 	 		congratulation();
									 	 		else
									 	 		wrongmsg();

	 }
	 else if(Level==3)
	 	 {
	 		 if((myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton3.isVisible()==false&&myButton8.isVisible()==false&&myButton22.isVisible()==false)||(myButton13.isVisible()==false&&myButton8.isVisible()==false&&myButton3.isVisible()==false)||(myButton13.isVisible()==false&&myButton22.isVisible()==false&&myButton3.isVisible()==false)||(myButton7.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton21.isVisible()==false&&myButton14.isVisible()==false&&myButton5.isVisible()==false)||(myButton14.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false)||(myButton5.isVisible()==false&&myButton7.isVisible()==false&&myButton21.isVisible()==false))
	 		 congratulation();
	 		 else
	 	 	 wrongmsg();

	 }
		 }
		 if(clickCount==stickRemNum[Level]){
		 		 finishedgame();
	 }

				  			 }
		 		 });



			nextLevel.addActionListener(new ActionListener(){
		  			 public void actionPerformed(ActionEvent ae){
						 nextLevel.setEnabled(false);

						displayArea1.setText(" 24 Sticks\n9 small SQUARES\n1 big SQUARES");
						 if(complete==false)
						 {
							displayArea.setText("First you haveTo Play this level");
							tryagian.setEnabled(true);
						 }else{
						 clickCount=0;

						 setLocationthis();
						 nextLevel();
						displayArea.setText(con[Level]);
					}
					complete=false;
		  			 }
		 		 });




tryagian.addActionListener(new ActionListener(){
		  			 public void actionPerformed(ActionEvent ae){
						 tryagian.setEnabled(false);
						complete=false;
						clickCount=0;
						displayArea1.setText(" 24 Sticks\n9 small SQUARES\n1 big SQUARES");
						setLocationthis();
						nextLevel();
						if(Level!=0)
						{
						Level=Level-1;
						}
						 displayArea.setFont(new Font("Courier",Font.BOLD,20));
						 displayArea.setText(con[Level]);
		  			 }
		 		 });




}
public void setLocationthis()
{
		myButton.setLocation(165, 55);
		myButton.setSize(151, 15);
		myButton.setBackground(new Color(233,55,48));
		myButton.setBorder(BorderFactory.createEmptyBorder());

		myButton1.setLocation(316, 55);
	    myButton1.setSize(151, 15);
	    myButton1.setBackground(new Color(233,55,48));
		myButton1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

	    myButton2.setLocation(525, 55);
	    myButton2.setSize(210, 15);

	    myButton3.setLocation(100, 252);
		myButton3.setSize(218, 15);

	    myButton4.setLocation(317, 252);
	    myButton4.setSize(211, 15);

	    myButton5.setLocation(525, 252);
	    myButton5.setSize(210, 15);

	    myButton6.setLocation(100, 450);
		myButton6.setSize(218, 15);

	    myButton7.setLocation(315, 450);
	    myButton7.setSize(213, 15);

	    myButton8.setLocation(525, 450);
		myButton8.setSize(210, 15);

		myButton9.setLocation(100, 650);
	    myButton9.setSize(218, 15);

	    myButton10.setLocation(317, 650);
	    myButton10.setSize(211, 15);

	    myButton11.setLocation(525, 650);
	    myButton11.setSize(210, 15);

	    myButton12.setLocation(100, 68);
		myButton12.setSize(15, 186);

		myButton13.setLocation(311, 68);
	    myButton13.setSize(15, 186);

	    myButton14.setLocation(519, 68);
		myButton14.setSize(15, 186);

		myButton15.setLocation(720, 68);
		myButton15.setSize(15, 186);

		myButton16.setLocation(100, 265);
		myButton16.setSize(15, 186);

		myButton17.setLocation(310, 265);
		myButton17.setSize(15, 186);

		myButton18.setLocation(520, 265);
		myButton18.setSize(15, 186);

		myButton19.setLocation(720, 265);
		myButton19.setSize(15, 186);

		myButton20.setLocation(100, 465);
		myButton20.setSize(15, 186);

		myButton21.setLocation(310, 465);
		myButton21.setSize(15, 186);

	    myButton22.setLocation(520, 465);
		myButton22.setSize(15, 186);


		myButton23.setLocation(720, 465);
	    myButton23.setSize(15, 186);




	    }
public void congratulation(){
	displayArea.setFont(new Font("Courier",Font.BOLD,20));
displayArea.setText("Congratulation!!! To Play NextLevel Click Nextlevel Button");
complete=true;
tryagian.setEnabled(false);
nextLevel.setEnabled(true);
if(complete==true)
{if(Level==3){
	nextLevel.setEnabled(false);
}
}

}
public void wrongmsg(){

displayArea.setText(" **Wrong** To Play again Click Try again Button");
complete=false;
tryagian.setEnabled(true);
nextLevel.setEnabled(false);
}
public void wrongmsgforDis1(){
if(clickCount==1){
displayArea1.setText("You have clicked\n"+clickCount+" Button");
}
else if(clickCount>1&&clickCount<=stickRemNum[Level])
{
displayArea1.setText("You have clicked\n"+clickCount+" Buttons");
}
else
{
displayArea1.setText("You have clicked\n more than\n"+clickCount+" Buttons\nPlease click \nNextLevel or \ntryAgain button");
}

}
public void finishedgame(){
if(complete==true)
{
	if(Level==3){
	displayArea.setText("Congratulation!!! You have successfully played all levels");
	int choice=JOptionPane.showConfirmDialog(this,"To play again 'YES' or to Exit 'NO'");

		     if(choice==JOptionPane.YES_OPTION)
			 {
			    myButton.setVisible(true);
	myButton1.setVisible(true);
	myButton2.setVisible(true);
	myButton3.setVisible(true);
	myButton4.setVisible(true);
	myButton5.setVisible(true);
	myButton6.setVisible(true);
	myButton7.setVisible(true);
	myButton8.setVisible(true);
	myButton9.setVisible(true);
	myButton10.setVisible(true);
	myButton11.setVisible(true);
	myButton12.setVisible(true);
	myButton13.setVisible(true);
	myButton14.setVisible(true);
	myButton15.setVisible(true);
	myButton16.setVisible(true);
	myButton17.setVisible(true);
	myButton18.setVisible(true);
	myButton19.setVisible(true);
	myButton20.setVisible(true);
	myButton21.setVisible(true);
	myButton22.setVisible(true);
	myButton23.setVisible(true);
	setLocationthis();
	Level=0;clickCount=0;
	displayArea.setText(con[Level]);
	displayArea1.setText(" 24 Sticks\n9 small SQUARES\n1 big SQUARES");
		 }else if(choice==JOptionPane.NO_OPTION)
		 {
		 System.exit(0);
	 }
	 else if(choice==JOptionPane.CANCEL_OPTION)
	 {
		 tryagian.setEnabled(true);
	 }

}

}
}


public void nextLevel(){
	myButton.setVisible(true);
	myButton1.setVisible(true);
	myButton2.setVisible(true);
	myButton3.setVisible(true);
	myButton4.setVisible(true);
	myButton5.setVisible(true);
	myButton6.setVisible(true);
	myButton7.setVisible(true);
	myButton8.setVisible(true);
	myButton9.setVisible(true);
	myButton10.setVisible(true);
	myButton11.setVisible(true);
	myButton12.setVisible(true);
	myButton13.setVisible(true);
	myButton14.setVisible(true);
	myButton15.setVisible(true);
	myButton16.setVisible(true);
	myButton17.setVisible(true);
	myButton18.setVisible(true);
	myButton19.setVisible(true);
	myButton20.setVisible(true);
	myButton21.setVisible(true);
	myButton22.setVisible(true);
	myButton23.setVisible(true);

	Level=Level+1;

}
	public static void main (String args[]){

		MakeSquareGame cw=new MakeSquareGame();

	}
}