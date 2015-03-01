import javax.swing.*;
//import javax.swing.JTable.*;
//import java.awt.event.*;//E
//import javax.swing.table.*;
//for color
import java.awt.*;


import java.sql.*;
import java.sql.Connection.*;
import java.sql.DriverManager.*;

public class birthDateManagement1
{
	//Field
	JFrame jfrm;
	JPanel panel;
	JButton jbn1,jbn2,jbn3,jbn4,jbn5,jbn6;
    //JLabel jlab1,jlab2,jlab3,jlab4;
	//JTextField jtx1,jtx2,jtx3,jtx4;
	public static void main(String args[])
	{System.out.println("fsf");

							birthDateManagement1 p=new birthDateManagement1();
								p.mgmt1();
								
	
	}
	public void mgmt1()
	{
		jfrm = new JFrame("...............DATABASE...................");
		jfrm.setSize(1600,1600);
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
		jfrm.setLayout(null);
		//jfrm.setBackground(Color.yellow);
		
		
		panel=new JPanel();
		panel.setBounds(400,200,600,400);
		jbn1.setBackground(Color.RED);
		
		//panel.setIconImage("/Welcome Scan.jpg");
		jfrm.add(panel);
		
		jbn1=new JButton("ADD");
		jbn1.setBounds(100,50,150,30);
		jbn1.setBackground(Color.BLUE);
		jbn1.setForeground(Color.RED);
		panel.add(jbn1);
		panel.setLayout(null);
		
	jbn2=new JButton("DELETE");
		jbn2.setBounds(350,50,150,30);
		jbn2.setBackground(Color.BLUE);
		jbn2.setForeground(Color.RED);
		panel.add(jbn2);
		
	jbn3=new JButton("SEARCH");
		jbn3.setBounds(100,130,150,30);
		jbn3.setBackground(Color.BLUE);
		jbn3.setForeground(Color.RED);
		panel.add(jbn3);
		
	jbn4=new JButton("UPDATE");
		jbn4.setBounds(350,130,150,30);
		jbn4.setBackground(Color.BLUE);
		jbn4.setForeground(Color.RED);
		panel.add(jbn4);
		
		
		jbn5=new JButton("Exit");
		jbn5.setBounds(100,200,150,30);
		jbn5.setBackground(Color.BLUE);
		jbn5.setForeground(Color.RED);
		panel.add(jbn5);
		
	jbn6=new JButton("ABOUT US");
		jbn6.setBounds(350,200,150,30);
		jbn6.setBackground(Color.BLUE);
		jbn6.setForeground(Color.RED);
		panel.add(jbn6);
	//	System.out.println("1");
	
		}
	
	
	
	//add function
	/*final public void ADD()
	{
		jfrm1=new JFrame("ADD USER BIRTH DATE IN DATABASE");
		jfrm1.setSize(1600,1600);
		jfrm1.setVisible(true);
		jfrm1.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm1.setLayout(null);
		 jfrm1.setBackground(Color.yellow);
		
		
		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(400,200,1600,800);
		
		
		//panel.setIconImage("/Welcome Scan.jpg");
		jfrm1.add(panel1);
		
		jlab1=new JLabel("ENTER NAME");
		jlab1.setForeground(Color.yellow);
		jlab1.setBounds(100,50,150,30);
		panel1.add(jlab1);
	
		jtx1=new JTextField("ENTER NAME HERE");
		jtx1.setForeground(Color.yellow);
		jtx1.setBounds(350,50,150,30);
		panel1.add(jtx1);
		
		jlab2=new JLabel("ENTER MOBILE NO.");
		jlab2.setForeground(Color.yellow);
		jlab2.setBounds(100,130,150,30);
		panel1.add(jlab2);
	
		jtx2=new JTextField("ENTER MOBILE NO. HERE");
		jtx2.setForeground(Color.yellow);
		jtx2.setBounds(350,130,150,30);
		panel1.add(jtx2);
	
	
		jlab3=new JLabel("ENTER EMAIL ID ");
		jlab3.setForeground(Color.yellow);
		jlab3.setBounds(100,200,150,30);
		panel1.add(jlab3);
	
		jtx3=new JTextField("ENTER EMAIL ID HERE ");
		jtx3.setForeground(Color.yellow);
		jtx3.setBounds(350,200,150,30);
		panel1.add(jtx3);
	
	
	
		jlab4=new JLabel("ENTER DOB");
		jlab4.setForeground(Color.yellow);
		jlab4.setBounds(100,270,150,30);
		panel1.add(jlab4);
	
		jtx4=new JTextField("ENTER DOB HERE");
		jtx4.setForeground(Color.yellow);
		jtx4.setBounds(350,270,150,30);
		panel1.add(jtx4);
		
		jbn1 =new JButton("submit");
		jbn1.setBackground(Color.pink);
		panel1.add(jbn1);
		jbn1.setBounds(425,340,150,30);
		jbn1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
						try
						{
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


						}
						catch(Exception e1)
						{
	
							System.out.println("failed to load driver");
						}	
	
						try
						{
							String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
							s1=jtx1.getText();//fname
							s2=jtx2.getText();//lname
							s3=jtx3.getText();//Choose Your username
							s4=jtx4.getText();//Choose Your password
							
							
			String se="create table birthMgmt (name varchar(20),mobile number,email varchar(20),DOB date);";
							String s="insert into birth values('"+s1+"',' "+s2+"','"+s3+"','"+s4+"');";
							System.out.println(s);
							Connection con = DriverManager.getConnection("jdbc:odbc:birth","","");
							System.out.println("3");
							Statement S = con.createStatement();
							S.executeUpdate(s);
							System.out.println("4");
							//S.close();
							con.close();
							
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
			}
			}
			);
		
		
		
		}*/

		








}










