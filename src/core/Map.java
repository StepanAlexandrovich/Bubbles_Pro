package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Map { 
    ////// static ///////  
    public Matrix matrix = new Matrix(125,125);
    private Generator generator = new Generator(matrix.points);
    private PainterBubbles painterBubbles = new PainterBubbles(this);
    ////// dynamic /////
    private int next;
    private int step;
    
    public int nextType() { return ++next; }
    
    public void setCoordinate(int x,int y) { painterBubbles.setCoordinate(x,y); }
    public void down()     { painterBubbles.down();     }
    public void downMove() { painterBubbles.downMove(); }
    public void up()       { painterBubbles.up();       }

    private void point(int x,int y,int value,int type){
        matrix.getPointCenter(x,y).setValue(value);
        matrix.getPointCenter(x,y).setType(type);
    }
    
    public void symmetry(int step){
        if(step==1){
            point(+10,+15,1000000,nextType());
            point(-10,-15,1000000,nextType());
            point(+15,-10,1000000,nextType());
            point(-15,+10,1000000,nextType());
        }
    }
    
    public void process() {
        step++;
        //symmetry(step);
        //System.out.println(Turn.test(matrix,"right"));
        
        painterBubbles.process();
        //////////////////////////
        generator.process();
        matrix.process();
    }
    
}
