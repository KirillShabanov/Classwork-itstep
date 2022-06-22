import javax.swing.*;
import java.awt.*;

public class GraficFractal {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("пример Брестского ковра");
        frame.setSize(530,530);
        frame.setLocation(300,3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrowCanvas canvas = new DrowCanvas();
        frame.getContentPane().add(canvas);
        frame.setVisible(true);

    }
}
class DrowCanvas extends Canvas{

    private void draw (Graphics graphics, int xc, int yc, int radius){
        if (radius < 5) return;
        else {
            graphics.drawOval(xc - radius,yc - radius, radius * 2, radius * 2);
            draw(graphics, xc - radius, yc, radius / 2);
            draw(graphics, xc + radius, yc, radius / 2);
            draw(graphics, xc, yc - radius, radius / 2);
            draw(graphics, xc , yc + radius, radius / 2);
        }
    }

    public void paint(Graphics graphics){
    graphics.drawLine(0,250,500,250);
    int radius = 125;
    int xc = 250, yc =250;
    graphics.setColor(Color.magenta);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(3));
    draw(graphics,xc,yc,radius);
}
}
