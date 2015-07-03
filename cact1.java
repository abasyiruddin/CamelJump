import greenfoot.*;

/**
 * Write a description of class cact1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cact1 extends cactus
{
    /**
     * Act - do whatever the cact1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    int cepat;
    
    public void act() 
    {
        // Add your action code here.       
        gerak(-1);
        move(cepat);
        
        if(isAtEdge())
            getWorld().removeObject(this);
        else if(isTouching(camel.class))
            getWorld().removeObject(this);
    }    
    
    public void gerak(int grk){
        cepat=grk;
    }
}
