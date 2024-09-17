package core;

public class Turn {
    public static int x,y;
    
    public static void right(int xOut,int yOut,int side){
        x = side - yOut - 1;
        y = xOut;
    }

    public static void left(int xOut,int yOut,int side){
        y = side - xOut - 1;
        x = yOut;
    }  
    
    public static void uTurn(int xOut,int yOut,int side){
        y = side - yOut - 1;
        x = side - xOut - 1;
    }
    
    public static Point turn(Point point,Matrix matrix,String s){
        Point p = matrix.points[0];
        if(s.equals("right")){ right(point.x,point.y,matrix.width); }
        if(s.equals("left" )){ left (point.x,point.y,matrix.width); }
        if(s.equals("uTurn")){ uTurn(point.x,point.y,matrix.width); }
        for(int i = 0;i<Turn.x;i++){ p = p.points[1]; }
        for(int i = 0;i<Turn.y;i++){ p = p.points[2]; }
        return p;
    }
    
    public static boolean test(Matrix matrix,String s){
        for(Point point: matrix.points){
            if(!( point.getValue() == turn(point,matrix,s).getValue() ) ){ return false; }
        }
        return true;
    }
    
}
