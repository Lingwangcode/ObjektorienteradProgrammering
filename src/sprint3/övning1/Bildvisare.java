package sprint3.övning1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bildvisare extends JFrame implements ActionListener {

    //test branch
    //changes
    //changes
    ImageIcon i = new ImageIcon("C:\\Users\\lings\\OneDrive\\Desktop\\javamapp\\Natur bild2.jpg");
    ImageIcon i2 = new ImageIcon("C:\\Users\\lings\\OneDrive\\Desktop\\javamapp\\Natur bild4.jpg");
    JLabel jl1 = new JLabel(i);
    JLabel jl2 = new JLabel(i2);
    JButton jb = new JButton("Växla bild");

    Bildvisare(){
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        jb.addActionListener(this);
        add(p);
        p.add(jl2);
        p.add(jl1);
        p.add(jb);
        pack();
        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Bildvisare b = new Bildvisare();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

            jl1.setIcon(i2);
            jl2.setIcon(i);

    }
}
