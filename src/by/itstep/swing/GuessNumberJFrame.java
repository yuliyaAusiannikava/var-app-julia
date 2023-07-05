package by.itstep.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GuessNumberJFrame extends JFrame {

    private int x = 0;
    private int attempts;

    public GuessNumberJFrame() {
        setTitle("Guess Number Game");
        setLayout(null);
        setSize(400, 400);

        JLabel fromLbl = new JLabel("From: ");
        fromLbl.setBounds(40, 40, 120, 20);
        JTextField fromField = new JTextField("0");
        fromField.setBounds(40, 80, 60, 20);

        JLabel toLbl = new JLabel("To: ");
        toLbl.setBounds(120, 40, 120, 20);
        JTextField toField = new JTextField("10");
        toField.setBounds(120, 80, 60, 20);

        JButton genButton = new JButton();
        genButton.setText("Generate number!");
        genButton.setBounds(50, 120, 200, 20);

        add(genButton);
        add(fromLbl);
        add(toLbl);
        add(fromField);
        add(toField);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JLabel msg = new JLabel("");
        msg.setBounds(50, 100, 320, 20);
        add(msg);

        JButton clientButton = new JButton();
        clientButton.setText("Try to guess!");
        clientButton.setBounds(50, 200, 200, 20);
        add(clientButton);
        clientButton.setVisible(false);

        JTextField choiceField = new JTextField();
        choiceField.setBounds(50, 300, 40, 20);
        add(choiceField);
        choiceField.setVisible(false);




        JLabel lbl2 = new JLabel("Attempts");
        lbl2.setBounds(150, 250, 120, 20);
        JTextField field2 = new JTextField("3");
        field2.setBounds(150, 300, 60, 20);
        add(field2);
        add(lbl2);


        JButton restart = new JButton();
        restart.setText("Play again");
        restart.setBounds(200, 300,150, 20);
        add(restart);
        restart.setVisible(false);

        genButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int from = Integer.parseInt(fromField.getText());
                int to = Integer.parseInt(toField.getText());
                attempts = Integer.parseInt(field2.getText());
                int v = to - from + 1;
                x = (int) (Math.random() * v) + from;

                fromField.setEditable(false);
                toField.setEditable(false);
                field2.setEditable(false);
                genButton.setVisible(false);
                msg.setText("Random value was generated! Try to guess!");
                clientButton.setVisible(true);
                choiceField.setVisible(true);

            }
        });

        clientButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (attempts > 0) {
                    int userX = Integer.parseInt(choiceField.getText());
                    if (x == userX) {
                        msg.setText("You WON");
                        clientButton.setEnabled(false);
                        choiceField.setEditable(false);
                        restart.setVisible(true);
                    } else {
                        if (attempts == 1) {
                            clientButton.setEnabled(false);
                            choiceField.setEditable(false);
                            msg.setText("You lose");
                            restart.setVisible(true);
                        } else {
                            //still have attempts
                            msg.setText("Your number is" + (userX > x ? " greater " : " less "));
                        }
                    }
                }
                attempts--;
                field2.setText(attempts + " ");
            }

        });

        restart.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fromField.setEditable(true);
                fromField.setText("0");
                toField.setEditable(true);
                toField.setText("10");
                field2.setEditable(true);
                field2.setText("3");
                genButton.setVisible(true);

                restart.setVisible(false);

                msg.setText("");
                choiceField.setVisible(false);
                choiceField.setEditable(true);

                clientButton.setVisible(false);
                clientButton.setEnabled(true);
            }
        });


    }
}

class Player {
    public static void main(String[] args) {
        GuessNumberJFrame game = new GuessNumberJFrame();
    }
}
