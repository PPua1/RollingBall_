package Lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RollingBall extends JPanel implements ActionListener {
    int x = 80;
    int start_Angle = 0;
    int End_Angle = 180;
    public RollingBall(){
        Timer t = new Timer(40, this);
        t.start();
    }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.black);
            g.drawOval(x, 80, 80, 80);
            g.fillArc(x, 80, 80, 80, start_Angle, End_Angle);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            x += 5;
            start_Angle -= 2;
            repaint();

            if (x > getWidth()){
                x = 0;
                repaint();
            }
            
        }
}

    


