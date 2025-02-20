package core;

public class Generator {
    private Point[] points;
    //////////
    private int length = 2000;
    private int[] massOfType = new int[length];
    private int[] generation = new int[length];
    //private int[] toGeneration = new int[length];
    private int hCore = 100;
    
    public Generator(Point[] points){ this.points = points; }
    
    public void process(){
        for(int i = 0;i<length;i++){
            massOfType[i] = 0;
            generation[i] = 0;
        }

        for(Point point:points){
            if(point.getValue()>hCore){
                massOfType[point.getType()]+=1;
            }
        }

        for(int i = 0;i<length;i++){
            if(massOfType[i]!=0){
                generation[i] = 1000/massOfType[i];
            }
        }

        for(Point point:points){
            if(point.getValue()>hCore){
                point.setValue(point.getValue()+generation[point.getType()]);
            }
        }

    }
    
}
