package classroom;

// import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener{

    JButton b1,b2,b3;

    JTextField tf1,tf2,tf3;

    JLabel l1,l2,l3;

    GUI(){
    setSize(500,500);
    setLayout(null);
    setVisible(true);

    l1 = new JLabel();
    l1.setText("Label1");
    l1.setBounds(100,100,50,100);
    add(l1);

    b1 =new JButton();
    b1.setText("Button1");
    b1.setBounds(50,50,100,30);
    add(b1);

    tf1 = new JTextField();
    tf1.setBounds(300,50,100,30);
    add(tf1);

    }

public static void main(String[] args) {
    new GUI();
}

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
