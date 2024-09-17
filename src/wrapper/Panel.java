package wrapper;

import core.Matrix;
import core.Point;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class Panel extends JPanel {
    // static
    private Matrix matrix;
    // dynamic
    public static int mult = 4,bright = 2;
    
    public Panel(Matrix matrix,MyMouseListener listener){ 
        this.matrix = matrix;
        this.setSize(matrix.width*mult,matrix.height*mult); 
        //////////
        this.addMouseListener((MouseListener)listener);
        this.addMouseMotionListener((MouseMotionListener)listener);
    }
    
    private int border(int value){
        if(value<-255) { value = -255; }
        if(value>+255) { value = +255; }
        return value;
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        ///////////////////
        for(Point point:matrix.points){
            ////////////////////////////DRAWNING///////////////////////////////////
            int value = border(point.getValue()*bright);
            // материя
            if(value >0)  { g.setColor(new Color(  +000,+value,+value)); } else
            // вакуум    
            if(value==0)  { g.setColor(new Color(000,000,255)); }
                  
            ///////////////
            g.fillRect(point.x*mult,point.y*mult, mult, mult);
            ///////////////////////////////////////////////////////////////////////
        }  
    }
    
}
