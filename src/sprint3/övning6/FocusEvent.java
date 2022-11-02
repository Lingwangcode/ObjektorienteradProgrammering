package sprint3.övning6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FocusEvent extends JFrame implements FocusListener {
    JButton b1 = new JButton("Knapp 1");
    JButton b2 = new JButton("Knapp 2");
    JTextField första = new JTextField("Skriv något här");

    JPanel p = new JPanel();

    public FocusEvent(){
        add(p);
        p.add(b1);
        p.add(b2);
        p.add(första);
        p.setLayout(new GridLayout(3,1));
        addWindowListener(fönsterLyss);

        första.addFocusListener(this);


        pack();
        setLocation(1000,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    WindowAdapter fönsterLyss = new WindowAdapter() {
        @Override
        public void windowActivated(WindowEvent e) {
            första.requestFocus();
        }
    };

    @Override
    public void focusGained(java.awt.event.FocusEvent e) {

        if (e.getComponent() == första){
            första.setBackground(Color.BLUE);
        }

    }

    @Override
    public void focusLost(java.awt.event.FocusEvent e) {
        if (e.getComponent() == första){
            första.setBackground(Color.white);
        }
    }

    public static void main(String[] args) {
        FocusEvent f = new FocusEvent();
    }
}
