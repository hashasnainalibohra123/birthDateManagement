import javax.swing.*;
import javax.swing.JTable.*;
import java.awt.event.*;//E
import javax.swing.table.*;
//for color
import java.awt.*;


import java.sql.*;
import java.sql.Connection.*;
import java.sql.DriverManager.*;

class birthDateManagement
{
	//Field
	JFrame jfrm,jfrm1,jfrm2,jfrm3,jfrm4;
	JPanel panel,panel1,panel2,panel3,panel4;
	JButton jbn1,jbn2,jbn3,jbn4,jbn5,jbn6,jback,jbnc;
    	JLabel jlab1,jlab2,jlab3,jlab4,jlab11,jlab12,jlab13,jlab14,jlabc1;
	JTextField jtx1,jtx2,jtx3,jtx4,jtx11,jtx12,jtx13,jtx14,jtxc1;
	ImageIcon img=new ImageIcon("Welcome Scan.jpg");
	DefaultTableModel model; 
		JTable jtab ;
		int i;
	
	
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(
				new Runnable()
				{
					public void run()
					{
						birthDateManagement b=new birthDateManagement();
						b.mgmt();
						
					}
				
				}
		);
	
	}
	public void mgmt()
	{
		jfrm = new JFrame(".........database........");
		jfrm.setSize(1600,1600);
		jfrm.setVisible(true);
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setLayout(null);
		//jfrm.setImage(img);
		
		
		panel=new JPanel();
		panel.setBounds(400,200,600,400);
		panel.setBackground(Color.red);
		//panel.setIconImage("/Welcome Scan.jpg");
		jfrm.add(panel);
		
	jbn1=new JButton("ADD");
		jbn1.setBounds(100,50,150,30);
		jbn1.setBackground(Color.blue);
		jbn1.setForeground(Color.red);
		
		panel.add(jbn1);
		panel.setLayout(null);
		
	jbn2=new JButton("DELETE");
		jbn2.setBounds(350,50,150,30);
		jbn2.setBackground(Color.blue);
		jbn2.setForeground(Color.red);
		panel.add(jbn2);
		
	jbn3=new JButton("SEARCH");
		jbn3.setBounds(100,130,150,30);
		jbn3.setBackground(Color.blue);
		jbn3.setForeground(Color.red);
		panel.add(jbn3);
		
	jbn4=new JButton("UPDATE");
		jbn4.setBounds(350,130,150,30);
		jbn4.setBackground(Color.blue);
		jbn4.setForeground(Color.red);
		panel.add(jbn4);
		
		
	jbn5=new JButton("Exit");
		jbn5.setBounds(100,200,150,30);
		jbn5.setBackground(Color.blue);
		jbn5.setForeground(Color.red);
		panel.add(jbn5);
		
	jbn6=new JButton("ABOUT US");
		jbn6.setBounds(350,200,150,30);
		jbn6.setBackground(Color.blue);
		jbn6.setForeground(Color.red);
		panel.add(jbn6);
		System.out.println("1");
	jbn1.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(
					new Runnable()
					{
						public void run()
						{			
								jfrm.setVisible(false);
								
								birthDateManagement b1=new birthDateManagement();
								b1.ADD();
							
						}
				
					}
			);
					}
		
		});
	
	
	


	jbn2.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(
					new Runnable()
					{
						public void run()
						{			
								jfrm.setVisible(false);
								
								birthDateManagement b1=new birthDateManagement();
								b1.DELETE();
							
						}
				
					}
			);
					}
		
		});
	
	
	
	
	jbn3.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(
					new Runnable()
					{
						public void run()
						{			
								jfrm.setVisible(false);
								
								birthDateManagement b1=new birthDateManagement();
								b1.SEARCH();
							
						}
				
					}
			);
					}
		
		});
		jbn4.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(
					new Runnable()
					{
						public void run()
						{			
								jfrm.setVisible(false);
								
								birthDateManagement b1=new birthDateManagement();
								b1.UPDATE();
							
						}
				
					}
			);
					}
		
		});
	
	jbn5.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(
					new Runnable()
					{
						public void run()
						{			
								
								System.exit(0);
							
						}
				
					}
			);
					}
		
		});

	jbn6.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e5)
					{
					
					SwingUtilities.invokeLater(
					new Runnable()
					{
						public void run()
						{			
								
								birthDateManagement b1=new birthDateManagement();
								b1.ABOUTUS();
							
						}
				
					}
			);
					}
		
		});


	}
	//add function
	final public void ADD()
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
		jlab1.setForeground(Color.green);
		jlab1.setBounds(100,50,150,30);
		panel1.add(jlab1);
	
		jtx1=new JTextField("ENTER NAME HERE");
		jtx1.setForeground(Color.green);
		jtx1.setBounds(350,50,150,30);
		panel1.add(jtx1);
		
		jlab2=new JLabel("ENTER MOBILE NO.");
		jlab2.setForeground(Color.green);
		jlab2.setBounds(100,130,150,30);
		panel1.add(jlab2);
	
		jtx2=new JTextField("ENTER MOBILE NO. HERE");
		jtx2.setForeground(Color.green);
		jtx2.setBounds(350,130,150,30);
		panel1.add(jtx2);
	
	
		jlab3=new JLabel("ENTER EMAIL ID ");
		jlab3.setForeground(Color.green);
		jlab3.setBounds(100,200,150,30);
		panel1.add(jlab3);
	
		jtx3=new JTextField("ENTER EMAIL ID HERE ");
		jtx3.setForeground(Color.green);
		jtx3.setBounds(350,200,150,30);
		panel1.add(jtx3);
	
	
	
		jlab4=new JLabel("ENTER DOB");
		jlab4.setForeground(Color.green);
		jlab4.setBounds(100,270,150,30);
		panel1.add(jlab4);
	
		jtx4=new JTextField("ENTER DOB HERE");
		jtx4.setForeground(Color.green);
		jtx4.setBounds(350,270,150,30);
		panel1.add(jtx4);
		
		jbn1 =new JButton("submit");
		jbn1.setBackground(Color.pink);
		panel1.add(jbn1);
		jbn1.setBounds(425,340,150,30);
		
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(0,340,150,30);
		panel1.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						main(s);
					}
			});
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
							
							/*
			String se="create table birthMgmt (name varchar(20),mobile number,email varchar(20),DOB date);";
			*/
							String s="insert into birthMgmt values('"+s1+"',' "+s2+"','"+s3+"',"+s4+");";
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
		}//end ADD




		final public void DELETE()

		{
		
		jfrm2=new JFrame("ADD USER BIRTH DATE IN DATABASE");
		jfrm2.setSize(1600,1600);
		jfrm2.setVisible(true);
		jfrm2.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm2.setLayout(null);
		 jfrm2.setBackground(Color.yellow);
		
		
		panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(400,200,575,400);
		panel2.setBackground(Color.blue);
		
		//panel.setIconImage("/Welcome Scan.jpg");
		jfrm2.add(panel2);
		
		jlab11=new JLabel("ENTER NAME HERE TO DELETE");
		jlab11.setForeground(Color.pink);
		jlab11.setBounds(100,50,200,30);
		panel2.add(jlab11);
	
		jtx11=new JTextField("ENTER NAME HERE");
		jtx11.setForeground(Color.pink);
		jtx11.setBounds(350,50,150,30);
		panel2.add(jtx11);
		
		jbn2 =new JButton("DELETE");
		jbn2.setBackground(Color.pink);
		panel2.add(jbn2);
		jbn2.setBounds(425,340,150,30);
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(0,340,150,30);
		panel2.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						main(s);
					}
			});
		
		jbn2.addActionListener(new ActionListener()
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
							String name2=jtx11.getText();
							String s="delete  * from birthMgmt where name='"+name2+"';";
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
		
		
		
		
		
		
		}

			public void SEARCH()
			{
				
				
		jfrm3=new JFrame("SEARCH USER BIRTH DATE IN DATABASE");
		jfrm3.setSize(1600,1600);
		jfrm3.setVisible(true);
		jfrm3.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm3.setLayout(null);
		jfrm3.setBackground(Color.yellow);
		
		
		panel3=new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(400,200,600,400);
		panel3.setBackground(Color.red);
	//panel3.setPreferredSize(new Dimension(600,400));
		
		//JScrollPane jsp1=new JScrollPane(panel3);
			//jsp1.setBounds(0,0,1000,1000);
			//jfrm3.add(jsp1);


		String colHeads[]={"Name","MOBILE NO.","EMAIL","  DOB  "};
		String  col[][]={{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
		model= new DefaultTableModel(col,colHeads);
		jtab=new JTable(model);
		jtab.setBackground(Color.green);
		jfrm3.add(jtab);	
		JScrollPane jsp=new JScrollPane(jtab);
		jsp.setBounds(400,0,600,150);
			jfrm3.add(jsp);

		
		
		//panel.setIconImage("/Welcome Scan.jpg");
		jfrm3.add(panel3);
		
		jlab11=new JLabel("ENTER NAME HERE TO SEARCH DATA");
		jlab11.setForeground(Color.pink);
		jlab11.setBounds(100,50,150,30);
		panel3.add(jlab11);
	
		jtx11=new JTextField("ENTER NAME HERE");
		jtx11.setForeground(Color.pink);
		jtx11.setBounds(350,50,150,30);
		panel3.add(jtx11);
		
		jbn2 =new JButton("SEARCH");
		jbn2.setBackground(Color.pink);
		panel3.add(jbn2);
		jbn2.setBounds(425,340,150,30);
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(0,340,150,30);
		panel3.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						main(s);
					}
			});
			
		jbn2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
			try{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


				}
			catch(Exception e1)
			{
	
				System.out.println("failed to load driver");
			}
	
			try{
				String s1,s2,s3,s4,s5,s6,s10,s11;
				//s10=jtx10.getText();
				s10=jtx11.getText();
				//s3=jtx3.getText();
				//s4=jtx4.getText();
				//s5=jtx5.getText();
				//s6=jtx6.getText();
				
				String s="select * from birthMgmt where name='"+s10+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:birth","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			/*
				String se="create table birthMgmt (name varchar(20),mobile number,email varchar(20),DOB date);";
			*/
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											
											s4=" "+rs.getString(2);
											s5=" "+rs.getString(3);
											s6=" "+rs.getString(4);
											//jlab.setText(s2);
											model.insertRow(1,new String[]{s1,s4,s5,s6});
															
									}		

					
		
		//		S.executeUpdate(s);
			//	jlab9.setText("inserted into table");
			}
			catch(Exception e)
			{
			
			}
			}
			}
			);
	}

	final public void UPDATE()
	{
		jfrm4=new JFrame("UPDATE USER BIRTH DATE IN DATABASE");
		jfrm4.setSize(1600,1600);
		jfrm4.setVisible(true);
		jfrm4.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm4.setLayout(null);
		 jfrm4.setBackground(Color.yellow);
		
		
		panel4=new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(100,100,1200,1000);
		
		
		//panel.setIconImage("/Welcome Scan.jpg");
		jfrm4.add(panel4);
		jback=new JButton("BACK");
		jback.setForeground(Color.black);
		jback.setBackground(Color.white);
		jback.setBounds(0,340,150,30);
		panel4.add(jback);
		jback.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{	String s[] ={"ass","bss"};
						main(s);
					}
			});
		
		
		jlabc1=new JLabel("ENTER NAME");
		jlabc1.setForeground(Color.yellow);
		jlabc1.setBounds(30,30,150,30);
		panel4.add(jlabc1);
	
		jtxc1=new JTextField("ENTER NAME HERE");
		jtxc1.setForeground(Color.yellow);
		jtxc1.setBounds(200,30,150,30);
		panel4.add(jtxc1);
		
		
		String s=jtxc1.getText();
		
		
		
		if(!s.equals(""))
		{
		
		
		jlab1=new JLabel("ENTER NAME");
		jlab1.setForeground(Color.yellow);
		jlab1.setBounds(350,150,150,30);
		panel4.add(jlab1);
	
		jtx1=new JTextField("ENTER NAME HERE");
		jtx1.setForeground(Color.yellow);
		jtx1.setBounds(800,150,150,30);
		panel4.add(jtx1);
		
		jbnc =new JButton("ENTER");
		jbnc.setBackground(Color.pink);
		panel4.add(jbnc);
		jbnc.setBounds(30,100,150,30);
		
		jlab2=new JLabel("ENTER MOBILE NO.");
		jlab2.setForeground(Color.yellow);
		jlab2.setBounds(350,230,150,30);
		panel4.add(jlab2);
	
		jtx2=new JTextField("ENTER MOBILE NO. HERE");
		jtx2.setForeground(Color.yellow);
		jtx2.setBounds(800,230,150,30);
		panel4.add(jtx2);
	
	
		jlab3=new JLabel("ENTER EMAIL ID ");
		jlab3.setForeground(Color.yellow);
		jlab3.setBounds(350,300,150,30);
		panel4.add(jlab3);
	
		jtx3=new JTextField("ENTER EMAIL ID HERE ");
		jtx3.setForeground(Color.yellow);
		jtx3.setBounds(800,300,150,30);
		panel4.add(jtx3);
	
	
	
		jlab4=new JLabel("ENTER DOB");
		jlab4.setForeground(Color.yellow);
		jlab4.setBounds(350,370,150,30);
		panel4.add(jlab4);
	
		jtx4=new JTextField("ENTER DOB HERE");
		jtx4.setForeground(Color.yellow);
		jtx4.setBounds(800,370,150,30);
		panel4.add(jtx4);
		
		panel4.setBackground(Color.green);
		
		jbn1 =new JButton("UPDATE");
		jbn1.setBackground(Color.pink);
		panel4.add(jbn1);
		jbn1.setBounds(425,540,150,30);
		
		jlab11 = new JLabel();
		jlab11.setBounds(525,150,170,30);
		jlab11.setForeground(Color.red);
		panel4.add(jlab11);
		
		jlab12 = new JLabel();
		jlab12.setBounds(525,230,170,30);
		jlab12.setForeground(Color.red);
		panel4.add(jlab12);

jlab13 = new JLabel();
		jlab13.setBounds(525,300,170,30);
		jlab13.setForeground(Color.red);
		panel4.add(jlab13);
		
	jlab14 = new JLabel();
		jlab14.setBounds(525,370,170,30);
		jlab14.setForeground(Color.red);
		panel4.add(jlab14);
			
		
									
		
		jbnc.addActionListener(new ActionListener()
		
		{
					
					public void actionPerformed(ActionEvent e5)
					{
			try{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


				}
			catch(Exception e1)
			{
	
				System.out.println("failed to load driver");
			}
	
			try{
				String name1=jtxc1.getText();
			//	System.out.println("String is : "+a);
				String s1,s2,s3,s4,s5,s6,s10,s11;
				//s10=jtx10.getText();
				//s10=jtx11.getText();
				//s3=jtx3.getText();
				//s4=jtx4.getText();
				//s5=jtx5.getText();
				//s6=jtx6.getText();
				
				String s="select * from birthMgmt where name='"+name1+"';";
				System.out.println(s);
				Connection con = DriverManager.getConnection("jdbc:odbc:birth","","");
				Statement S = con.createStatement();
									ResultSet rs = S.executeQuery(s);
			/*
				String se="create table birthMgmt (name varchar(20),mobile number,email varchar(20),DOB date);";
			*/
									while(rs.next())
									{						
											s1=" "+rs.getString(1);
											
											s4=" "+rs.getString(2);
											s5=" "+rs.getString(3);
											s6=" "+rs.getString(4);
											//jlab.setText(s2);
											jlab11.setText(s1);
											jlab12.setText(s4);
											jlab13.setText(s5);
											jlab14.setText(s6);
											
											
										
											
									}		
											
										
					
		
			
			
			
			
			
			//	jlab9.setText("inserted into table");
				con.close();
			}
			catch(Exception e)
			{
			
			}
			}
			
			}
			);
			
			jbn1.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent e5)
					{
						try{
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


							}
						catch(Exception e1)
						{
	
							System.out.println("failed to load driver");
						}
						i=0;
						while(i<4)
	{
					try{ 		
								final	String a=jtx1.getText();
System.out.println("String is : "+a);
										final	String b=jtx2.getText();

										final	String c=jtx3.getText();

										final	String d=jtx4.getText();

								String name1=jtxc1.getText();
									Connection con = DriverManager.getConnection("jdbc:odbc:birth","","");
									Statement S = con.createStatement();
								if(i==0)
										if(!a.equals(""))	
										{
									    	String S1="update birthMgmt set name='"+a+"' where name="+"'"+name1+"';";
										    System.out.println(S1);
											S.executeUpdate(S1);
										}
									if(i==1)
								if(!b.equals(""))	
										{
											String S2="update birthMgmt set mobile='"+b+"' where name="+"'"+name1+"';";
											System.out.println(S2);
											S.executeUpdate(S2);
										}
										if(i==2)
										if(!c.equals(""))	
										{
											String S3="update birthMgmt set email='"+c+"' where name="+"'"+name1+"';";

											System.out.println(S3);
											S.executeUpdate(S3);
										}
										if(i==4)
										if(!d.equals(""))	
										{
											String S4="update birthMgmt set DOB='"+d+"' where name="+"'"+name1+"';";
											S.executeUpdate(S4);
											System.out.println(S4);
										}
			i++;
					
		con.close();
		//		S.executeUpdate(s);
			//	jlab9.setText("inserted into table");
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
				
			}//while
			}//try
			}//action performed
			
			);
			
			
			
			
			
			
			
			
			
			
			
		}
		else 
		{
			
		jlab3=new JLabel("PLEASE ENTER NAME");
		jlab3.setForeground(Color.yellow);
		jlab3.setBounds(350,300,150,30);
		panel4.add(jlab3);
		
		
		}
		
		
		
		}//end UPDATE

public void ABOUTUS()
{
	JOptionPane.showMessageDialog(null,"CREATED BY MR.HANAIN ALI BOHRA\nDIRECTED BY MR.SANJAY AGAL", "ARAHAN ISNTITUTE OF LEARNING", 1);
		








}

}





