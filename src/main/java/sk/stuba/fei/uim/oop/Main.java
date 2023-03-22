package sk.stuba.fei.uim.oop;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame okno = new JFrame("Moje prve okno");
        okno.setVisible(true);
        okno.setSize(400, 400);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.add(new MyCanvas());
    }
}
