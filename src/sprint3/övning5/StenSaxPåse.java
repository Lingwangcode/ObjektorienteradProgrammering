package sprint3.övning5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StenSaxPåse extends JFrame implements ActionListener {

    JButton sten = new JButton("Sten");
    JButton sax = new JButton("Sax");
    JButton påse = new JButton("Påse");


    JButton dSten = new JButton("Sten");
    JButton dSax = new JButton("Sax");
    JButton dpåse = new JButton("Påse");


    int vinst;
    int förlust;
    JLabel vinstL = new JLabel("Antal vinster: 0");
    JLabel förlustL = new JLabel("Antal förluster: 0");
    JLabel info = new JLabel();
    JPanel användare = new JPanel();
    JPanel dator = new JPanel();
    JPanel visaVinst = new JPanel();

    public StenSaxPåse(){
        setLayout(new BorderLayout());
        add("North", användare);
        add("South", dator);
        add("Center", visaVinst);


        användare.add(sten);
        användare.add(sax);
        användare.add(påse);

        dator.add(dSten);
        dator.add(dSax);
        dator.add(dpåse);

        visaVinst.add(info);
        visaVinst.add(vinstL);
        visaVinst.add(förlustL);
        visaVinst.setLayout(new GridLayout(3,1));

        sten.addActionListener(this);
        sax.addActionListener(this);
        påse.addActionListener(this);

        pack();
        setLocation(1000,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        StenSaxPåse ssp = new StenSaxPåse();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        final int STEN = 0, SAX = 1, PÅSE = 2;
        int val;
        if (e.getSource() == sten){
            val = STEN;
            sten.setBackground(Color.yellow);
            sax.setBackground(Color.lightGray);
            påse.setBackground(Color.lightGray);
        }
        else if (e.getSource() == sax){
            val = SAX;
            sax.setBackground(Color.yellow);
            sten.setBackground(Color.lightGray);
            påse.setBackground(Color.lightGray);
        }
        else {
            val = PÅSE;
            påse.setBackground(Color.yellow);
            sten.setBackground(Color.lightGray);
            sax.setBackground(Color.lightGray);
        }

        int val2 =(int) (Math.random()*3);
        if (val2 == STEN){
            dSten.setBackground(Color.yellow);
            dSax.setBackground(Color.lightGray);
            dpåse.setBackground(Color.lightGray);
        }
        else if (val2 == SAX){
            dSax.setBackground(Color.yellow);
            dSten.setBackground(Color.lightGray);
            dpåse.setBackground(Color.lightGray);
        }
        else{
            dpåse.setBackground(Color.yellow);
            dSten.setBackground(Color.lightGray);
            dSax.setBackground(Color.lightGray);

        }

        if (val == val2){
            info.setText("Oavgjort! Gör ett nytt försök!");
        }
        else if (val==STEN && val2 == SAX ||
                val == SAX && val2 == PÅSE ||
                val == PÅSE && val2 == STEN){
            info.setText("Du vann!");
            vinstL.setText("Antal vinster: " + ++vinst);
        }
        else {
            info.setText("Du förlorade");
            förlustL.setText("Antal förluster: " + ++förlust);
        }

    }
}
