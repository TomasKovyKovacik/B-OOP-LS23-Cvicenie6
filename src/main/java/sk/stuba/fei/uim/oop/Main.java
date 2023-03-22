package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame okno = new JFrame("Moje prve okno");
        okno.setVisible(true);
        okno.setSize(300, 300);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLayout(new GridLayout(2, 3));
        JLabel label = new JLabel("Hello world");
        okno.add(label);
        okno.getContentPane().setBackground(Color.YELLOW);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(190,120,150));
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("TOP"), BorderLayout.PAGE_START);
        panel.add(new JLabel("BOTTOM"), BorderLayout.PAGE_END);
        panel.add(new JLabel("LEFT"), BorderLayout.LINE_START);
        panel.add(new JLabel("RIGHT"), BorderLayout.LINE_END);
        panel.add(new JLabel("CENTER", SwingConstants.CENTER), BorderLayout.CENTER);


        for (int i = 0; i < 5; i++ ) {
            if (i == 3) {
                okno.add(panel);
            } else {
                okno.add(new JLabel("Text " + i));
            }
        }
    }
}
