package sk.stuba.fei.uim.oop;

import java.awt.*;

public class MyCanvas extends Canvas {

    private boolean imageWasDrawn;
    @Override
    public void paint(Graphics g) {
        if (!imageWasDrawn) {
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
            imageWasDrawn = true;
        }
    }
}
