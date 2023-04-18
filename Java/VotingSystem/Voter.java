package VotingSystem;

// import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class Voter extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6;
    JButton b1, b2;
    JRadioButton m, f, p1, p2, p3;
    ButtonGroup mf, pbg;
    JTextField t1, t2, t3, t4;
    ArrayList<VoterInfo> voterInfoList = new ArrayList<VoterInfo>();

    Voter() {
        l1 = new JLabel("VOTER ID:");
        l2 = new JLabel("NAME:");
        l3 = new JLabel("AGE:");
        l4 = new JLabel("CITY:");
        l5 = new JLabel("GENDER:");
        l6 = new JLabel("Party Symbol:");
        b1 = new JButton("VOTE");
        b2 = new JButton("SHOW RESULTS");
        m = new JRadioButton("MALE");
        f = new JRadioButton("FEMALE");
        p1 = new JRadioButton("Party 1");
        p2 = new JRadioButton("Party 2");
        p3 = new JRadioButton("Party 3");
        mf = new ButtonGroup(); 
        pbg = new ButtonGroup();
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        mf.add(m);
        mf.add(f);
        pbg.add(p1);
        pbg.add(p2);
        pbg.add(p3);
    }

    public void launch() {
        l1.setBounds(50, 50, 200, 30);
        l2.setBounds(50, 100, 200, 30);
        l3.setBounds(50, 150, 200, 30);
        l4.setBounds(50, 200, 200, 30);
        l5.setBounds(50, 250, 200, 30);
        l6.setBounds(50, 300, 200, 30);
        t1.setBounds(300, 50, 200, 30);
        t2.setBounds(300, 100, 200, 30);
        t3.setBounds(300, 150, 200, 30);
        t4.setBounds(300, 200, 200, 30);
        m.setBounds(300, 250, 100, 30);
        f.setBounds(450, 250, 100, 30);
        b1.setBounds(200, 375, 100, 30);
        b2.setBounds(350, 375, 150, 30);
        p1.setBounds(300, 300, 100, 30);
        p2.setBounds(450, 300, 100, 30);
        p3.setBounds(600, 300, 100, 30);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(m);
        add(f);
        add(b1);
        add(b2);
        add(p1);
        add(p2);
        add(p3);
        setTitle("Voter");
        setSize(700, 500);
        setLocation(400, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Voter v = new Voter();
        v.launch();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int voterId = Integer.parseInt(t1.getText());
            String name = t2.getText();
            int age = Integer.parseInt(t3.getText());
            String city = t4.getText();
            String gender = m.isSelected() ? "MALE" : "FEMALE";
            String partySymbol = "";
            if (p1.isSelected())
                partySymbol = "Party 1";
            else if (p2.isSelected())
                partySymbol = "Party 2";
            else if (p3.isSelected())
                partySymbol = "Party 3";

            // clear text fields and radio buttons
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            mf.clearSelection();
            pbg.clearSelection();

            VoterInfo voterInfo = new VoterInfo(voterId, name, age, city, gender, partySymbol);
            voterInfoList.add(voterInfo);

        }
        else if (e.getSource() == b2) {
            // create a new VoterDisplay object and show it
            VoterDisplay display = new VoterDisplay(voterInfoList);
            // display.launch();
            display.setVisible(true);
        }

    }

}
