package classroom;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Voting extends JFrame implements ActionListener {
    JButton b1, b2;
    m2 r = new m2();
    m1 l = new m1();

    Voting(){
        setSize(500, 500);
        setLayout(new BorderLayout());
        b1 = new JButton("M1");
        b2 = new JButton("M2");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this); 
        // m1 l = new m1();
        // l.setVisible(true);
        // m2 r = new m2();
        // r.setVisible(true);
        
    }

    public static void main(String[] args) {
        // Voting v = new Voting();
        // v.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            l.setVisible(true);
            r.dispose();
        }
        else if(e.getSource() == b2){
            r.setVisible(true);
            l.dispose();
        }
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}