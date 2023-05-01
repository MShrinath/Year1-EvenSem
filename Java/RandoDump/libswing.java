package classroom;

// import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class libswing extends JFrame implements ActionListener{

    JLabel l1,l2 ;
    JTextField tf1,tf2;
    JButton b1;

    public libswing(){
        setSize(1000,500);
        setLayout(null);
    
        l1 = new JLabel();
        l1.setText("hiiiiiiiii");
        l1.setBounds(100,200,100,30);
        add(l1);


        tf1 = new JTextField();
        tf1.setBounds(200,200,100,30);
        add(tf1);

        b1 = new JButton();
        b1.setText("button");
        b1.setBounds(300,200,100,30);
        add(b1);

    }


    public static void main(String[] args) {
        libswing s =new libswing();
        s.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {


    }
}
