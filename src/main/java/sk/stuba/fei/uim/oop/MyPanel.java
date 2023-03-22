package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        g.fillRect(150,150,100,100);
        g.setColor(Color.RED);
        g.fillPolygon(new int[] {150 , 200 , 250},new int[] {150, 100, 150},3);
        g.setColor(Color.CYAN);
        for ( int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                g.fillRect(160 + 45 * x, 160 + 45 * y, 40, 40);
            }
        }
    }
}
