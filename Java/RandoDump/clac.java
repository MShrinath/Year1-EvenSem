package pocket;

// import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class clac extends JFrame implements ActionListener {
	JTextField t1, t2, t3;
	JButton b1, b2, b3, b4, b5, z;

	public clac() {

		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();

		b1 = new JButton("+");
		b2 = new JButton("-");
		b3 = new JButton("*");
		b4 = new JButton("/");
		b5 = new JButton("%");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);

		t1.setBounds(50, 100, 150, 30);
		t2.setBounds(50, 150, 150, 30);
		t3.setBounds(50, 200, 150, 30);
		b1.setBounds(50, 250, 150, 30);
		b2.setBounds(50, 300, 150, 30);
		b3.setBounds(50, 350, 150, 30);
		b4.setBounds(50, 400, 150, 30);
		b5.setBounds(50, 450, 150, 30);

		z = new JButton("Button");
		z.setBounds(500, 100, 500, 500);

		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(z);

		setLayout(null);
		setVisible(true);
		setSize(275, 575);
	}

	public void actionPerformed(ActionEvent e) {
		String s1 = t1.getText();
		String s2 = t2.getText();
		int a, b, c;
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		if (e.getSource() == b1)
			c = a + b;
		else if (e.getSource() == b2)
			c = a - b;
		else if (e.getSource() == b3)
			c = a * b;
		else if (e.getSource() == b4)
			c = a / b;
		else
			c = a % b;
		String s3 = String.valueOf(c);
		t3.setText(s3);
	}

	public static void main(String[] args) {
		new clac();
	}
}