package classroom;

// import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class m1 extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton b1, b2;

    public m1() {
        setSize(300, 300);
        setLayout(null);
        setTitle("M1");

        l1 = new JLabel("Party 1");
        l1.setBounds(50, 50, 50, 50);
        add(l1);

        l2 = new JLabel("Party 2");
        l2.setBounds(50, 125, 50, 50);
        add(l2);

        b1 = new JButton("Vote");
        b1.setBounds(100, 50, 75, 30);
        add(b1);

        b2 = new JButton("Vote");
        b2.setBounds(100, 125, 75, 30);
        add(b2);

    }

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public static void main(String[] args) {
        m1 l = new m1();
        l.setVisible(true);
    }
}