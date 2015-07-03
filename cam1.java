import greenfoot.*;

/**
 * Write a description of class cam1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cam1 extends camel
{
    /**
     * Act - do whatever the cam1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    int dy = 0;
    int g = 1;
    int awalY = 439;
    
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY()+dy);
        if(("space").equals(Greenfoot.getKey())){
            
            dy = -30;
        }
        if(getY()>=awalY)
            setLocation(getX(), awalY);
        dy = dy+g;
        
    }    
}
