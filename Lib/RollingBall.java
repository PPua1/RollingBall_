package Lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RollingBall extends JPanel {

    
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.black);
            g.drawOval(80, 80, 80, 80);
            g.fillArc(80, 80, 80, 80, 0, 180);
        }
    }

    


