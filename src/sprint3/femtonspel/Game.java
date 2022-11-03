package sprint3.femtonspel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Game extends JFrame implements ActionListener{

    JPanel buttonPanel = new JPanel();
    JButton[][] buttons = new JButton[4][4];
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

    public void addButtons() { // Initierar knapparna

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

    public void shuffle() { //sätter text på knapparna
        try {

            boolean[] isUsed = new boolean[16];

            for (int i = 0; i < buttons.length; i++) {
                for (int j = 0; j < buttons.length; j++) {

                    int randomNumber = 0;

                    while (isUsed[randomNumber]) {
                        randomNumber = (int) (Math.random() * 16);
                    }

                    isUsed[randomNumber] = true;

                    if (randomNumber != 0) {
                        buttons[i][j].setText("" + randomNumber);

                    } else {

                        buttons[i][j].setText("");
                        r = i;
                        c = j;
                    }

                }
            }
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    public void win() { //convertera textstring på knapparna till int och kolla ifall numren är sorterade
        try {

            List<Integer> buttonNr = new ArrayList<>();
            int[][] buttonLabel = new int[4][4];
            String buttonText = "";

            for (int i = 0; i < buttons.length; i++) {
                for (int j = 0; j < buttons.length; j++) {

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

    public boolean isListSorted(List<Integer> buttonNr){ // kollar ifall numren på knapparna är sorterade

        if ( buttonNr.stream().sorted().collect(Collectors.toList()).equals(buttonNr))
            return true;
        else
            return false;

    }

    public void sort() { //Sorterar numren på knapparna i rätt ordning
        try{

            int count = 0;
            for (int i = 0; i < buttons.length; i++) {
                for (int j = 0; j < buttons.length; j++) {

                    count ++;
                    buttons[i][j].setText(""+count);
                }
            }
            buttons[buttons.length-1][buttons.length-1].setText("");
            r = buttons.length - 1;
            c = buttons.length - 1;

        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

   @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < buttons.length; i++){

            for (int j = 0; j < buttons.length; j++){

                if (buttons[i][j] == e.getSource()){

                    if (i - 1 == r && j == c || i + 1 == r && j == c ||
                            i == r && j - 1 == c || i == r && j + 1 == c){

                        String temp = buttons[r][c].getText();
                        buttons[r][c].setText(buttons[i][j].getText());
                        buttons[i][j].setText(temp);
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
