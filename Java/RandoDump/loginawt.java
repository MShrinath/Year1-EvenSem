package classroom;

import java.awt.*;
import java.awt.event.*;

public class loginawt extends Frame implements ActionListener {
    TextField t1,t2,t3;
    Button b1,b2;
    Label l1,l2;
    loginawt(){
        l1 = new Label("Username");
        l1.setBounds(50, 50, 100, 30);
        l2 = new Label("Password");
        l2.setBounds(50, 100, 100, 30);

        t1 = new TextField();
        t1.setBounds(150, 50, 100, 30);
        t2 = new TextField();
        t2.setBounds(150, 100, 100, 30);

        b1 = new Button("Login");
        b1.setBounds(50, 200, 100, 30);
        b2 = new Button("Close");
        b2.setBounds(150, 200, 100, 30);

        t3 = new TextField();
        t3.setBounds(100, 150, 100, 20);
        add(l1);
        add(l2);

        add(t1);
        add(t2);
        add(t3);

        add(b1);
        add(b2);

        setSize(300, 300);
        setLayout(null);
        setTitle("Loginnnnn");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = t1.getText();
                String s2 = t2.getText();
                if (s1.equals("admin") && s2.equals("admin")) {
                    t3.setText("Login Successful");
                } else {
                    t3.setText("Login Failed");
                }
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }


    public static void main(String[] args) {
        loginawt l = new loginawt();
        l.setVisible(true);
        l.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
