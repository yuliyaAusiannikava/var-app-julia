package by.itstep.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My App");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        frame.setLayout(null);

        JButton button = new JButton();
        button.setText("Push me");
        button.setSize(120, 20);

        frame.add(button);
        button.setLocation(40, 40);

        JLabel lbl = new JLabel("Name:");
        JTextField field = new JTextField();
        lbl.setBounds(40,  65, 120, 20);
        field.setBounds(40,  90, 120, 20);

        frame.add(lbl);
        frame.add(field);

        JLabel helloLbl = new JLabel("");
        helloLbl.setBounds(40,  115, 200, 20);
        frame.add(helloLbl);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(new Date() + ": click");
                String name = field.getText();
                System.out.println("Hello " + name);

                helloLbl.setText("Hello " + name);
            }
        });




        frame.setVisible(true);

    }
}
