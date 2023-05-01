package classroom;

import java.awt.*;
import java.awt.event.*;

public class rgbawt extends Frame implements ActionListener{
    Button r,g,b;
    TextField rgb;
    rgbawt(){
        r = new Button("Red");
        g = new Button("Green");
        b = new Button("Blue");

        r.setBounds(100, 50, 50, 30);
        g.setBounds(100, 100, 50, 30);
        b.setBounds(100, 150, 50, 30);

        rgb = new TextField();
        rgb.setBounds(100, 200, 50, 30);
        
        add(r);
        add(g);
        add(b);
        add(rgb);

        r.addActionListener(this);
        g.addActionListener(this);
        b.addActionListener(this);

        setSize(250,250);
        setLayout(null);
        setTitle("RGB");
    }

    public static void main(String[] args) {
        rgbawt r = new rgbawt();
        r.setVisible(true);
        r.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == r)
            rgb.setText("Red");
        if(e.getSource() == g)
            rgb.setText("Green");
        if(e.getSource() == b)
            rgb.setText("Blue");

    }

}
