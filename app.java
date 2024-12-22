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
	
	
	
	public MyApp() {
		super("Panel");
		setSize(600,600);//w,h
		setLayout(null);
		setVisible(true);

		
		
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
