package sprint3.övning7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseAdapterExercise implements MouseListener {

    JButton b = new JButton();
    public MouseAdapterExercise(JButton b){
        this.b = b;
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if (e.getSource()== b ){
            b.setBackground(Color.RED);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
