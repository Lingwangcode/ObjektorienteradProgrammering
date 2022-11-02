package sprint3.inlämning3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionLyssnare implements ActionListener {

    JButton[] buttons = new JButton[16];
    JButton nyttSpel;
    JButton test;

    public ActionLyssnare(JButton nyttSpel, JButton test){
        this.nyttSpel = nyttSpel;
        this.test = test;
    }

    public ActionLyssnare( JButton[] buttons){
        this.buttons = buttons;
    }

    public void shuffle(JButton[] buttons){
        for (int i = 0; i < buttons.length; i++){
            int random = i + (int) (Math.random() * (buttons.length - i));
            JButton temp = buttons[random];
            buttons[random] = buttons[i];
            buttons[i] = temp;
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(this.buttons[0]);

        if (e.getSource() == nyttSpel){
            shuffle(buttons);
        }

        JButton[] centerButtons = new JButton[8];


        for (int i = 0; i < buttons.length; i++){
            if (e.getSource() == buttons[1] || e.getSource()== buttons[2] ||
                    e.getSource() == buttons[5] || e.getSource() == buttons [6] ||
                    e.getSource() == buttons[9] || e.getSource() == buttons[10] ||
                    e.getSource() == buttons[13] || e.getSource() == buttons[14]){
                String tempText = "";
                if (buttons[i+1].getText().equals(tempText)){
                    JButton buttonTemp = buttons[i+1];
                   // buttons[i+1].setText(buttons[i].getText());
                    buttons[i+1] = buttons[i];
                    //buttons[i].setText(tempText);
                    buttons[i] = buttonTemp;
                }
            }
            /*if (e.getSource()== buttons[i]){
                JButton temp = new JButton("");
                if (buttons[i+1].getText().equals(temp.getText())){
                buttons[i+1].setText(buttons[i].getText());
                buttons[i].setText(temp.getText());
                buttons[15]= buttons[i];
                }
                else if (buttons[i-1].getText().equals(buttons[15].getText())){
                    buttons[i-1].setText(buttons[i].getText());
                    buttons[i].setText(temp.getText());
                    buttons[15]= buttons[i];
                }
            }

             */
        }


    }
}
