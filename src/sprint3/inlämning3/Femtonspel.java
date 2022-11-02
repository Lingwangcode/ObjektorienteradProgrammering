package sprint3.inlämning3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class Femtonspel extends JFrame implements ActionListener{

    List<JButton> buttons = new ArrayList<>(16);
    JPanel panel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JButton nyttSpel = new JButton("Nytt spel");
    JButton test = new JButton("Test spel");



    public Femtonspel(){
        buttonManager();
        setSizeButton();
        System.out.println(buttons.get(0));
        setLayout(new BorderLayout());
        panel.add(nyttSpel);
        panel.add(test);
        addButtons();
        buttonPanel.setLayout(new GridLayout(4,4));
        add(panel, BorderLayout.NORTH);


        add(buttonPanel, BorderLayout.SOUTH);
        nyttSpel.addActionListener(this);

        for (int i = 0; i < buttons.size(); i++){
            buttons.get(i).addActionListener(this);
        }


        pack();
        setLocation(1000,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void addButtons(){
        for (int i = 0; i < buttons.size(); i++){
            buttonPanel.add(buttons.get(i));
        }
    }


    public void buttonManager(){


            List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "");

            for (int i = 0; i < numbers.size(); i++) {

                    buttons.add(new JButton(numbers.get(i)));

            }

    }
    public void setSizeButton(){
        Dimension d = new Dimension(50, 50);
        for (int i = 0; i< buttons.size(); i++){
            buttons.get(i).setPreferredSize(d);
        }
    }



    public static void main(String[] args) {
        Femtonspel f = new Femtonspel();

    }

    public void shuffleButtons() {
        buttonPanel.removeAll();
        for (JButton button : buttons) {
            buttonPanel.add(button);
        }
        buttonPanel.revalidate();
        buttonPanel.repaint();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(this.buttons.get(0).getText());

        if (e.getSource() == nyttSpel) {
            Collections.shuffle(buttons);
            shuffleButtons();
        }

        String tempText = "";
        for (int i = 0; i < buttons.size()+5; i++) {
            if (e.getSource()==buttons.get(i) && buttons.get(i+1).getText().equals(tempText)) {
                if (buttons.get(i) == buttons.get(1) || buttons.get(i) == buttons.get(2) ||
                        buttons.get(i) == buttons.get(5) || buttons.get(i) == buttons.get(6)||
                        buttons.get(i) == buttons.get(9) || buttons.get(i) == buttons.get(10) ||
                        buttons.get(i) == buttons.get(13) || buttons.get(i) == buttons.get(14)){

                    buttons.get(i + 1).setText(buttons.get(i).getText());

                    buttons.get(i).setText(tempText);
                }

            }

            if (e.getSource()==buttons.get(i) && buttons.get(i-1).getText().equals(tempText)) {
                if (buttons.get(i) == buttons.get(1) || buttons.get(i) == buttons.get(2) ||
                        buttons.get(i) == buttons.get(5) || buttons.get(i) == buttons.get(6)||
                        buttons.get(i) == buttons.get(9) || buttons.get(i) == buttons.get(10) ||
                        buttons.get(i) == buttons.get(13) || buttons.get(i) == buttons.get(14)){

                    buttons.get(i - 1).setText(buttons.get(i).getText());

                    buttons.get(i).setText(tempText);
                }

            }
            if (e.getSource()==buttons.get(i) && buttons.get(i+4).getText().equals(tempText)) {
                if (buttons.get(i) == buttons.get(1) || buttons.get(i) == buttons.get(2) ||
                        buttons.get(i) == buttons.get(5) || buttons.get(i) == buttons.get(6)||
                        buttons.get(i) == buttons.get(9) || buttons.get(i) == buttons.get(10)){

                    buttons.get(i + 4).setText(buttons.get(i).getText());

                    buttons.get(i).setText(tempText);
                }

            }
        }
    }


}
