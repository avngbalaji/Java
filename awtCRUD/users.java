package awtCrud;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class UserFrame extends Frame implements ActionListener {

	//including the components
	Label lblTitle, lblId, lblName, lblCity, lblAge, lblStatus;
	TextField txtName, txtId, txtCity, txtAge;
	Button btnSave, btnClear, btnDelete;
	
	String qry = "";
	Connection con = null;//database connection
	PreparedStatement st = null;//insert,update,delete
	ResultSet rs =null;//data's extraction
	Statement stmt  = null;//select query
	
	//Database Connection
	public void connect() {
		//try catch compulsory
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dbjoes?characterEncoding=utf8";
			String username = "root";
			String password = "Balaji@123";
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	//Clear Form Data
	public void clear() {
		txtId.setText("");
		txtName.setText("");
		txtAge.setText("");
		txtCity.setText("");
		txtName.requestFocus();
	}
	
	public UserFrame() {
		
		connect();
		
		//(this.) is optional doesn't need to put compulsory
		this.setVisible(true);
		this.setSize(1000,600);
		this.setTitle("User Management System");
		this.setLayout(null);
		
		//adding colors
		Color formColor = new Color(53, 59, 72);
		this.setBackground(formColor);
		
		//creating 3 different fonts styles
		Font titleFont = new Font("arial", Font.BOLD, 25);
		Font labelFont = new Font("arial", Font.PLAIN, 18);
		Font textFont = new Font("arial", Font.PLAIN, 15);
		
		//title
		lblTitle = new Label("User Management System");
		lblTitle.setBounds(250, 40, 400, 50);
		lblTitle.setFont(titleFont);
		lblTitle.setForeground(Color.YELLOW);
		add(lblTitle);
		
		
		//ID
		lblId = new Label("ID");
		lblId.setBounds(250, 100, 150, 30);
		lblId.setFont(labelFont);
		lblId.setForeground(Color.WHITE);
		add(lblId);
		
		txtId = new TextField();
		txtId.setBounds(400, 100, 400, 30);
		txtId.setFont(textFont);
		txtId.addActionListener(this);
		add(txtId);
		
		//Name
		lblName = new Label("Name");
		lblName.setBounds(250, 150, 150, 30);
		lblName.setFont(labelFont);
		lblName.setForeground(Color.WHITE);
		add(lblName);
		
		txtName = new TextField();
		txtName.setBounds(400, 150, 400, 30);
		txtName.setFont(textFont);
		add(txtName);
		
		//Age
		lblAge = new Label("Age");
		lblAge.setBounds(250, 200, 150, 30);
		lblAge.setFont(labelFont);
		lblAge.setForeground(Color.WHITE);
		add(lblAge);
		
		txtAge = new TextField();
		txtAge.setBounds(400, 200, 400, 30);
		txtAge.setFont(textFont);
		add(txtAge);
		
		//City
		lblCity = new Label("City");
		lblCity.setBounds(250, 250, 150, 30);
		lblCity.setFont(labelFont);
		lblCity.setForeground(Color.WHITE);
		add(lblCity);
		
		txtCity = new TextField();
		txtCity.setBounds(400, 250, 400, 30);
		txtCity.setFont(textFont);
		add(txtCity);
		
		//Button Save
		btnSave = new Button("Save");
		btnSave.setBounds(400, 300, 100, 30);
		btnSave.setBackground(Color.BLUE);
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(labelFont);
		btnSave.addActionListener(this);
		add(btnSave);
		
		//Button Clear
		btnClear = new Button("Clear");
		btnClear.setBounds(520, 300, 100, 30);
		btnClear.setBackground(Color.ORANGE);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(labelFont);
		btnClear.addActionListener(this);
		add(btnClear);
		
		//Button Delete
		btnDelete = new Button("Delete");
		btnDelete.setBounds(640, 300, 100, 30);
		btnDelete.setBackground(Color.RED);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(labelFont);
		btnDelete.addActionListener(this);
		add(btnDelete);
		
		//Status
		lblStatus = new Label("------------------");
		lblStatus.setBounds(400, 350, 300, 30);
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setFont(labelFont);
		add(lblStatus);
		
		//close button function
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try
		{
			String id = txtId.getText();
			String name = txtName.getText();
			String age = txtAge.getText();
			String city = txtCity.getText();
			
			
			if(e.getSource().equals(txtId)) {
				//Get User By ID
				qry = "select ID,NAME,AGE,CITY from users where ID="+txtId.getText();
				stmt = con.createStatement();
				rs = stmt.executeQuery(qry);
				if(rs.next()) {
					txtId.setText(rs.getString("ID"));
					txtName.setText(rs.getString("NAME"));
					txtAge.setText(rs.getString("AGE"));
					txtCity.setText(rs.getString("CITY"));
				}
				else {
					clear();
					lblStatus.setText("Invalid ID");
				}
			}
			
			
			if(e.getSource().equals(btnClear)) {
				clear();
			}
			else if(e.getSource().equals(btnSave)) {
				if(id.isEmpty() || id.equals("")) {
					
					//Save Details
					qry = "insert into users (NAME,AGE,CITY) values (?,?,?)";
					st = con.prepareStatement(qry);
					st.setString(1,  name);
					st.setString(2, age);
					st.setString(3, city);
					st.executeUpdate();
					clear();
					
					lblStatus.setText("Data Insert Success");
				}
				else {
					
					//Update Details
					qry = "update users set NAME=?, AGE=?, CITY=? where ID=?";
					st = con.prepareStatement(qry);
					st.setString(1, name);
					st.setString(2, age);
					st.setString(3, city);
					st.setString(4, id);
					st.executeUpdate();
					clear();
					
					lblStatus.setText("Data Update Success");
				}
			}
			else if(e.getSource().equals(btnDelete)) {
				
				//Delete Details
				if(!id.isEmpty() || !id.equals("")) {
					qry = "delete from users where ID=?";
					st = con.prepareStatement(qry);
					st.setString(1, id);
					st.executeUpdate();
					clear();
					
					lblStatus.setText("Data Deleted Success");
				}
				else {
					lblStatus.setText("Please Enter the correct ID");
				}
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
}

public class users {

	public static void main(String[] args) {
		
		UserFrame frm = new UserFrame();
	}

}
