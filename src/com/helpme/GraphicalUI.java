package com.helpme;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicalUI extends JFrame {
    private JButton buttonRNG = new JButton("Make me random number!");
    private JButton buttonTrueFalse = new JButton("Should i do this?");
    private JTextField inputFirst = new JTextField("", 5);
    private JTextField inputSecond = new JTextField("", 5);
    private JLabel label1 = new JLabel("Введите диапазон от:");
    private JLabel label2 = new JLabel("До:");


    public GraphicalUI() {
        super("Simple Example");
        this.setBounds(100,100,450,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label1);
        container.add(label2);
        container.add(inputFirst);
        container.add(inputSecond);

        ButtonGroup group = new ButtonGroup();

        buttonRNG.addActionListener(new ButtonEventListener());
        container.add(buttonRNG);
        buttonTrueFalse.addActionListener(new ButtonEventListener());
        container.add(buttonTrueFalse);
    }

    class ButtonEventListener implements ActionListener {
        Rng GenerateNumber = new Rng();
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Your random number is:\n";
            int x = Integer.parseInt(inputFirst.getText());
            int y = Integer.parseInt(inputSecond.getText());
           message += GenerateNumber.randomGeneratorNumber(x,y);


            JOptionPane.showMessageDialog(null,
                    message,
                    "Result",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }
}