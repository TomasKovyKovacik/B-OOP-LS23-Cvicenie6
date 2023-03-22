package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame okno = new JFrame("Moje prve okno");

        okno.setSize(400, 400);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLayout(new GridLayout(3, 2));

        JButton button = new JButton("Klikni");
        button.addActionListener(e -> System.out.println(e.getActionCommand()));
        okno.add(button);

        JButton button2 = new JButton("Klikni Panel");
        button2.addActionListener(new MyPanel());
        okno.add(button2);

        okno.setVisible(true);
    }
}
