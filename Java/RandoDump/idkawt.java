package classroom;

import java.awt.*;
import java.awt.event.*;

public class idkawt{
    public static void main(String[] args) {
        Window f = new Frame("idkawt");
        TextField hi = new TextField("Hello World");
        f.add(hi);
        f.setSize(300, 300);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}