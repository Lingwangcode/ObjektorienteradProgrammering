package sprint3.övning4a;

import javax.swing.*;

public class TextEditor extends JFrame {

    JLabel l = new JLabel("Filnamn");
    JButton open = new JButton("Öppna");
    JButton save = new JButton("Spara");
    JButton print = new JButton("Skriv ur");
    JButton end = new JButton("Avsluta");
    JTextArea area = new JTextArea();

    JPanel north = new JPanel();
    JPanel south = new JPanel();

    public TextEditor(){
        north.add(l);
        north.add(open);
        north.add(save);
        north.add(print);
        north.add(end);
    }

    public static void main(String[] args) {
        TextEditor t = new TextEditor();
    }
}
