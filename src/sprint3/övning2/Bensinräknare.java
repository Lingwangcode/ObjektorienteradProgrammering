package sprint3.övning2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Bensinräknare extends JFrame implements ActionListener {

    JLabel l1 = new JLabel("Ange mätarställning nu:");
    JLabel l2 = new JLabel("Ange mätarställning för ett år sedan:");
    JLabel l3 = new JLabel("Ange antal liter förbrukad bensin:");

    JTextField tf1 = new JTextField(30);
    JTextField tf2 = new JTextField(30);
    JTextField tf3 = new JTextField(30);

    JLabel l4 = new JLabel("Antal körda mil:");
    JLabel l5 = new JLabel("Antal liter bensin:");
    JLabel l6 = new JLabel("Förbrukning per mil:");

    JLabel l7 = new JLabel(" ");
    JLabel l8 = new JLabel(" ");
    JLabel l9 = new JLabel(" ");
    public Bensinräknare(){

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridLayout(3,2));
        JPanel panelSouth = new JPanel();
        panelSouth.setLayout(new FlowLayout());
        add(panel);
        panel.add(panelNorth, BorderLayout.NORTH);//prova adda båda samtidigt sen!
        panel.add(panelSouth, BorderLayout.SOUTH);

        panelNorth.add(l1);
        panelNorth.add(tf1);
        panelNorth.add(l2);
        panelNorth.add(tf2);
        panelNorth.add(l3);
        panelNorth.add(tf3);

        panelSouth.add(l4);
        panelSouth.add(l7);
        panelSouth.add(l5);
        panelSouth.add(l8);
        panelSouth.add(l6);
        panelSouth.add(l9);

        tf1.addActionListener(this);
        tf2.addActionListener(this);
        tf3.addActionListener(this);




        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pack();
    }

    public static void main(String[] args) {
        Bensinräknare b = new Bensinräknare();
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == tf1 || e.getSource()== tf2 || e.getSource() == tf3){
            Scanner sctf1 = new Scanner(tf1.getText());
            Scanner sctf2 = new Scanner(tf2.getText());
            Scanner sctf3 = new Scanner(tf3.getText());

            if (sctf1.hasNextDouble() && sctf2.hasNextDouble() && sctf3.hasNextDouble()){
                double entertf1 = sctf1.nextDouble();
                double entertf2 = sctf2.nextDouble();
                double entertf3 = sctf3.nextDouble();

                l7.setText(String.format("Antal liter bensin: %8.0f \n",entertf1 - entertf2));
                l8.setText(String.format("Antal liter bensin: %7.1f \n",entertf3));
                l9.setText(String.format("Förbrukning per mil: %1.2f \n", entertf3/(entertf1 - entertf2)));

            }
            pack();

        }

    }
}

