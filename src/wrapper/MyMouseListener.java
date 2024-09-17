package wrapper;

import core.Map;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyMouseListener implements MouseMotionListener,MouseListener{
    private Map map;
    private int x,y;

    public MyMouseListener(Map map){       
        this.map = map;
    }

    @Override
    public void mousePressed(MouseEvent evt) {
        map.setCoordinate(evt.getX()/Panel.mult,evt.getY()/Panel.mult);
        map.down();
    }
    
    @Override
    public void mouseDragged(MouseEvent evt) { 
        map.setCoordinate(evt.getX()/Panel.mult,evt.getY()/Panel.mult); 
        map.downMove();
    }

    @Override
    public void mouseReleased(MouseEvent evt) {
        map.setCoordinate(evt.getX()/Panel.mult,evt.getY()/Panel.mult);
        map.up();
    }

    @Override
    public void mouseMoved(MouseEvent evt) {}
    
    @Override
    public void mouseClicked(MouseEvent arg0) {}
    
    @Override
    public void mouseEntered(MouseEvent arg0) {}

    @Override
    public void mouseExited(MouseEvent arg0) {}

}
