package core;

public class Painter {
    public Map map;
    public Matrix matrix;
    public boolean activate;
    public Point point;
    
    public Painter(Map map){
        this.map = map;
        this.matrix = map.matrix;
    }
    
    public void setCoordinate(int x,int y) {
        point = matrix.getPoint(x,y);
    }
    
    public void down(){}
    public void downMove(){}
    public void up(){}
    
    public void process(){}
    
}
