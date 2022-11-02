package sprint3.övning7;

import javax.swing.*;

public class MouseEventExercise extends JFrame {

    JButton button = new JButton("knapp");
    JPanel p = new JPanel();


    public MouseEventExercise(){
        add(p);
        p.add(button);

        button.addMouseListener(new MouseAdapterExercise(button));

        setLocation(1000,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        MouseEventExercise m = new MouseEventExercise();
    }
}
