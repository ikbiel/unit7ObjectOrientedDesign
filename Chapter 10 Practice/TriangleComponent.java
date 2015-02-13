import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.event.MouseListener;
import java.awt.event;

public class TriangleComponent extends JComponent implements MouseListener
{
    private int x;
    private int y;
    private int clicked;
    
    public TriangleComponent()
    {
        this.x = x;
        this.y = y;
        this.clicked = 0;
    }
    
    class MouseClickListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            x = event.getX();
            y = event.getY();
            clicked++;
            repaint();
            
        }
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        
        
        
        
        
        if(clicked == 1)
        {
            Point2D.Double startingPoint = new Point2D.Double(x, y);
            g.draw(startingPoint);
        }
        else if(clicked == 2)
        {
            Point2D.Double middlePoint = new Point2D.Double(x, y);
            Line2D.Double firstLine = new Line2D.Double(startingPoint, middlePoint);
            g.draw(startingPoint);
            g.draw(middlePoint);
            g.draw(firstLine);
        }
        else if(clicked == 3)
        {
            Point2D.Double finalPoint = new Point2D.Double(x, y);
            Line2D.Double finalLine = new Line2D.Double(middlePoint, finalPoint);
            g.draw(startingPoint);
            g.draw(middlePoint);
            g.draw(firstLine);
            g2.draw(finalPoint);
            g2.draw(finalLine);
        }
        else
        {
            //erase triangle
            g2.draw(startingPoint);
            clicked = 1;
        }
    }
    
    public static void main(String[] args)
    {
        MouseClickListener listener = new MouseClickListener();
        
    }
}

