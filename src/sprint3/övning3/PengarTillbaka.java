package sprint3.övning3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PengarTillbaka extends JFrame implements ActionListener {

    JPanel norr = new JPanel();
    JPanel center = new JPanel();
    JPanel söder = new JPanel();

    JLabel pris = new JLabel("Pris:");
    JLabel betalning = new JLabel("Hur mycket betalar du?");

    JTextField kostnad = new JTextField();
    JTextField betalt = new JTextField();



    JCheckBox tusen = new JCheckBox("1000 lappar",true);
    JCheckBox femHundrar = new JCheckBox("500 lappar",true);
    JCheckBox hundra = new JCheckBox("100 lappar",true);
    JCheckBox femtio = new JCheckBox("50 lappar",true);
    JCheckBox tjugo = new JCheckBox("20 lappar",true);
    JCheckBox tio = new JCheckBox("10 lappar",true);
    JCheckBox fem = new JCheckBox("5 kronor",true);
    JCheckBox två = new JCheckBox("2 kronor",true);
    JCheckBox ett = new JCheckBox("1 krona",true);

    JLabel l1000 = new JLabel();
    JLabel l500 = new JLabel();
    JLabel l100 = new JLabel();
    JLabel l50 = new JLabel();
    JLabel l20 = new JLabel();
    JLabel l10 = new JLabel();
    JLabel l5 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l1 = new JLabel();

    public PengarTillbaka(){

        setLayout(new BorderLayout());
        add("North", norr);
        add("Center",center );
        add("South", söder);

        norr.setLayout(new GridLayout(2,2));
        center.setLayout(new GridLayout(3,3));
        söder.setLayout(new GridLayout(3,3));

        norr.add(pris); norr.add(kostnad); norr.add(betalning); norr.add(betalt);

        center.add(tusen); center.add(femHundrar); center.add(hundra);
        center.add(femtio); center.add(tjugo); center.add(tio); center.add(fem);
        center.add(två); center.add(ett);

        söder.add(new Label("Växel tillbaka:")); söder.add(l1000); söder.add(l500); söder.add(l100); söder.add(l50); söder.add(l20);
        söder.add(l10); söder.add(l5); söder.add(l2); söder.add(l1);

        kostnad.addActionListener(this);
        betalt.addActionListener(this);
        pack();
        setLocation(1000,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



    }

    public static void main(String[] args) {
        PengarTillbaka p = new PengarTillbaka();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()== kostnad || e.getSource() == betalt){
            int pris   = Integer.parseInt(kostnad.getText());
            int betalting = Integer.parseInt(betalt.getText());
            int tillbaka = betalting - pris;

            if (tusen.isSelected()){
                l1000.setText(tillbaka / 1000 + " tusenlappar");
                tillbaka = tillbaka%1000;
            }

            if (femHundrar.isSelected()){
                l500.setText(tillbaka/ 500 + "femhundrar lappar");
                tillbaka = tillbaka %500;
            }

            if (hundra.isSelected()){
                l100.setText(tillbaka/ 100 + "hundrar lappar");
                tillbaka = tillbaka % 100;
            }
            if (femtio.isSelected()){
                l50.setText(tillbaka/ 50 + "femtio lappar");
                tillbaka = tillbaka % 50;
            }

            if (tjugo.isSelected()){
                l20.setText(tillbaka/ 20 + "tjugo lappar");
                tillbaka = tillbaka % 20;
            }
            if (tio.isSelected()){
                l10.setText(tillbaka/ 10 + "tio kronor");
                tillbaka = tillbaka % 50;
            }

            if (fem.isSelected()){
                l5.setText(tillbaka/ 5 + "fem kronor");
                tillbaka = tillbaka % 5;
            }

            if (två.isSelected()){
                l2.setText(tillbaka/ 2 + "två kronor");
                tillbaka = tillbaka % 2;
            }

            l1.setText(tillbaka/ 1 + "en krona");
            tillbaka = tillbaka % 1;
            pack();

        }

    }
}
