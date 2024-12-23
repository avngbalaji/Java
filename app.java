//Frame in Java AWT

//First Approach - Main program frame object

//package awtDemo;
//
//import java.awt.*;
//
//public class app{
//	public static void main(String[] args) {
//		Frame frm = new Frame("Tutor Joes");
//		frm.setSize(1000, 600);
//		frm.setLayout(null);
//		Button btn = new Button("Click Me");
//		btn.setBounds(75,75,200,50);
//		frm.add(btn);
//		frm.setVisible(true);
//	}
//
//}





//Second Approach - Main class frame extends

//package awtDemo;
//
//import java.awt.*;
//
//public class app extends Frame{
//	
//	Button btn;
//	public app() {
//		super("Tutor Joes");
//		setSize(1000,600);
//		setLayout(null);
//		btn = new Button("Click Me");
//		btn.setBounds(75, 75, 200, 50);
//		add(btn);
//		setVisible(true);
//	}
//
//	public static void main(String[] args) {
//		app frm = new app();
//	}
//
//}





//Third Approach - Separate class frame extends

//package awtDemo;
//
//import java.awt.*;
//
//class MyApp extends Frame{
//	Button btn;
//	public MyApp() {
//		super("Tutor Joes");
//		setSize(1000,600);
//		setLayout(null);
//		btn = new Button("Click Me");
//		btn.setBounds(75, 75, 200, 50);
//		add(btn);
//		setVisible(true);
//	}
//}
//
//public class app{
//	public static void main(String[] args) {
//		MyApp frm = new MyApp();
//	}
//
//}

//----------------------------------------------------------------





//ActionListener in Java AWT

//package awtDemo;
//
//import java.awt.*;
//import java.awt.event.*;
//
//class MyApp extends Frame implements ActionListener{
//	Button btn;
//	Label lbl;
//	public MyApp() {
//		super("Tutor Joes");
//		setSize(1000,600);
//		setLayout(null);
//		
//		btn = new Button("Click Me");
//		btn.setBounds(75, 75, 200, 50);
//		btn.addActionListener(this);
//		add(btn);
//		
//		lbl = new Label("-----");
//		lbl.setBounds(75,150,200,50);
//		add(lbl);
//		
//		setVisible(true);
//		
//		//code for window closing
//		
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent we) {
//				System.exit(0);
//			}  
//		});
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		lbl.setText("Button Clicked");
//	}
//}
//
//public class app{
//	public static void main(String[] args) {
//		MyApp frm = new MyApp();
//	}
//
//}

//----------------------------------------------------------------





//CheckBox with addItemListener, itemStateChange in Java AWT

//package awtDemo;
//
//import java.awt.*;
//import java.awt.event.*;
//
//class MyApp extends Frame{
//	
//	Label l1,l2,l3;
//	Checkbox c1,c2,c3;
//	
//	public MyApp() {
//		super("Tutor Joes");
//		setSize(1000,600);
//		setLayout(null);
//		setVisible(true);
//		
//		c1 = new Checkbox("C Program");
//		c1.setBounds(10,50,250,30);
//		
//		l1 = new Label("Not Selected");
//		l1.setBounds(300, 50, 600, 30);
//		
//		
//		c2 = new Checkbox("C++ Program");
//		c2.setBounds(10, 100, 250, 30);
//		
//		l2 = new Label("Not Selected");
//		l2.setBounds(300, 100, 600, 30);
//		
//		
//		c3 = new Checkbox("Java Program");
//		c3.setBounds(10, 150, 250, 30);
//		
//		l3 = new Label("Not Selected");
//		l3.setBounds(300,150,600,30);
//		
//		
//		c1.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				l1.setText(e.getStateChange()==1?"checked":"unchecked");
//			}
//		});
//		
//		c2.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				l2.setText(e.getStateChange()==1?"checked":"unchecked");
//			}
//		});
//		
//		c3.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				l3.setText(e.getStateChange()==1?"checked":"unchecked");
//			}
//		});
//		
//		add(c1);add(l1);add(c2);add(l2);add(c3);add(l3);
//		//Close Button Code
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent we) {
//				System.exit(0);
//			}  
//		});
//	}
//}
//
//public class app{
//	public static void main(String[] args) {
//		MyApp frm = new MyApp();
//	}
//
//}

//----------------------------------------------------------------





//RadioButton with addItemListener, itemStateChange in Java AWT

//package awtDemo;
//
//import java.awt.*;
//import java.awt.event.*;
//
//class MyApp extends Frame{
//	
//	Label l1,l2;
//	Checkbox c1,c2;
//	CheckboxGroup cbg;
//	
//	public MyApp() {
//		super("Tutor Joes");
//		setSize(1000,600);
//		setLayout(null);
//		setVisible(true);
//		
//		cbg = new CheckboxGroup();
//		
//		c1 = new Checkbox("Male",cbg,false);
//		c1.setBounds(10,50,250,30);
//		
//		l1 = new Label("Not Selected");
//		l1.setBounds(300, 50, 600, 30);
//		
//		
//		c2 = new Checkbox("Female",cbg,false);
//		c2.setBounds(10, 100, 250, 30);
//		
//		l2 = new Label("Not Selected");
//		l2.setBounds(300, 100, 600, 30);
//		
//		
//		c1.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				l1.setText(e.getStateChange()==1?"checked":"unchecked");
//				l2.setText("unchecked");
//			}
//		});
//		
//		c2.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				l1.setText("unchecked");
//				l2.setText(e.getStateChange()==1?"checked":"unchecked");
//			}
//		});
//		
//		add(c1);add(l1);add(c2);add(l2);
//		//Close Button Code
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent we) {
//				System.exit(0);
//			}  
//		});
//	}
//}
//
//public class app{
//	public static void main(String[] args) {
//		MyApp frm = new MyApp();
//	}
//
//}

//----------------------------------------------------------------





//TextField with TextListener, ActionListener in Java AWT

//package awtDemo;
//
//import java.awt.*;
//import java.awt.event.*;
//
//class MyApp extends Frame{
//	
//	TextField txt;
//	Label l1,l2;
//	
//	public MyApp() {
//		super("Tutor Joes");
//		setSize(1000,600);
//		setLayout(null);
//		setVisible(true);
//		
//		txt = new TextField();
//		txt.setBounds(10,50,250,100);
//		
//		l1 = new Label("Label 1111");
//		l1.setBounds(300, 50, 250, 30);
//		
//		l2 = new Label("Label 2222");
//		l2.setBounds(10,100,250,30);
//		
//		add(txt);
//		add(l1);
//		add(l2);
//		
//		//Close Button Code
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent we) {
//				System.exit(0);
//			}  
//		});
//	}
//}
//
//public class app{
//	public static void main(String[] args) {
//		MyApp frm = new MyApp();
//	}
//
//}

//----------------------------------------------------------------





//Basic Addition Program

//package awtDemo;
//
//import java.awt.*;
//import java.awt.event.*;
//
//class MyApp extends Frame implements ActionListener{
//	
//	Label l1,l2,l3;
//	TextField txt1, txt2;
//	Button b;
//	
//	public MyApp() {
//		super("Tutor Joes");
//		setSize(1000,600);//w,h
//		setLayout(null);
//		setVisible(true);
//		
//		l1 = new Label("Enter the value 1 : ");
//		l1.setBounds(10,50,100,30);
//		
//		txt1 = new TextField();
//		txt1.setBounds(150, 50, 250, 30);
//		
//		l2 = new Label("Enter the value 2 : ");
//		l2.setBounds(10,100,100,30);
//		
//		txt2 = new TextField();
//		txt2.setBounds(150, 100, 250, 30);
//		
//		b = new Button("ADD");
//		b.setBounds(150, 150, 100, 30);
//		b.addActionListener(this);
//		
//		l3 = new Label("--");
//		l3.setBounds(10, 200, 300, 30);
//		
//		add(l1);add(l2);add(txt1);add(txt2);
//		add(b);add(l3);
//		//Close Button Code
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent we) {
//				System.exit(0);
//			}  
//		});
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String s1 = txt1.getText();
//		String s2 = txt2.getText();
//		
//		if(s1.isEmpty() || s2.isEmpty()) {
//			l3.setText("Please Enter the data");
//		} else {
//			int a = Integer.parseInt(s1);
//			int b = Integer.parseInt(s2);
//			int c = a+b;
//			String result = String.valueOf(c);
//			l3.setText("Total : "+result);
//		}
//	}
//}
//
//public class app{
//	public static void main(String[] args) {
//		MyApp frm = new MyApp();
//	}
//
//}

//----------------------------------------------------------------





//Text Area

//package awtDemo;
//
//import java.awt.*;
//import java.awt.event.*;
//
//class MyApp extends Frame implements ActionListener{
//	
//	TextArea t;
//	Label l;
//	TextField tf;
//	Button b;
//	
//	public MyApp() {
//		super("Tutor Joes");
//		setSize(600,600);//w,h
//		setLayout(null);
//		setVisible(true);
//		
//		l = new Label("----");
//		l.setBounds(20, 50, 250, 30);
//		
//		t = new TextArea(10,30);// R,C
//		t.setBounds(20, 100, 300, 200);
//		
//		tf = new TextField(20);
//		tf.setBounds(20, 350, 300, 30);
//		
//		b = new Button("Click");
//		b.setBounds(20, 400, 300, 30);
//		b.addActionListener(this);
//		
//		add(l);
//		add(t);
//		add(tf);
//		add(b);
//		//Close Button Code
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent we) {
//				System.exit(0);
//			}  
//		});
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		//1. It sets the selected text in TextArea to label
//		l.setText(t.getSelectedText());
//		
//		//2. It appends to the TextArea with the TextField content
//		//t.append(tf.getText());
//		
//		//3. It inserts in the TextArea with the TextField content to the cursor position
//		//t.insert(tf.getText(), t.getCaretPosition());
//	}
//}
//
//public class app{
//	public static void main(String[] args) {
//		MyApp frm = new MyApp();
//	}
//
//}

//----------------------------------------------------------------





//Program to count words and characters in Java AWT

//package awtDemo;
//
//import java.awt.*;
//import java.awt.event.*;
//
//class MyApp extends Frame implements ActionListener{
//	
//	Label l1,l2;
//	TextArea t;
//	Button b;
//	
//	public MyApp() {
//		super("Words & Letters Count");
//		setSize(600,600);//w,h
//		setLayout(null);
//		setVisible(true);
//		
//		l1=new Label("-------");
//		l1.setBounds(20,30,200,20);
//		l2=new Label("-------");
//		l2.setBounds(20,60,200,20);
//		t=new TextArea(10,30);
//		t.setBounds(20, 100, 300, 200);
//		b=new Button("Get Details");
//		b.setBounds(20, 320, 100, 30);
//		b.addActionListener(this);
//		
//		add(l1);add(l2);add(t);add(b);
//		
//		//Close Button Code
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent we) {
//				System.exit(0);
//			}  
//		});
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String text = t.getText();
//		String words[] = text.split("\\s");
//		l1.setText("Words : "+words.length);
//		l2.setText("Characters : "+text.length());
//	}
//}
//
//public class app{
//	public static void main(String[] args) {
//		MyApp frm = new MyApp();
//	}
//
//}

//----------------------------------------------------------------





//Choice in Java AWT - in web development combo box

//package awtDemo;
//
//import java.awt.*;
//import java.awt.event.*;
//
//class MyApp extends Frame implements ActionListener{
//	
//	Choice c;
//	Button b;
//	Label l;
//	
//	public MyApp() {
//		super("Choice in Java AWT");
//		setSize(600,600);//w,h
//		setLayout(null);
//		setVisible(true);
//		
//		c = new Choice();
//		c.setBounds(10,50,100,100);
//		
//		c.add("C");
//		c.add("C++");
//		c.add("Java");
//		c.add("PHP");
//		c.add("Android");
//		
//		add(c);
//		
//		b = new Button("Show Details");
//		b.setBounds(120, 50, 100, 20);
//		b.addActionListener(new ActionListener () {
//			public void actionPerformed(ActionEvent e) {
//				String data = "Programming language Selected : "+c.getItem(c.getSelectedIndex());
//				l.setText(data);
//			}
//		});
//		
//		add(b);
//		
//		l = new Label("Empty Label");
//		l.setBounds(10, 70, 300, 30);
//		
//		add(l);
//		//Close Button Code
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent we) {
//				System.exit(0);
//			}  
//		});
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//	}
//}
//
//public class app{
//	public static void main(String[] args) {
//		MyApp frm = new MyApp();
//	}
//
//}

//----------------------------------------------------------------





//List in Java AWT

//package awtDemo;
//
//import java.awt.*;
//import java.awt.event.*;
//
//class MyApp extends Frame implements ActionListener{
//	
//	List lst;
//	Button btn;
//	Label lbl;
//	
//	public MyApp() {
//		super("List in Java AWT");
//		setSize(600,600);//w,h
//		setLayout(null);
//		setVisible(true);
//		
//		lst = new List(1,true);//1.scroll count 2.false-single choice / true-multi choice
//		lst.setBounds(10, 50, 100, 100);
//		lst.add("Mercury");
//		lst.add("Venus");
//		lst.add("Earth");
//		lst.add("Mars");
//		lst.add("Jupiter");
//		lst.add("Saturn");
//		lst.add("Uranus");
//		lst.add("Neptune");
//		lst.add("Pluto");
//		
//		btn = new Button("Show Details");
//		btn.setBounds(10, 170, 100, 30);
//		btn.addActionListener(this);
//		
//		lbl = new Label("Empty Label");
//		lbl.setBounds(200, 170, 300, 30);
//		
//		add(lst);add(btn);add(lbl);
//		
//		//Close Button Code
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent we) {
//				System.exit(0);
//			}  
//		});
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String list[] = lst.getSelectedItems();
//		String data = "Selected Planet : ";
//		
//		for(String x : list)
//			data += x +" , ";
//		lbl.setText(data);
//	}
//}
//
//public class app{
//	public static void main(String[] args) {
//		MyApp frm = new MyApp();
//	}
//
//}

//----------------------------------------------------------------





//Canvas in Java AWT

//package awtDemo;
//
//import java.awt.*;
//import java.awt.event.*;
//
//class MyCanvas extends Canvas{
//	
//	public MyCanvas() {
//		setBackground(Color.GRAY);
//		setSize(300,200);
//	}
//	
//	public void paint(Graphics g) {
//		g.setColor(Color.red);
//		g.fillOval(75, 75, 150, 75);
//	}
//}
//
//class MyApp extends Frame{
//	
//	
//	
//	public MyApp() {
//		super("Canvas");
//		setSize(600,600);//w,h
//		setLayout(null);
//		setVisible(true);
//		
//		add(new MyCanvas());
//		
//		//Close Button Code
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent we) {
//				System.exit(0);
//			}  
//		});
//	}
//}
//
//public class app{
//	public static void main(String[] args) {
//		MyApp frm = new MyApp();
//	}
//
//}

//----------------------------------------------------------------





//MenuBar, Menu, MenuItem in Java AWT

//package awtDemo;
//
//import java.awt.*;
//import java.awt.event.*;
//
//class MyApp extends Frame{
//	
//	public MyApp() {
//		super("MenuBar, Menu, MenuItem");
//		setSize(600,600);//w,h
//		setLayout(null);
//		setVisible(true);
//
//		MenuBar m = new MenuBar();
//		Menu menu = new Menu("Menu");
//		Menu submenu = new Menu("Sub Menu");
//		MenuItem i1 = new MenuItem("Item 1");
//		MenuItem i2 = new MenuItem("Item 2");
//		MenuItem i3 = new MenuItem("Item 3");
//		MenuItem i4 = new MenuItem("Item 4");
//		MenuItem i5 = new MenuItem("Item 5");
//		
//		menu.add(i1);
//		menu.add(i2);
//		menu.add(i3);
//		menu.add(submenu);
//		
//		submenu.add(i4);
//		submenu.add(i5);
//		
//		m.add(menu);
//		
//		setMenuBar(m);
//		
//		//Close Button Code
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent we) {
//				System.exit(0);
//			}  
//		});
//	}
//}
//
//public class app{
//	public static void main(String[] args) {
//		MyApp frm = new MyApp();
//	}
//
//}

//----------------------------------------------------------------





//Panel in Java AWT

//package awtDemo;
//
//import java.awt.*;
//import java.awt.event.*;
//
//class MyApp extends Frame{
//	
//	public MyApp() {
//		super("Panel");
//		setSize(600,600);//w,h
//		setLayout(null);
//		setVisible(true);
//
//		Panel panel = new Panel();
//		panel.setBounds(40, 80, 200, 200);
//		panel.setBackground(Color.gray);
//		
//		Button b1 = new Button("Button 1");
//		b1.setBounds(50, 100, 80, 30);
//		b1.setBackground(Color.yellow);
//		
//		Button b2 = new Button("Button 2");
//		b2.setBounds(100, 100, 80, 30);
//		b2.setBackground(Color.green);
//		
//		panel.add(b1);
//		panel.add(b2);
//		
//		add(panel);
//		
//		//Close Button Code
//		this.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent we) {
//				System.exit(0);
//			}  
//		});
//	}
//}
//
//public class app{
//	public static void main(String[] args) {
//		MyApp frm = new MyApp();
//	}
//
//}

//----------------------------------------------------------------
//----------------------------------------------------------------





//Simple Registration Form in Java AWT

package awtDemo;

import java.awt.*;
import java.awt.event.*;

class MyApp extends Frame{
	
	//Object Creation for all components
	Label lblTitle, lblName, lblFather, lblAge, lblGender, lblCourse, lblHobbies, lblAddress;
	TextField txtName, txtFather, txtAge;
	TextArea txtAddress;
	Checkbox checkMale,checkFemale,Hobbies1,Hobbies2,Hobbies3,Hobbies4;
	CheckboxGroup cbg;
	Choice Course;
	Button btnSave, btnClear;
	
	public MyApp() {
		super("Panel");
		setSize(1000,600);//w,h
		setLayout(null);
		setVisible(true);
		
		//Color
		
		Color formColor = new Color(53, 59, 72);//color object
		setBackground(formColor);//setting background color

		//Font
		
		Font titleFont = new Font("arial", Font.BOLD, 25);//font styles
		Font labelFont = new Font("arial", Font.PLAIN, 18);
		Font textFont = new Font("arial", Font.PLAIN, 15);
		
		//Label Title
		
		lblTitle = new Label("Registration Form");
		lblTitle.setBounds(250, 40, 300, 50);
		lblTitle.setFont(titleFont);
		lblTitle.setForeground(Color.YELLOW);//text color
		add(lblTitle);
		
		//Label Name and TextField Name
		
		lblName = new Label("Name");
		lblName.setBounds(250, 100, 150, 30);
		lblName.setFont(labelFont);
		lblName.setForeground(Color.WHITE);
		add(lblName);
		
		txtName = new TextField();
		txtName.setBounds(400, 100, 400, 30);
		txtName.setFont(textFont);
		add(txtName);
		
		//Label Father and TextField Father
		
		lblFather = new Label("Father Name");
		lblFather.setBounds(250, 150, 150, 30);
		lblFather.setFont(labelFont);
		lblFather.setForeground(Color.WHITE);
		add(lblFather);
		
		txtFather = new TextField();
		txtFather.setBounds(400, 150, 400, 30);
		txtFather.setFont(textFont);
		add(txtFather);
		
		//Label Age and TextField Age
		
		lblAge = new Label("Age");
		lblAge.setBounds(250, 200, 150, 30);
		lblAge.setFont(labelFont);
		lblAge.setForeground(Color.WHITE);
		add(lblAge);
		
		txtAge = new TextField();
		txtAge.setBounds(400, 200, 400, 30);
		txtAge.setFont(textFont);
		add(txtAge);
		
		//Gender Selection
		
		lblGender = new Label("Gender");
		lblGender.setBounds(250, 250, 150, 30);
		lblGender.setFont(labelFont);
		lblGender.setForeground(Color.WHITE);
		add(lblGender);
		
		cbg = new CheckboxGroup();
		
		checkMale = new Checkbox("Male", cbg, true);
		checkMale.setBounds(400, 250, 100, 30);
		checkMale.setFont(labelFont);
		checkMale.setForeground(Color.WHITE);
		add(checkMale);
		
		checkFemale = new Checkbox("Female", cbg, false);
		checkFemale.setBounds(500, 250, 100, 30);
		checkFemale.setFont(labelFont);
		checkFemale.setForeground(Color.WHITE);
		add(checkFemale);
		
		//Choice Course
		
		lblCourse = new Label("Course");
		lblCourse.setBounds(250, 300, 150, 30);
		lblCourse.setFont(labelFont);
		lblCourse.setForeground(Color.WHITE);
		add(lblCourse);
		
		Course = new Choice();
		Course.setBounds(400, 300, 400, 50);
		Course.setFont(labelFont);
		Course.add("C");
		Course.add("C++");
		Course.add("Java");
		Course.add("C#");
		Course.add("Python");
		add(Course); 
		
		//Hobbies Selection
		
		lblHobbies = new Label("Hobbies");
		lblHobbies.setBounds(250, 350, 100, 50);
		lblHobbies.setFont(labelFont);
		lblHobbies.setForeground(Color.WHITE);
		add(lblHobbies);
		
		Hobbies1 = new Checkbox("Drawing");
		Hobbies1.setBounds(400, 350, 100, 50);
		Hobbies1.setFont(labelFont);
		Hobbies1.setForeground(Color.WHITE);
		add(Hobbies1);
		
		Hobbies2 = new Checkbox("Singing");
		Hobbies2.setBounds(500, 350, 100, 50);
		Hobbies2.setFont(labelFont);
		Hobbies2.setForeground(Color.WHITE);
		add(Hobbies2);
		
		Hobbies3 = new Checkbox("Music");
		Hobbies3.setBounds(600, 350, 100, 50);
		Hobbies3.setFont(labelFont);
		Hobbies3.setForeground(Color.WHITE);
		add(Hobbies3);
		
		Hobbies4 = new Checkbox("Cricket");
		Hobbies4.setBounds(700, 350, 100, 50);
		Hobbies4.setFont(labelFont);
		Hobbies4.setForeground(Color.WHITE);
		add(Hobbies4);
		
		//TextArea Address
		
		lblAddress = new Label("Address");
		lblAddress.setBounds(250, 400, 150, 30);
		lblAddress.setFont(labelFont);
		lblAddress.setForeground(Color.WHITE);
		add(lblAddress);
		
		txtAddress = new TextArea(10,30);
		txtAddress.setBounds(400, 400, 400, 100);
		txtAddress.setFont(labelFont);
		add(txtAddress);
		
		//Buttons - SAVE and CLEAR
		
		btnSave = new Button("Save Details");
		btnSave.setBounds(400, 530, 150, 30);
		btnSave.setFont(labelFont);
		btnSave.setBackground(Color.BLUE);
		btnSave.setForeground(Color.WHITE);
		add(btnSave);
		
		btnClear = new Button("Clear All");
		btnClear.setBounds(560, 530, 150, 30);
		btnClear.setFont(labelFont);
		btnClear.setBackground(Color.RED);
		btnClear.setForeground(Color.WHITE);
		add(btnClear);
		
		//Close Button Code
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}  
		});
	}
}

public class app{
	public static void main(String[] args) {
		MyApp frm = new MyApp();
	}

}