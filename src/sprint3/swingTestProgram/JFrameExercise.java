package sprint3.swingTestProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameExercise extends JFrame implements ActionListener {

    JLabel label = new JLabel("Hej");
    JButton button = new JButton("Tryck här");



    JFrameExercise(){
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        add(panel);
        panel.add(label);
        panel.add(button);
        button.addActionListener(this);
        this.add(panel);
        panel.add(new JLabel("Hej 2"));
        panel.add(new JButton("och här"));
        panel.add(new JButton("och här med"));
        panel.add(new JButton("massa knappar"));

        //setSize(500,500);
        pack();
        setLocation(1000, 500);
        //setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrameExercise g = new JFrameExercise();
    }

    //@Override
    public void actionPerformed(ActionEvent e) {

        if (label.getText().equalsIgnoreCase("Hej")){
            label.setText("Hopp");
        }
        else{
            label.setText("Hej");
        }

    }
}
