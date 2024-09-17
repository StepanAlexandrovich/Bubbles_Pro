package wrapper;

import core.Map;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    private Map map = new Map();
    
    private MyMouseListener myMouseListener = new MyMouseListener(map);
    private Panel panel = new Panel(map.matrix,myMouseListener);
    
    public MyFrame(){
        this.setVisible(true);
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        
        this.add(panel);
    }
    
    ///////////////////////////////////////
    public void cycle(){
        while(true){
            map.process();
            panel.repaint(); 
        }
    }
    
    public static void main(String[] args) {
        new MyFrame().cycle();
    }
    ////////////////////////////////////////
    
}
