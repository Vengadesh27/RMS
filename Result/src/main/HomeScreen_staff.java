package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class HomeScreen_staff {

	public JFrame frame;
	JLayeredPane Sub_Home;
	JPanel All_StudentsPanel;
	JPanel Add_StudentsPanel;
	JPanel Update_StudentsPanel;
	JPanel Delete_StudentsPanel;
	JPanel ManageAccount_panel;
	JLayeredPane MainPanel;
	JPanel Internal_Result;
	JButton btn_AddStudents;
	JButton btn_AllStudents;
	JButton btnUpdateStudent;
	JButton btnDeleteStudent;
	JPanel Internals_1;
	JPanel Internals_2;
	JPanel Internals_3;
	JLayeredPane Sub_Internal_panel; 
	public JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField del_name;
	private JTextField del_reg;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	
	   String url = "jdbc:mysql://localhost:3306/resultsystem";
	   String username = "root";
	   String password = "root123";
	   Connection con;
	   Statement st;
	   ResultSet rs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen_staff window = new HomeScreen_staff();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
public void switchPanels(JPanel panel) {
		
	Sub_Home.removeAll();
    Sub_Home.add(panel);
    Sub_Home.repaint();
    Sub_Home.revalidate();
	}

public void switchInternalResultPanels(JPanel panel) {
	
	Sub_Internal_panel.removeAll();
	Sub_Internal_panel.add(panel);
	Sub_Internal_panel.repaint();
	Sub_Internal_panel.revalidate();
	}

public void switchMainPanels(JPanel panel2) {
	
	MainPanel.removeAll();
    MainPanel.add(panel2);
    MainPanel.repaint();
    MainPanel.revalidate();
	}

	public HomeScreen_staff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Header_panel = new JPanel();
		Header_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		Header_panel.setBackground(new Color(255, 128, 0));
		
		MainPanel = new JLayeredPane();
		MainPanel.setLayout(new CardLayout(0, 0));
		
		JPanel home = new JPanel();
		home.setBackground(new Color(240, 240, 240));
		MainPanel.add(home, "name_16538477246999");
		
		JPanel SidePanel_Home = new JPanel();
		SidePanel_Home.setBorder(new LineBorder(new Color(0, 0, 0)));
		SidePanel_Home.setBackground(new Color(250, 235, 215));
		
		 Sub_Home = new JLayeredPane();
		
		 btn_AllStudents = new JButton("All Students");
		btn_AllStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(All_StudentsPanel);
			 
				
				btn_AddStudents.setBackground(new Color(255,255,255));
				btnUpdateStudent.setBackground(new Color(255,255,255));
				btn_AllStudents.setBackground(new Color(255,128,0));
				btnDeleteStudent.setBackground(new Color(255,255,255));
				 
				 try {
				 String query = "select * from studentdetails";
		    	  con = DriverManager.getConnection(url,username,password);
		          st = con.createStatement();
		          rs = st.executeQuery(query);
		         
				
				 DefaultTableModel model = (DefaultTableModel) table.getModel();
				 model.setRowCount(0);
		         String name , regno , dept , branch , course , year;
		         
		         while  (rs.next()) {
		        	 name = rs.getString(1);
		        	 regno = rs.getString(2);
		        	 dept = rs.getString(3);
		        	 branch = rs.getString(4);
		        	 course = rs.getString(5);
		        	 year = rs.getString(6);
		        	 String [] row = {name , regno , dept , branch , course , year};
		        	 model.addRow(row);
				
				
			}}catch(SQLException e1) {e1.printStackTrace();}}
		});
		btn_AllStudents.setBorder(new LineBorder(new Color(255, 128, 0)));
		btn_AllStudents.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btn_AllStudents.setBackground(new Color(255, 128, 0));
		
		JButton btnNewButton_3_1 = new JButton("Log Out");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginScreen_Result login = new LoginScreen_Result();
				login.frame.setVisible(true);
				
				
				
				
				frame.dispose();
				
			}
		});
		btnNewButton_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_3_1.setBackground(new Color(255, 128, 0));
		
		JButton btnNewButton_3_2 = new JButton("Manage Account");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(ManageAccount_panel);
			}
		});
		btnNewButton_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_3_2.setBackground(new Color(255, 128, 0));
		
	    btn_AddStudents = new JButton("Add Students");
		btn_AddStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Add_StudentsPanel);
				btn_AddStudents.setBackground(new Color(255,128,0));
				btnUpdateStudent.setBackground(new Color(255,255,255));
				btn_AllStudents.setBackground(new Color(255,255,255));
				btnDeleteStudent.setBackground(new Color(255,255,255));
				
				
			}
		});
		btn_AddStudents.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btn_AddStudents.setBorder(new LineBorder(new Color(255, 128, 0)));
		btn_AddStudents.setBackground(Color.WHITE);
		
		btnUpdateStudent = new JButton("Update Student info");
		btnUpdateStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Update_StudentsPanel);
				btn_AddStudents.setBackground(new Color(255,255,255));
				btnUpdateStudent.setBackground(new Color(255,128,0));
				btn_AllStudents.setBackground(new Color(255,255,255));
				btnDeleteStudent.setBackground(new Color(255,255,255));
			}
		});
		btnUpdateStudent.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnUpdateStudent.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnUpdateStudent.setBackground(Color.WHITE);
		
		btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Delete_StudentsPanel);
				btn_AddStudents.setBackground(new Color(255,255,255));
				btnUpdateStudent.setBackground(new Color(255,255,255));
				btn_AllStudents.setBackground(new Color(255,255,255));
				btnDeleteStudent.setBackground(new Color(255,128,0));
				
			}
		});
		btnDeleteStudent.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnDeleteStudent.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnDeleteStudent.setBackground(Color.WHITE);
		GroupLayout gl_SidePanel_Home = new GroupLayout(SidePanel_Home);
		gl_SidePanel_Home.setHorizontalGroup(
			gl_SidePanel_Home.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SidePanel_Home.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_SidePanel_Home.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_3_1, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_AllStudents, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_2, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_AddStudents, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdateStudent, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDeleteStudent, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_SidePanel_Home.setVerticalGroup(
			gl_SidePanel_Home.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SidePanel_Home.createSequentialGroup()
					.addGap(37)
					.addComponent(btn_AllStudents, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btn_AddStudents, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnUpdateStudent, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDeleteStudent, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
					.addComponent(btnNewButton_3_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_3_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		SidePanel_Home.setLayout(gl_SidePanel_Home);
		Sub_Home.setLayout(new CardLayout(0, 0));
		
		All_StudentsPanel = new JPanel();
		All_StudentsPanel.setBackground(new Color(240, 240, 240));
		Sub_Home.add(All_StudentsPanel, "name_20796148948200");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		
		table = new JTable();
		table.setBackground(new Color(250, 235, 215));
		table.setSelectionBackground(new Color(255, 128, 0));
		table.getTableHeader().setBackground(new Color(255 ,128,0));		
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setRowHeight(25);
		table.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "REGISTER NO", "DEPARTMENT", "BRANCH", "COURSE", "YEAR"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(5).setResizable(false);
		
		JLabel lblNewLabel_1 = new JLabel("REGISTERED COLLEGE STUDENTS DETAILS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 25));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		GroupLayout gl_All_StudentsPanel = new GroupLayout(All_StudentsPanel);
		gl_All_StudentsPanel.setHorizontalGroup(
			gl_All_StudentsPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
				.addGroup(gl_All_StudentsPanel.createSequentialGroup()
					.addGap(8)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
					.addGap(8))
		);
		gl_All_StudentsPanel.setVerticalGroup(
			gl_All_StudentsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_All_StudentsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
		);
		All_StudentsPanel.setLayout(gl_All_StudentsPanel);
		
		Add_StudentsPanel = new JPanel();
		Add_StudentsPanel.setBackground(new Color(240, 240, 240));
		Sub_Home.add(Add_StudentsPanel, "name_20802092910600");
		
		JLabel lblNewLabel_2 = new JLabel("Student Name ");
		lblNewLabel_2.setBounds(53, 72, 108, 25);
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setBounds(53, 95, 234, 25);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(250, 235, 215));
		textField.setBorder(null);
		textField.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Branch");
		lblNewLabel_2_1.setBounds(53, 130, 108, 25);
		lblNewLabel_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_1 = new JTextField();
		textField_1.setBounds(53, 153, 234, 25);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_2 = new JLabel("Register Number");
		lblNewLabel_2_2.setBounds(358, 72, 117, 25);
		lblNewLabel_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_2 = new JTextField();
		textField_2.setBounds(358, 95, 234, 25);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_3 = new JLabel("Course");
		lblNewLabel_2_3.setBounds(358, 130, 108, 25);
		lblNewLabel_2_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_3 = new JTextField();
		textField_3.setBounds(358, 153, 234, 25);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_4 = new JLabel("Department");
		lblNewLabel_2_4.setBounds(658, 72, 108, 25);
		lblNewLabel_2_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_4 = new JTextField();
		textField_4.setBounds(658, 95, 234, 25);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_5 = new JLabel("Year");
		lblNewLabel_2_5.setBounds(658, 130, 108, 25);
		lblNewLabel_2_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_5 = new JTextField();
		textField_5.setBounds(658, 153, 234, 25);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_6 = new JLabel("STUDENT DETAILS");
		lblNewLabel_2_6.setBounds(53, 10, 208, 40);
		lblNewLabel_2_6.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_6_1 = new JLabel("PERSONAL DETAILS");
		lblNewLabel_2_6_1.setBounds(53, 188, 208, 40);
		lblNewLabel_2_6_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_6_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_7 = new JLabel("Mobile Number");
		lblNewLabel_2_7.setBounds(53, 250, 108, 25);
		lblNewLabel_2_7.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_6 = new JTextField();
		textField_6.setBounds(53, 273, 234, 25);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("City");
		lblNewLabel_2_1_1.setBounds(53, 308, 108, 25);
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_7 = new JTextField();
		textField_7.setBounds(53, 331, 234, 25);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_7.setColumns(10);
		textField_7.setBorder(null);
		textField_7.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Age");
		lblNewLabel_2_2_1.setBounds(358, 250, 117, 25);
		lblNewLabel_2_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_8 = new JTextField();
		textField_8.setBounds(358, 273, 234, 25);
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_8.setColumns(10);
		textField_8.setBorder(null);
		textField_8.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Religion ");
		lblNewLabel_2_3_1.setBounds(358, 308, 108, 25);
		lblNewLabel_2_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_9 = new JTextField();
		textField_9.setBounds(358, 331, 234, 25);
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_9.setColumns(10);
		textField_9.setBorder(null);
		textField_9.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Date Of Birth");
		lblNewLabel_2_4_1.setBounds(658, 250, 108, 25);
		lblNewLabel_2_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_10 = new JTextField();
		textField_10.setBounds(658, 273, 234, 25);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_10.setColumns(10);
		textField_10.setBorder(null);
		textField_10.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Nationality");
		lblNewLabel_2_5_1.setBounds(658, 308, 108, 25);
		lblNewLabel_2_5_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_11 = new JTextField();
		textField_11.setBounds(658, 331, 234, 25);
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_11.setColumns(10);
		textField_11.setBorder(null);
		textField_11.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_6_2 = new JLabel("PARENTS DETAILS");
		lblNewLabel_2_6_2.setBounds(53, 366, 208, 40);
		lblNewLabel_2_6_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_6_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_8 = new JLabel("Father Name ");
		lblNewLabel_2_8.setBounds(53, 428, 108, 25);
		lblNewLabel_2_8.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_12 = new JTextField();
		textField_12.setBounds(53, 451, 234, 25);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_12.setColumns(10);
		textField_12.setBorder(null);
		textField_12.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Mother Name");
		lblNewLabel_2_1_2.setBounds(53, 486, 108, 25);
		lblNewLabel_2_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_13 = new JTextField();
		textField_13.setBounds(53, 509, 234, 25);
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_13.setColumns(10);
		textField_13.setBorder(null);
		textField_13.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Mobile Number ( Father )");
		lblNewLabel_2_2_2.setBounds(358, 428, 178, 25);
		lblNewLabel_2_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_14 = new JTextField();
		textField_14.setBounds(358, 451, 234, 25);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_14.setColumns(10);
		textField_14.setBorder(null);
		textField_14.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Mobile Number ( Mother )");
		lblNewLabel_2_3_2.setBounds(358, 486, 234, 25);
		lblNewLabel_2_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_15 = new JTextField();
		textField_15.setBounds(358, 509, 234, 25);
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_15.setColumns(10);
		textField_15.setBorder(null);
		textField_15.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_4_2 = new JLabel("Occupation ( Father )");
		lblNewLabel_2_4_2.setBounds(658, 428, 234, 25);
		lblNewLabel_2_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_16 = new JTextField();
		textField_16.setBounds(658, 451, 234, 25);
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_16.setColumns(10);
		textField_16.setBorder(null);
		textField_16.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_5_2 = new JLabel("Occupation ( Mother )");
		lblNewLabel_2_5_2.setBounds(658, 486, 184, 25);
		lblNewLabel_2_5_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_17 = new JTextField();
		textField_17.setBounds(658, 509, 234, 25);
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_17.setColumns(10);
		textField_17.setBorder(null);
		textField_17.setBackground(new Color(250, 235, 215));
		
		JButton btnNewButton = new JButton("ADD STUDENT");
		btnNewButton.setBounds(658, 552, 234, 40);
		btnNewButton.setBackground(new Color(255, 128, 0));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		
		JButton btnClearFields = new JButton("CLEAR ALL");
		btnClearFields.setBounds(358, 552, 234, 40);
		btnClearFields.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnClearFields.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnClearFields.setBackground(new Color(255, 128, 0));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(54, 48, 178, 2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(53, 226, 194, 2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(53, 404, 194, 2);
		Add_StudentsPanel.setLayout(null);
		Add_StudentsPanel.add(separator);
		Add_StudentsPanel.add(lblNewLabel_2_6);
		Add_StudentsPanel.add(lblNewLabel_2);
		Add_StudentsPanel.add(textField);
		Add_StudentsPanel.add(textField_1);
		Add_StudentsPanel.add(lblNewLabel_2_1);
		Add_StudentsPanel.add(separator_1);
		Add_StudentsPanel.add(lblNewLabel_2_6_1);
		Add_StudentsPanel.add(textField_6);
		Add_StudentsPanel.add(lblNewLabel_2_7);
		Add_StudentsPanel.add(lblNewLabel_2_1_1);
		Add_StudentsPanel.add(textField_7);
		Add_StudentsPanel.add(lblNewLabel_2_6_2);
		Add_StudentsPanel.add(separator_1_1);
		Add_StudentsPanel.add(textField_12);
		Add_StudentsPanel.add(lblNewLabel_2_8);
		Add_StudentsPanel.add(lblNewLabel_2_1_2);
		Add_StudentsPanel.add(textField_13);
		Add_StudentsPanel.add(lblNewLabel_2_2);
		Add_StudentsPanel.add(textField_2);
		Add_StudentsPanel.add(textField_3);
		Add_StudentsPanel.add(lblNewLabel_2_3);
		Add_StudentsPanel.add(textField_8);
		Add_StudentsPanel.add(lblNewLabel_2_2_1);
		Add_StudentsPanel.add(lblNewLabel_2_3_1);
		Add_StudentsPanel.add(textField_9);
		Add_StudentsPanel.add(textField_14);
		Add_StudentsPanel.add(lblNewLabel_2_2_2);
		Add_StudentsPanel.add(lblNewLabel_2_3_2);
		Add_StudentsPanel.add(textField_15);
		Add_StudentsPanel.add(lblNewLabel_2_4);
		Add_StudentsPanel.add(textField_4);
		Add_StudentsPanel.add(textField_5);
		Add_StudentsPanel.add(lblNewLabel_2_5);
		Add_StudentsPanel.add(lblNewLabel_2_4_1);
		Add_StudentsPanel.add(textField_10);
		Add_StudentsPanel.add(lblNewLabel_2_5_1);
		Add_StudentsPanel.add(textField_11);
		Add_StudentsPanel.add(textField_16);
		Add_StudentsPanel.add(lblNewLabel_2_4_2);
		Add_StudentsPanel.add(textField_17);
		Add_StudentsPanel.add(lblNewLabel_2_5_2);
		Add_StudentsPanel.add(btnClearFields);
		Add_StudentsPanel.add(btnNewButton);
		
		Delete_StudentsPanel = new JPanel();
		Delete_StudentsPanel.setBackground(new Color(240, 240, 240));
		Sub_Home.add(Delete_StudentsPanel, "name_20806599606300");
		
		JLabel lblNewLabel_2_9_1_1 = new JLabel("ENTER STUDENT NAME");
		lblNewLabel_2_9_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		del_name = new JTextField();
		del_name.setHorizontalAlignment(SwingConstants.CENTER);
		del_name.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		del_name.setColumns(10);
		del_name.setBorder(null);
		del_name.setBackground(new Color(250, 235, 215));
		
		JSeparator separator_2_1_1 = new JSeparator();
		
		JLabel lblNewLabel_2_9_1_1_1 = new JLabel("ENTER STUDENT REGISTER NUMBER");
		lblNewLabel_2_9_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		del_reg = new JTextField();
		del_reg.setHorizontalAlignment(SwingConstants.CENTER);
		del_reg.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		del_reg.setColumns(10);
		del_reg.setBorder(null);
		del_reg.setBackground(new Color(250, 235, 215));
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String delete_name = del_name.getText();
				String delete_reg = del_reg.getText();
				
				
				try {
					String query ="select * from studentdetails where regno = '"+delete_reg+"'";
					Connection con1 = DriverManager.getConnection(url,username,password);
					Statement st1 = con1.createStatement();
					ResultSet rs1 = st1.executeQuery(query);
					rs1.next();
					
					if(delete_name.equals(rs1.getString(1))){
							String query1  = "delete from studentdetails where regno ='"+delete_reg+"'";
							st1.executeUpdate(query1);
							JOptionPane.showMessageDialog(frame, "STUDENT DATA DELETED SUCCESSFULLY !!");
							del_name.setText("");
							del_reg.setText("");
					}
					else {
						JOptionPane.showMessageDialog(frame, "Data does not match !!");
					}
					
				}catch(SQLException e2) {
					if(del_name.getText().equals("")  || del_reg.getText().equals("") ) {
						JOptionPane.showMessageDialog(frame, "Field should not be empty");
					} 
					else if(e2.getMessage().equals("Illegal operation on empty result set.")) {
						JOptionPane.showMessageDialog(frame , "NO DATA FOUND !! FOR THIS DETAILS");
					}
				  }
				
				}
		});
		btnNewButton_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		GroupLayout gl_Delete_StudentsPanel = new GroupLayout(Delete_StudentsPanel);
		gl_Delete_StudentsPanel.setHorizontalGroup(
			gl_Delete_StudentsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Delete_StudentsPanel.createSequentialGroup()
					.addGap(51)
					.addGroup(gl_Delete_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Delete_StudentsPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2_9_1_1_1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(del_reg, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_2_1_1, GroupLayout.PREFERRED_SIZE, 839, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Delete_StudentsPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2_9_1_1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(del_name, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))))
		);
		gl_Delete_StudentsPanel.setVerticalGroup(
			gl_Delete_StudentsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Delete_StudentsPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Delete_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_9_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(del_name, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_Delete_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Delete_StudentsPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_2_9_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Delete_StudentsPanel.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_Delete_StudentsPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(del_reg, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))))
					.addGap(23)
					.addComponent(separator_2_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(499, Short.MAX_VALUE))
		);
		Delete_StudentsPanel.setLayout(gl_Delete_StudentsPanel);
		
		Update_StudentsPanel = new JPanel();
		Update_StudentsPanel.setBackground(new Color(240, 240, 240));
		Sub_Home.add(Update_StudentsPanel, "name_20809825031100");
		
		JLabel lblNewLabel_2_6_3 = new JLabel("STUDENT DETAILS");
		lblNewLabel_2_6_3.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_6_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_9 = new JLabel("Student Name ");
		lblNewLabel_2_9.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_18.setColumns(10);
		textField_18.setBorder(null);
		textField_18.setBackground(new Color(250, 235, 215));
		
		textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_19.setColumns(10);
		textField_19.setBorder(null);
		textField_19.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Register Number");
		lblNewLabel_2_2_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_20.setColumns(10);
		textField_20.setBorder(null);
		textField_20.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_4_3 = new JLabel("Department");
		lblNewLabel_2_4_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_21.setColumns(10);
		textField_21.setBorder(null);
		textField_21.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Branch");
		lblNewLabel_2_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_3_3 = new JLabel("Course");
		lblNewLabel_2_3_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_22.setColumns(10);
		textField_22.setBorder(null);
		textField_22.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_5_3 = new JLabel("Year");
		lblNewLabel_2_5_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_23.setColumns(10);
		textField_23.setBorder(null);
		textField_23.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_6_1_1 = new JLabel("PERSONAL DETAILS");
		lblNewLabel_2_6_1_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_6_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_7_1 = new JLabel("Mobile Number");
		lblNewLabel_2_7_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_24 = new JTextField();
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_24.setColumns(10);
		textField_24.setBorder(null);
		textField_24.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("State");
		lblNewLabel_2_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_25 = new JTextField();
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_25.setColumns(10);
		textField_25.setBorder(null);
		textField_25.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_4_1_1 = new JLabel("Date Of Birth");
		lblNewLabel_2_4_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_26 = new JTextField();
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_26.setColumns(10);
		textField_26.setBorder(null);
		textField_26.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("City");
		lblNewLabel_2_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_27 = new JTextField();
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_27.setColumns(10);
		textField_27.setBorder(null);
		textField_27.setBackground(new Color(250, 235, 215));
		
		textField_28 = new JTextField();
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_28.setColumns(10);
		textField_28.setBorder(null);
		textField_28.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Religion ");
		lblNewLabel_2_3_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_5_1_1 = new JLabel("Nationality");
		lblNewLabel_2_5_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_29 = new JTextField();
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_29.setColumns(10);
		textField_29.setBorder(null);
		textField_29.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_6_2_1 = new JLabel("PARENTS DETAILS");
		lblNewLabel_2_6_2_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_6_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		
		textField_30 = new JTextField();
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_30.setColumns(10);
		textField_30.setBorder(null);
		textField_30.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_8_1 = new JLabel("Father Name ");
		lblNewLabel_2_8_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_31 = new JTextField();
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_31.setColumns(10);
		textField_31.setBorder(null);
		textField_31.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Mobile Number ( Father )");
		lblNewLabel_2_2_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_4_2_1 = new JLabel("Occupation ( Father )");
		lblNewLabel_2_4_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_32 = new JTextField();
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_32.setColumns(10);
		textField_32.setBorder(null);
		textField_32.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Mother Name");
		lblNewLabel_2_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_33 = new JTextField();
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_33.setColumns(10);
		textField_33.setBorder(null);
		textField_33.setBackground(new Color(250, 235, 215));
		
		textField_34 = new JTextField();
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_34.setColumns(10);
		textField_34.setBorder(null);
		textField_34.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("Mobile Number ( Mother )");
		lblNewLabel_2_3_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_35 = new JTextField();
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_35.setColumns(10);
		textField_35.setBorder(null);
		textField_35.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_5_2_1 = new JLabel("Occupation ( Mother )");
		lblNewLabel_2_5_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JSeparator separator_2 = new JSeparator();
		
		JSeparator separator_1_2 = new JSeparator();
		
		JSeparator separator_1_1_1 = new JSeparator();
		
		JSeparator separator_2_1 = new JSeparator();
		
		JLabel lblNewLabel_2_9_1 = new JLabel("ENTER STUDENT REGISTER NUMBER");
		lblNewLabel_2_9_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_36 = new JTextField();
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_36.setColumns(10);
		textField_36.setBorder(null);
		textField_36.setBackground(new Color(250, 235, 215));
		
		JButton btnNewButton_1 = new JButton("GET DETAILS");
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		
		JButton btnNewButton_1_1 = new JButton("CLEAR ALL");
		btnNewButton_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(255, 128, 0));
		
		JButton btnNewButton_1_2 = new JButton("UPDATE");
		btnNewButton_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBackground(new Color(255, 128, 0));
		GroupLayout gl_Update_StudentsPanel = new GroupLayout(Update_StudentsPanel);
		gl_Update_StudentsPanel.setHorizontalGroup(
			gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
					.addGap(51)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2_9_1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_6_3, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_2_1, GroupLayout.PREFERRED_SIZE, 839, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_9, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_2_3, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_4_3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_1_3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_3_3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_5_3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
						.addComponent(separator_1_2, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_6_1_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_7_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_2_1_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_4_1_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_3_1_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_5_1_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
						.addComponent(separator_1_1_1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_6_2_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_8_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_2_2_1, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_4_2_1, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_1_2_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_3_2_1, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_5_2_1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))))
		);
		gl_Update_StudentsPanel.setVerticalGroup(
			gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(lblNewLabel_2_9_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_6_3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(38)
							.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_2_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_2_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_4_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_1_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_3_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_5_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(38)
							.addComponent(separator_1_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_6_1_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_7_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_2_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_4_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_3_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_5_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(38)
							.addComponent(separator_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_6_2_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_8_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_2_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_4_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_Update_StudentsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_3_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_5_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Update_StudentsPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
		);
		Update_StudentsPanel.setLayout(gl_Update_StudentsPanel);
		
		ManageAccount_panel = new JPanel();
		ManageAccount_panel.setBackground(new Color(128, 128, 64));
		Sub_Home.add(ManageAccount_panel, "name_20923324735300");
		GroupLayout gl_home = new GroupLayout(home);
		gl_home.setHorizontalGroup(
			gl_home.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_home.createSequentialGroup()
					.addComponent(SidePanel_Home, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(Sub_Home, GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE))
		);
		gl_home.setVerticalGroup(
			gl_home.createParallelGroup(Alignment.LEADING)
				.addComponent(SidePanel_Home, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(Sub_Home, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
		);
		home.setLayout(gl_home);
		
		Internal_Result = new JPanel();
		Internal_Result.setBackground(new Color(240, 240, 240));
		MainPanel.add(Internal_Result, "name_16548860353100");
		
		JPanel SidePanel_InternalAssessment = new JPanel();
		SidePanel_InternalAssessment.setBorder(new LineBorder(new Color(0, 0, 0)));
		SidePanel_InternalAssessment.setBackground(new Color(250, 235, 215));
		
		JButton btn_AllStudents_1 = new JButton("Internals 1");
		btn_AllStudents_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchInternalResultPanels(Internals_1);
			}
		});
		btn_AllStudents_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btn_AllStudents_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		btn_AllStudents_1.setBackground(new Color(255, 255, 255));
		
		JButton btn_AddStudents_1 = new JButton("Internals 2");
		btn_AddStudents_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchInternalResultPanels(Internals_2);
			}
		});
		btn_AddStudents_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btn_AddStudents_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		btn_AddStudents_1.setBackground(Color.WHITE);
		
		JButton btnInternals = new JButton("Internals 3");
		btnInternals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchInternalResultPanels(Internals_3);
			}
		});
		btnInternals.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnInternals.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnInternals.setBackground(Color.WHITE);
		GroupLayout gl_SidePanel_InternalAssessment = new GroupLayout(SidePanel_InternalAssessment);
		gl_SidePanel_InternalAssessment.setHorizontalGroup(
			gl_SidePanel_InternalAssessment.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SidePanel_InternalAssessment.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_SidePanel_InternalAssessment.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_AllStudents_1, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_AddStudents_1, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnInternals, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_SidePanel_InternalAssessment.setVerticalGroup(
			gl_SidePanel_InternalAssessment.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SidePanel_InternalAssessment.createSequentialGroup()
					.addGap(37)
					.addComponent(btn_AllStudents_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btn_AddStudents_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnInternals, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(425, Short.MAX_VALUE))
		);
		SidePanel_InternalAssessment.setLayout(gl_SidePanel_InternalAssessment);
		
		Sub_Internal_panel = new JLayeredPane();
		Sub_Internal_panel.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		Sub_Internal_panel.setLayout(new CardLayout(0, 0));
		
		Internals_1 = new JPanel();
		Sub_Internal_panel.add(Internals_1, "name_121809972014400");
		
		JLabel lblNewLabel_2_10 = new JLabel("Student Register Number");
		lblNewLabel_2_10.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_39 = new JTextField();
		textField_39.setHorizontalAlignment(SwingConstants.CENTER);
		textField_39.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_39.setColumns(10);
		textField_39.setBorder(null);
		textField_39.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1 = new JLabel("Student Name");
		lblNewLabel_2_10_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_40 = new JTextField();
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_40.setColumns(10);
		textField_40.setBorder(null);
		textField_40.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_1 = new JLabel("Branch");
		lblNewLabel_2_10_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_41 = new JTextField();
		textField_41.setHorizontalAlignment(SwingConstants.CENTER);
		textField_41.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_41.setColumns(10);
		textField_41.setBorder(null);
		textField_41.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_2 = new JLabel("Degree ");
		lblNewLabel_2_10_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_42 = new JTextField();
		textField_42.setHorizontalAlignment(SwingConstants.CENTER);
		textField_42.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_42.setColumns(10);
		textField_42.setBorder(null);
		textField_42.setBackground(new Color(250, 235, 215));
		
		textField_43 = new JTextField();
		textField_43.setHorizontalAlignment(SwingConstants.CENTER);
		textField_43.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_43.setColumns(10);
		textField_43.setBorder(null);
		textField_43.setBackground(new Color(250, 235, 215));
		
		JSeparator separator_3 = new JSeparator();
		
		JButton btnNewButton_3 = new JButton("Get Details");
		btnNewButton_3.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		
		JSeparator separator_3_1 = new JSeparator();
		
		JLabel lblNewLabel_2_10_1_4 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_44 = new JTextField();
		textField_44.setHorizontalAlignment(SwingConstants.CENTER);
		textField_44.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_44.setColumns(10);
		textField_44.setBorder(null);
		textField_44.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_45 = new JTextField();
		textField_45.setHorizontalAlignment(SwingConstants.CENTER);
		textField_45.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_45.setColumns(10);
		textField_45.setBorder(null);
		textField_45.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_46 = new JTextField();
		textField_46.setHorizontalAlignment(SwingConstants.CENTER);
		textField_46.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_46.setColumns(10);
		textField_46.setBorder(null);
		textField_46.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_47 = new JTextField();
		textField_47.setHorizontalAlignment(SwingConstants.CENTER);
		textField_47.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_47.setColumns(10);
		textField_47.setBorder(null);
		textField_47.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_3 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_48 = new JTextField();
		textField_48.setHorizontalAlignment(SwingConstants.CENTER);
		textField_48.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_48.setColumns(10);
		textField_48.setBorder(null);
		textField_48.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_49 = new JTextField();
		textField_49.setHorizontalAlignment(SwingConstants.CENTER);
		textField_49.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_49.setColumns(10);
		textField_49.setBorder(null);
		textField_49.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_4 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_50 = new JTextField();
		textField_50.setHorizontalAlignment(SwingConstants.CENTER);
		textField_50.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_50.setColumns(10);
		textField_50.setBorder(null);
		textField_50.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_3 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_51 = new JTextField();
		textField_51.setHorizontalAlignment(SwingConstants.CENTER);
		textField_51.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_51.setColumns(10);
		textField_51.setBorder(null);
		textField_51.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_5 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_52 = new JTextField();
		textField_52.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_52.setColumns(10);
		textField_52.setBorder(null);
		textField_52.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_4 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_53 = new JTextField();
		textField_53.setHorizontalAlignment(SwingConstants.CENTER);
		textField_53.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_53.setColumns(10);
		textField_53.setBorder(null);
		textField_53.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_6 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_54 = new JTextField();
		textField_54.setHorizontalAlignment(SwingConstants.CENTER);
		textField_54.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_54.setColumns(10);
		textField_54.setBorder(null);
		textField_54.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_5 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_55 = new JTextField();
		textField_55.setHorizontalAlignment(SwingConstants.CENTER);
		textField_55.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_55.setColumns(10);
		textField_55.setBorder(null);
		textField_55.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_7 = new JLabel("SUBJECT AND MARK DETAILS");
		lblNewLabel_2_10_1_4_7.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_7.setBackground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_7.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("SEM 1");
		tglbtnNewToggleButton.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_1.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_2.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_3.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_3.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JToggleButton tglbtnNewToggleButton_3_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_3_1.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_3_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_4.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_4.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JToggleButton tglbtnNewToggleButton_1_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_1_1.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_1_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JToggleButton tglbtnNewToggleButton_2_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_2_1.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_2_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		
		JButton btnNewButton_4 = new JButton("UPLOAD RESULT");
		btnNewButton_4.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JPanel ResultPreview_Panel = new JPanel();
		ResultPreview_Panel.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_2_10_1_2_1 = new JLabel("Year");
		lblNewLabel_2_10_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_3 = new JLabel("INTERNAL ASSESSMENT 1");
		lblNewLabel_3.setForeground(new Color(255, 128, 0));
		lblNewLabel_3.setBackground(new Color(255, 128, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 18));
		GroupLayout gl_Internals_1 = new GroupLayout(Internals_1);
		gl_Internals_1.setHorizontalGroup(
			gl_Internals_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internals_1.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_1.createSequentialGroup()
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_39, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addComponent(lblNewLabel_2_10, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
									.addGap(38)))
							.addGap(13)
							.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
							.addGap(48)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)
							.addGap(15))
						.addComponent(separator_3, GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
						.addGroup(gl_Internals_1.createSequentialGroup()
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_40, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_42, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2_10_1_2, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
							.addGap(357))
						.addGroup(gl_Internals_1.createSequentialGroup()
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_41, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_2_1, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
								.addComponent(textField_43, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
							.addGap(357))
						.addComponent(separator_3_1, GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2_10_1_4_7, GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
						.addGroup(gl_Internals_1.createSequentialGroup()
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_44, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addComponent(lblNewLabel_2_10_1_4, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
									.addGap(1))
								.addComponent(textField_46, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_48, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_45, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_47, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_49, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_1_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_50, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_52, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_54, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_6, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_2_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_51, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_53, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_55, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_3, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addComponent(tglbtnNewToggleButton_3_1, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
									.addGap(1)))
							.addGap(28)
							.addComponent(ResultPreview_Panel, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
						.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE))
					.addGap(42))
		);
		gl_Internals_1.setVerticalGroup(
			gl_Internals_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internals_1.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_1.createSequentialGroup()
							.addGap(138)
							.addComponent(lblNewLabel_2_10_1_2_1, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
							.addGap(429))
						.addGroup(gl_Internals_1.createSequentialGroup()
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_39, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
									.addGap(1))
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addComponent(lblNewLabel_2_10, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
									.addGap(24))
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(23)
									.addGroup(gl_Internals_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
							.addGap(23)
							.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_40, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_42, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_41, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_43, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
							.addGap(20)
							.addComponent(separator_3_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_2_10_1_4_7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(17)
							.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_Internals_1.createSequentialGroup()
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(textField_44, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_2_10_1_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(textField_46, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_2_10_1_4_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2_10_1_4_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(textField_48, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
											.addGap(22)
											.addComponent(tglbtnNewToggleButton, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(tglbtnNewToggleButton_4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Internals_1.createSequentialGroup()
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2_10_1_4_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(textField_45, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2_10_1_4_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(textField_47, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(textField_49, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_2_10_1_4_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addGap(22)
											.addComponent(tglbtnNewToggleButton_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(tglbtnNewToggleButton_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Internals_1.createSequentialGroup()
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(textField_50, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_2_10_1_4_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(textField_52, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_2_10_1_4_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(textField_54, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_2_10_1_4_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addGap(22)
											.addComponent(tglbtnNewToggleButton_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(tglbtnNewToggleButton_2_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Internals_1.createSequentialGroup()
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2_10_1_4_1_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(textField_51, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2_10_1_4_1_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(textField_53, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
											.addGap(10)
											.addGroup(gl_Internals_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2_10_1_4_1_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Internals_1.createSequentialGroup()
													.addGap(23)
													.addComponent(textField_55, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
											.addGap(22)
											.addComponent(tglbtnNewToggleButton_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(tglbtnNewToggleButton_3_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
									.addGap(14))
								.addGroup(gl_Internals_1.createSequentialGroup()
									.addComponent(ResultPreview_Panel, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(19))))
		);
		ResultPreview_Panel.setLayout(null);
		
		JLabel lblNewLabel_2_10_1_4_4_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1.setBounds(38, 46, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1.setBounds(165, 46, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_1.setBounds(165, 81, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_1_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_2.setBounds(38, 81, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_2.setBounds(165, 116, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_1_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_3 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_3.setBounds(38, 116, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_3);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_3 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_3.setBounds(165, 151, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_1_3);
		
		JLabel lblNewLabel_2_10_1_4_4_1_4 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_4.setBounds(38, 151, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_4);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_4 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_4.setBounds(165, 188, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_1_4);
		
		JLabel lblNewLabel_2_10_1_4_4_1_5 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_5.setBounds(38, 188, 119, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_5);
		
		JLabel lblNewLabel_2_10_1_4_4_1_6 = new JLabel("RESULT PREVIEW");
		lblNewLabel_2_10_1_4_4_1_6.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_4_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_6.setBounds(8, 10, 311, 25);
		ResultPreview_Panel.add(lblNewLabel_2_10_1_4_4_1_6);
		Internals_1.setLayout(gl_Internals_1);
		
		Internals_2 = new JPanel();
		Sub_Internal_panel.add(Internals_2, "name_121816744831900");
		
		JLabel lblNewLabel_2_10_2 = new JLabel("Student Register Number");
		lblNewLabel_2_10_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_56 = new JTextField();
		textField_56.setHorizontalAlignment(SwingConstants.CENTER);
		textField_56.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_56.setColumns(10);
		textField_56.setBorder(null);
		textField_56.setBackground(new Color(250, 235, 215));
		
		JButton btnNewButton_3_3 = new JButton("Get Details");
		btnNewButton_3_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		btnNewButton_3_3.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnNewButton_3_3.setBackground(Color.WHITE);
		
		JSeparator separator_3_2 = new JSeparator();
		
		JLabel lblNewLabel_2_10_1_3 = new JLabel("Student Name");
		lblNewLabel_2_10_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_57 = new JTextField();
		textField_57.setHorizontalAlignment(SwingConstants.CENTER);
		textField_57.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_57.setColumns(10);
		textField_57.setBorder(null);
		textField_57.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_1_1 = new JLabel("Branch");
		lblNewLabel_2_10_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_58 = new JTextField();
		textField_58.setHorizontalAlignment(SwingConstants.CENTER);
		textField_58.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_58.setColumns(10);
		textField_58.setBorder(null);
		textField_58.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_2_2 = new JLabel("Degree ");
		lblNewLabel_2_10_1_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_59 = new JTextField();
		textField_59.setHorizontalAlignment(SwingConstants.CENTER);
		textField_59.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_59.setColumns(10);
		textField_59.setBorder(null);
		textField_59.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_2_1_1 = new JLabel("Year");
		lblNewLabel_2_10_1_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_60 = new JTextField();
		textField_60.setHorizontalAlignment(SwingConstants.CENTER);
		textField_60.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_60.setColumns(10);
		textField_60.setBorder(null);
		textField_60.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_7_1 = new JLabel("SUBJECT AND MARK DETAILS");
		lblNewLabel_2_10_1_4_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_7_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_7_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		lblNewLabel_2_10_1_4_7_1.setBackground(new Color(255, 128, 0));
		
		JSeparator separator_3_1_1 = new JSeparator();
		
		JLabel lblNewLabel_2_10_1_4_8 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_8.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_61 = new JTextField();
		textField_61.setHorizontalAlignment(SwingConstants.CENTER);
		textField_61.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_61.setColumns(10);
		textField_61.setBorder(null);
		textField_61.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_2_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_62 = new JTextField();
		textField_62.setHorizontalAlignment(SwingConstants.CENTER);
		textField_62.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_62.setColumns(10);
		textField_62.setBorder(null);
		textField_62.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_3_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_63 = new JTextField();
		textField_63.setHorizontalAlignment(SwingConstants.CENTER);
		textField_63.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_63.setColumns(10);
		textField_63.setBorder(null);
		textField_63.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_6 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_64 = new JTextField();
		textField_64.setHorizontalAlignment(SwingConstants.CENTER);
		textField_64.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_64.setColumns(10);
		textField_64.setBorder(null);
		textField_64.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_1_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_65 = new JTextField();
		textField_65.setHorizontalAlignment(SwingConstants.CENTER);
		textField_65.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_65.setColumns(10);
		textField_65.setBorder(null);
		textField_65.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_2_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_66 = new JTextField();
		textField_66.setHorizontalAlignment(SwingConstants.CENTER);
		textField_66.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_66.setColumns(10);
		textField_66.setBorder(null);
		textField_66.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_4_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_67 = new JTextField();
		textField_67.setHorizontalAlignment(SwingConstants.CENTER);
		textField_67.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_67.setColumns(10);
		textField_67.setBorder(null);
		textField_67.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_5_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_5_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_68 = new JTextField();
		textField_68.setHorizontalAlignment(SwingConstants.CENTER);
		textField_68.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_68.setColumns(10);
		textField_68.setBorder(null);
		textField_68.setBackground(new Color(250, 235, 215));
		
		textField_69 = new JTextField();
		textField_69.setHorizontalAlignment(SwingConstants.CENTER);
		textField_69.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_69.setColumns(10);
		textField_69.setBorder(null);
		textField_69.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_6_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_6_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_10_1_4_1_3_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_70 = new JTextField();
		textField_70.setHorizontalAlignment(SwingConstants.CENTER);
		textField_70.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_70.setColumns(10);
		textField_70.setBorder(null);
		textField_70.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_4_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_71 = new JTextField();
		textField_71.setHorizontalAlignment(SwingConstants.CENTER);
		textField_71.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_71.setColumns(10);
		textField_71.setBorder(null);
		textField_71.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_5_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_5_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_72 = new JTextField();
		textField_72.setHorizontalAlignment(SwingConstants.CENTER);
		textField_72.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_72.setColumns(10);
		textField_72.setBorder(null);
		textField_72.setBackground(new Color(250, 235, 215));
		
		JPanel ResultPreview_Panel_1 = new JPanel();
		ResultPreview_Panel_1.setLayout(null);
		ResultPreview_Panel_1.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_10_1_4_4_1_7 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_7.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_7.setBounds(38, 46, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_7);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_5 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_5.setBounds(165, 46, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_1_5);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_1_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_1_1.setBounds(165, 81, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_1_1_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_2_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_2_1.setBounds(38, 81, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_2_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_2_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_2_1.setBounds(165, 116, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_1_2_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_3_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_3_1.setBounds(38, 116, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_3_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_3_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_3_1.setBounds(165, 151, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_1_3_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_4_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_4_1.setBounds(38, 151, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_4_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_4_1 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_4_1.setBounds(165, 188, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_1_4_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_5_1 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_5_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_5_1.setBounds(38, 188, 119, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_5_1);
		
		JLabel lblNewLabel_2_10_1_4_4_1_6_1 = new JLabel("RESULT PREVIEW");
		lblNewLabel_2_10_1_4_4_1_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_6_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_4_1_6_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_6_1.setBounds(8, 10, 311, 25);
		ResultPreview_Panel_1.add(lblNewLabel_2_10_1_4_4_1_6_1);
		
		JButton btnNewButton_4_1 = new JButton("UPLOAD RESULT");
		btnNewButton_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton_4_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnNewButton_4_1.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_3_1_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_3_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_3_1_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_3_1_1.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_3_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_3_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_3_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_2_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_2_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_2_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_2_1_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_2_1_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_2_1_1.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_1_1_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_1_1_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_1_1_1.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_1_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_1_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_1_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_5.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_5.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_4_1 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_4_1.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_4_1.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_3_1 = new JLabel("INTERNAL ASSESSMENT 2");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_3_1.setBackground(new Color(255, 128, 0));
		GroupLayout gl_Internals_2 = new GroupLayout(Internals_2);
		gl_Internals_2.setHorizontalGroup(
			gl_Internals_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internals_2.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_2, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_56, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addComponent(btnNewButton_3_3, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_3_2, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_3, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_57, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_2_2, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_59, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_1_1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_58, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_2_1_1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_60, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)))
						.addComponent(separator_3_1_1, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_10_1_4_7_1, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_8, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_61, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_62, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_2_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_63, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_3_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_4_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_64, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_6, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_65, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_1_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_66, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_2_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_1_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_1_1_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_67, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_4_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_5_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_68, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_69, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_6_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_2_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_2_1_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_70, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_3_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_4_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_71, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_5_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_72, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_3_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_3_1_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addComponent(ResultPreview_Panel_1, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_4_1, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)))
		);
		gl_Internals_2.setVerticalGroup(
			gl_Internals_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internals_2.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_10_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_56, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_3_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
					.addGap(23)
					.addComponent(separator_3_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_10_1_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_57, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_10_1_2_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_59, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_58, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addComponent(lblNewLabel_2_10_1_2_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(textField_60, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(20)
					.addComponent(separator_3_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblNewLabel_2_10_1_4_7_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_61, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_62, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_63, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_3_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_4_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_64, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_65, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_66, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_1_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_67, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_4_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_5_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_68, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_69, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_6_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_2_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_2_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_2.createSequentialGroup()
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_70, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_3_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1_4_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_71, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1_5_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_2.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_72, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_3_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_3_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addComponent(ResultPreview_Panel_1, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(btnNewButton_4_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
		);
		Internals_2.setLayout(gl_Internals_2);
		
		Internals_3 = new JPanel();
		Sub_Internal_panel.add(Internals_3, "name_121864627905500");
		
		JLabel lblNewLabel_2_10_3 = new JLabel("Student Register Number");
		lblNewLabel_2_10_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_73 = new JTextField();
		textField_73.setHorizontalAlignment(SwingConstants.CENTER);
		textField_73.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_73.setColumns(10);
		textField_73.setBorder(null);
		textField_73.setBackground(new Color(250, 235, 215));
		
		JButton btnNewButton_3_4 = new JButton("Get Details");
		btnNewButton_3_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		btnNewButton_3_4.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnNewButton_3_4.setBackground(Color.WHITE);
		
		JSeparator separator_3_3 = new JSeparator();
		
		JLabel lblNewLabel_2_10_1_5 = new JLabel("Student Name");
		lblNewLabel_2_10_1_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_74 = new JTextField();
		textField_74.setHorizontalAlignment(SwingConstants.CENTER);
		textField_74.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_74.setColumns(10);
		textField_74.setBorder(null);
		textField_74.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_1_2 = new JLabel("Branch");
		lblNewLabel_2_10_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_75 = new JTextField();
		textField_75.setHorizontalAlignment(SwingConstants.CENTER);
		textField_75.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_75.setColumns(10);
		textField_75.setBorder(null);
		textField_75.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_2_3 = new JLabel("Degree ");
		lblNewLabel_2_10_1_2_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_76 = new JTextField();
		textField_76.setHorizontalAlignment(SwingConstants.CENTER);
		textField_76.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_76.setColumns(10);
		textField_76.setBorder(null);
		textField_76.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_2_1_2 = new JLabel("Year");
		lblNewLabel_2_10_1_2_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_77 = new JTextField();
		textField_77.setHorizontalAlignment(SwingConstants.CENTER);
		textField_77.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_77.setColumns(10);
		textField_77.setBorder(null);
		textField_77.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_7_2 = new JLabel("SUBJECT AND MARK DETAILS");
		lblNewLabel_2_10_1_4_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_7_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_7_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		lblNewLabel_2_10_1_4_7_2.setBackground(new Color(255, 128, 0));
		
		JSeparator separator_3_1_2 = new JSeparator();
		
		JLabel lblNewLabel_2_10_1_4_9 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_9.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_78 = new JTextField();
		textField_78.setHorizontalAlignment(SwingConstants.CENTER);
		textField_78.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_78.setColumns(10);
		textField_78.setBorder(null);
		textField_78.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_2_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_79 = new JTextField();
		textField_79.setHorizontalAlignment(SwingConstants.CENTER);
		textField_79.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_79.setColumns(10);
		textField_79.setBorder(null);
		textField_79.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_3_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_80 = new JTextField();
		textField_80.setHorizontalAlignment(SwingConstants.CENTER);
		textField_80.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_80.setColumns(10);
		textField_80.setBorder(null);
		textField_80.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_7 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_7.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_81 = new JTextField();
		textField_81.setHorizontalAlignment(SwingConstants.CENTER);
		textField_81.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_81.setColumns(10);
		textField_81.setBorder(null);
		textField_81.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_1_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_82 = new JTextField();
		textField_82.setHorizontalAlignment(SwingConstants.CENTER);
		textField_82.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_82.setColumns(10);
		textField_82.setBorder(null);
		textField_82.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_2_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_83 = new JTextField();
		textField_83.setHorizontalAlignment(SwingConstants.CENTER);
		textField_83.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_83.setColumns(10);
		textField_83.setBorder(null);
		textField_83.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_4_3 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_84 = new JTextField();
		textField_84.setHorizontalAlignment(SwingConstants.CENTER);
		textField_84.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_84.setColumns(10);
		textField_84.setBorder(null);
		textField_84.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_5_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_5_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_85 = new JTextField();
		textField_85.setHorizontalAlignment(SwingConstants.CENTER);
		textField_85.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_85.setColumns(10);
		textField_85.setBorder(null);
		textField_85.setBackground(new Color(250, 235, 215));
		
		textField_86 = new JTextField();
		textField_86.setHorizontalAlignment(SwingConstants.CENTER);
		textField_86.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_86.setColumns(10);
		textField_86.setBorder(null);
		textField_86.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_6_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_6_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_10_1_4_1_3_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_87 = new JTextField();
		textField_87.setHorizontalAlignment(SwingConstants.CENTER);
		textField_87.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_87.setColumns(10);
		textField_87.setBorder(null);
		textField_87.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_4_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_88 = new JTextField();
		textField_88.setHorizontalAlignment(SwingConstants.CENTER);
		textField_88.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_88.setColumns(10);
		textField_88.setBorder(null);
		textField_88.setBackground(new Color(250, 235, 215));
		
		JLabel lblNewLabel_2_10_1_4_1_5_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_1_5_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		textField_89 = new JTextField();
		textField_89.setHorizontalAlignment(SwingConstants.CENTER);
		textField_89.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_89.setColumns(10);
		textField_89.setBorder(null);
		textField_89.setBackground(new Color(250, 235, 215));
		
		JPanel ResultPreview_Panel_2 = new JPanel();
		ResultPreview_Panel_2.setLayout(null);
		ResultPreview_Panel_2.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_10_1_4_4_1_8 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_8.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_8.setBounds(38, 46, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_8);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_6 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_6.setBounds(165, 46, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_1_6);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_1_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_1_2.setBounds(165, 81, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_1_1_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_2_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_2_2.setBounds(38, 81, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_2_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_2_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_2_2.setBounds(165, 116, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_1_2_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_3_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_3_2.setBounds(38, 116, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_3_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_3_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_3_2.setBounds(165, 151, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_1_3_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_4_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_4_2.setBounds(38, 151, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_4_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_1_4_2 = new JLabel("Mark");
		lblNewLabel_2_10_1_4_4_1_1_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_1_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_1_4_2.setBounds(165, 188, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_1_4_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_5_2 = new JLabel("Subject Code");
		lblNewLabel_2_10_1_4_4_1_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_5_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_5_2.setBounds(38, 188, 119, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_5_2);
		
		JLabel lblNewLabel_2_10_1_4_4_1_6_2 = new JLabel("RESULT PREVIEW");
		lblNewLabel_2_10_1_4_4_1_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10_1_4_4_1_6_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_2_10_1_4_4_1_6_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_2_10_1_4_4_1_6_2.setBounds(8, 10, 311, 25);
		ResultPreview_Panel_2.add(lblNewLabel_2_10_1_4_4_1_6_2);
		
		JButton btnNewButton_4_2 = new JButton("UPLOAD RESULT");
		btnNewButton_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton_4_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		btnNewButton_4_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_3_1_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_3_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_3_1_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_3_1_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_3_3 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_3_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_3_3.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_3_3.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_2_3 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_2_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_2_3.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_2_3.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_2_1_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_2_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_2_1_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_2_1_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_1_1_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_1_1_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_1_1_2.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_1_3 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_1_3.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_1_3.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_6.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_6.setBackground(Color.WHITE);
		
		JToggleButton tglbtnNewToggleButton_4_2 = new JToggleButton("SEM 1");
		tglbtnNewToggleButton_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 13));
		tglbtnNewToggleButton_4_2.setBorder(new LineBorder(new Color(255, 128, 0)));
		tglbtnNewToggleButton_4_2.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_3_2 = new JLabel("INTERNAL ASSESSMENT 3");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_3_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_3_2.setBackground(new Color(255, 128, 0));
		GroupLayout gl_Internals_3 = new GroupLayout(Internals_3);
		gl_Internals_3.setHorizontalGroup(
			gl_Internals_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internals_3.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_73, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_3, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addComponent(btnNewButton_3_4, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addGap(51)
							.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_3_3, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_5, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_74, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_2_3, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_76, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_1_2, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_75, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_2_1_2, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_77, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)))
						.addComponent(separator_3_1_2, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_10_1_4_7_2, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_9, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_78, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_79, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_2_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_80, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_3_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_6, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_4_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_81, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_7, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_1_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_82, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_83, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_2_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_1_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_1_1_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_4_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_84, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_85, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_5_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_86, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_6_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_2_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_2_1_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1_3_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_87, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_88, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_4_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_89, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_10_1_4_1_5_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(1)
									.addComponent(tglbtnNewToggleButton_3_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_3_1_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addComponent(ResultPreview_Panel_2, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_4_2, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)))
		);
		gl_Internals_3.setVerticalGroup(
			gl_Internals_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internals_3.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_73, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_10_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_3_4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
					.addGap(23)
					.addComponent(separator_3_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_10_1_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_74, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_10_1_2_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGap(23)
							.addComponent(textField_76, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_75, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addComponent(lblNewLabel_2_10_1_2_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(textField_77, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(20)
					.addComponent(separator_3_1_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblNewLabel_2_10_1_4_7_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_78, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_79, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_2_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_80, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_3_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_6, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_4_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_81, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_82, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_83, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_2_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_1_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_1_1_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_4_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_84, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_85, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_5_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_86, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_6_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_2_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_2_1_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Internals_3.createSequentialGroup()
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_10_1_4_1_3_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_87, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_88, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_4_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_Internals_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Internals_3.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_89, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_10_1_4_1_5_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(tglbtnNewToggleButton_3_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tglbtnNewToggleButton_3_1_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addComponent(ResultPreview_Panel_2, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(btnNewButton_4_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
		);
		Internals_3.setLayout(gl_Internals_3);
		GroupLayout gl_Internal_Result = new GroupLayout(Internal_Result);
		gl_Internal_Result.setHorizontalGroup(
			gl_Internal_Result.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Internal_Result.createSequentialGroup()
					.addGroup(gl_Internal_Result.createParallelGroup(Alignment.LEADING)
						.addComponent(SidePanel_InternalAssessment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Internal_Result.createSequentialGroup()
							.addGap(237)
							.addComponent(Sub_Internal_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_Internal_Result.setVerticalGroup(
			gl_Internal_Result.createParallelGroup(Alignment.LEADING)
				.addComponent(SidePanel_InternalAssessment, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(gl_Internal_Result.createSequentialGroup()
					.addComponent(Sub_Internal_panel, GroupLayout.PREFERRED_SIZE, 602, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		Internal_Result.setLayout(gl_Internal_Result);
		
		JPanel Semester_Result = new JPanel();
		Semester_Result.setBackground(new Color(255, 128, 128));
		MainPanel.add(Semester_Result, "name_16552693044299");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(Header_panel, GroupLayout.DEFAULT_SIZE, 1185, Short.MAX_VALUE)
					.addGap(1))
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(MainPanel, GroupLayout.DEFAULT_SIZE, 1185, Short.MAX_VALUE)
					.addGap(1))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(Header_panel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addComponent(MainPanel, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
		);
		Header_panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome , PPG COLLAGE RESULT MANAGEMENT SYSTEM ");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel.setBounds(8, 0, 459, 35);
		Header_panel.add(lblNewLabel);
		frame.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		menuBar.setBackground(new Color(250, 235, 215));
		menuBar.setBorderPainted(false);
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Home");
		mnNewMenu.setMargin(new Insets(5, 5, 5, 5));
		mnNewMenu.setForeground(new Color(0, 0, 0));
		mnNewMenu.setFont(new Font("Segoe UI Variable", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Go Home");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchMainPanels(home);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Internal Assessment ");
		mnNewMenu_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 12));
		mnNewMenu_1.setBackground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Add Internal Results");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchMainPanels(Internal_Result);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Get Reports");
		mntmNewMenuItem_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("Semester Exam");
		mnNewMenu_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 12));
		mnNewMenu_2.setBackground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Add Semester Result");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchMainPanels(Semester_Result);
				
			}
		});
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Get Report");
		mntmNewMenuItem_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mnNewMenu_2.add(mntmNewMenuItem_5);
		mntmNewMenuItem_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_3 = new JMenu("Others");
		mnNewMenu_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 12));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Manage Account");
		mntmNewMenuItem.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		mnNewMenu_3.add(mntmNewMenuItem);
	}
}

