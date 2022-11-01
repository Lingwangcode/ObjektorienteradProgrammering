package sprint3.femtonspel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Game extends JFrame implements ActionListener {

    JPanel buttonPanel = new JPanel();
    JButton[][] buttons = new JButton[4][4];
    int[][] buttonLabel = new int[4][4];
    int r, c;
    JPanel panel = new JPanel();
    JButton nyttSpel = new JButton("Nytt spel");
    JButton test = new JButton("Test spel");


    public Game() {
        setLayout(new BorderLayout());
        nyttSpel.addActionListener(this);
        test.addActionListener(this);
        panel.add(nyttSpel);
        panel.add(test);
        addButtons();
        shuffle();
        buttonPanel.setLayout(new GridLayout(4, 4));
        add(panel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void addButtons() {
        Dimension d = new Dimension(50, 50);
        try {
            for (int i = 0; i < buttons.length; i++) {
                for (int j = 0; j < buttons.length; j++) {
                    buttons[i][j] = new JButton();
                    buttonPanel.add(buttons[i][j]);
                    buttons[i][j].setPreferredSize(d);
                    buttons[i][j].addActionListener(this);
                }
            }
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }

    public void win() {
        try {
            List<Integer> buttonNr = new ArrayList<>();
            String buttonText = "";
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    buttonText = buttons[i][j].getText();
                    if (buttonText != "") {
                        buttonLabel[i][j] = Integer.parseInt(buttonText);
                        buttonNr.add(buttonLabel[i][j]);
                    } else {
                        buttonText = "16";
                        buttonLabel[i][j] = Integer.parseInt(buttonText);
                        buttonNr.add(buttonLabel[i][j]);

                    }

                }
            }

        if (isListSorted(buttonNr) == true) {
            JOptionPane.showMessageDialog(null,"You win!!!");
            System.exit(0);
        }
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }


    }

    public void sort() {
        try{
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                count ++;
                buttons[i][j].setText(""+count);
            }
        }
        buttons[3][3].setText("");
        r = 3;
        c = 3;
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }


    }
    public boolean isListSorted(List<Integer> buttonNr){
        if ( buttonNr.stream().sorted().collect(Collectors.toList()).equals(buttonNr))
            return true;
        else
            return false;

    }

    public void shuffle() {
        boolean[] isUsed = new boolean[16];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j< 4; j++){
                int randomNumber = 0;
                while (isUsed[randomNumber]){
                    randomNumber = (int)(Math.random()*16);
                }
                isUsed[randomNumber] = true;
                if (randomNumber != 0){
                    buttons[i][j].setText("" + randomNumber);
                }
                else {
                    buttons[i][j].setText("");
                    r = i; c = j;
                }

            }

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (buttons[i][j] == e.getSource()){
                    if (i - 1 == r && j == c || i + 1 == r && j == c ||
                            i == r && j - 1 == c || i == r && j + 1 == c){
                        buttons[r][c].setText(buttons[i][j].getText());
                        buttons[i][j].setText("");
                        r = i;
                        c = j;
                    }
                }
            }
        }
        win();

        if (e.getSource() == nyttSpel){
            shuffle();
        }

        if (e.getSource()== test){
            sort();
        }

    }


    public static void main(String[] args) {
        Game g = new Game();

    }


}
