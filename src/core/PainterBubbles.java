package core;

public class PainterBubbles extends Painter{
    public int value = 300,toGenerationValue=250,type;

    public PainterBubbles(Map map){ super(map); }
   
    @Override
    public void down(){
        activate = true;
        type = map.nextType();
    } 

    @Override
    public void downMove(){ 
        type = map.nextType(); 
    }
    
    @Override
    public void up(){ activate = false; }

    @Override
    public void process(){
        if(activate){
            point.setValue(value);
            point.setType(type); 
        }
    }
}
