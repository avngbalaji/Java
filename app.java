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

package awtDemo;

import java.awt.*;
import java.awt.event.*;

class MyApp extends Frame{
	
	Label l1,l2;
	Checkbox c1,c2;
	CheckboxGroup cbg;
	
	public MyApp() {
		super("Tutor Joes");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		cbg = new CheckboxGroup();
		
		c1 = new Checkbox("Male",cbg,false);
		c1.setBounds(10,50,250,30);
		
		l1 = new Label("Not Selected");
		l1.setBounds(300, 50, 600, 30);
		
		
		c2 = new Checkbox("Female",cbg,false);
		c2.setBounds(10, 100, 250, 30);
		
		l2 = new Label("Not Selected");
		l2.setBounds(300, 100, 600, 30);
		
		
		c1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				l1.setText(e.getStateChange()==1?"checked":"unchecked");
				l2.setText("unchecked");
			}
		});
		
		c2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				l1.setText("unchecked");
				l2.setText(e.getStateChange()==1?"checked":"unchecked");
			}
		});
		
		add(c1);add(l1);add(c2);add(l2);
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