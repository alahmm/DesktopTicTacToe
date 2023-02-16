package tictactoe;

import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {
    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(450, 450);
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        //setLayout(null); // sets absolute positioning of components
    }
    public void initComponents() {

        JPanel panel = new JPanel(new GridLayout(3, 3));
        add(panel);
        for (int i = 3; i > 0 ; i--) {
            for (char c : new char[]{'A','B','C'}
                 ) {
                var button = new JButton(c + "" + i);
                button.setName("Button" + c + i);
                button.setFont(button. getFont(). deriveFont(40f));
                button.setBackground(Color.MAGENTA);
                panel.add(button);
            }
        }
/*        *//**
         * first Button
         *//*
        JButton ButtonA3 = new JButton("A3");
        ButtonA3.setFont(ButtonA3. getFont(). deriveFont(40f));
        ButtonA3.setName("ButtonA3");
        ButtonA3.setBackground(Color.MAGENTA);
        panel.add(ButtonA3);

        *//**
         * first Button
         *//*
        JButton ButtonB3 = new JButton("B3");
        ButtonB3.setFont(ButtonB3. getFont(). deriveFont(40f));
        ButtonB3.setName("ButtonB3");
        ButtonB3.setBackground(Color.MAGENTA);
        panel.add(ButtonB3);

        *//**
         * first Button
         *//*
        JButton ButtonC3 = new JButton("C3");
        ButtonC3.setFont(ButtonC3. getFont(). deriveFont(40f));
        ButtonC3.setName("ButtonC3");
        ButtonC3.setBackground(Color.MAGENTA);
        panel.add(ButtonC3);

        *//**
         * first Button
         *//*
        JButton ButtonA2 = new JButton("A2");
        ButtonA2.setFont(ButtonA2. getFont(). deriveFont(40f));
        ButtonA2.setName("ButtonA2");
        ButtonA2.setBackground(Color.MAGENTA);
        panel.add(ButtonA2);

        *//**
         * first Button
         *//*
        JButton ButtonB2 = new JButton("B2");
        ButtonB2.setFont(ButtonB2. getFont(). deriveFont(40f));
        ButtonB2.setName("ButtonB3");
        ButtonB2.setBackground(Color.MAGENTA);
        panel.add(ButtonB2);

        *//**
         * first Button
         *//*
        JButton ButtonC2 = new JButton("C2");
        ButtonC2.setFont(ButtonC2. getFont(). deriveFont(40f));
        ButtonC2.setName("ButtonC2");
        ButtonC2.setBackground(Color.MAGENTA);
        panel.add(ButtonC2);

        *//**
         * first Button
         *//*
        JButton ButtonA1 = new JButton("A1");
        ButtonA1.setFont(ButtonA1. getFont(). deriveFont(40f));
        ButtonA1.setName("ButtonA1");
        ButtonA1.setBackground(Color.MAGENTA);
        panel.add(ButtonA1);

        *//**
         * first Button
         *//*
        JButton ButtonB1 = new JButton("B1");
        ButtonB1.setFont(ButtonB1. getFont(). deriveFont(40f));
        ButtonB1.setName("ButtonB1");
        ButtonB1.setBackground(Color.MAGENTA);
        panel.add(ButtonB1);

        *//**
         * first Button
         *//*
        JButton ButtonC1 = new JButton("C1");
        ButtonC1.setFont(ButtonC1. getFont(). deriveFont(40f));
        ButtonC1.setName("ButtonC1");
        ButtonC1.setBackground(Color.MAGENTA);
        panel.add(ButtonC1);*/


    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}