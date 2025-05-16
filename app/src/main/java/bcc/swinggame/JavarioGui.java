package bcc.swinggame;

import javax.swing.*;
import java.awt.*;

public class JavarioGui extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawPlayer(g, 175, 125, 25, 25);
    }

    public JavarioGui(){
        JFrame frame = new JFrame("Javario Beta");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
		frame.setSize(Constants.CANVAS_WIDTH, Constants.CANVAS_HEIGHT);
        frame.add(this);
		frame.setVisible(true);
    }

    public void drawPlayer(Graphics g, int xPos, int yPos, int width, int height) {
        g.setColor(Color.RED);
        g.fillRect(xPos, yPos, width, height);
    }
}