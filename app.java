//Frame in Java AWT

//First Approach - 

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





//Second Approach - 

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





//Third Approach - 

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

package awtDemo;

import java.awt.*;
import java.awt.event.*;

class MyApp extends Frame implements ActionListener{
	Button btn;
	Label lbl;
	public MyApp() {
		super("Tutor Joes");
		setSize(1000,600);
		setLayout(null);
		
		btn = new Button("Click Me");
		btn.setBounds(75, 75, 200, 50);
		btn.addActionListener(this);
		add(btn);
		
		lbl = new Label("-----");
		lbl.setBounds(75,150,200,50);
		add(lbl);
		
		setVisible(true);
		
		//code for window closing
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}  
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		lbl.setText("Button Clicked");
	}
}

public class app{
	public static void main(String[] args) {
		MyApp frm = new MyApp();
	}

}