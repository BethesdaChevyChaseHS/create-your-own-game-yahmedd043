package bcc.swinggame;

import javax.swing.*;
import java.awt.*;

public class JavarioGui extends JPanel{
    public JavarioGui(){
        JFrame frame = new JFrame("Javario Beta");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
		frame.setSize(Constants.CANVAS_WIDTH, Constants.CANVAS_HEIGHT);
        frame.setBackground(Color.BLACK);
        frame.add(this);
		frame.setVisible(true);
    }
}