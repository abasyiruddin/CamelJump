import greenfoot.*;

/**
 * Write a description of class rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rock extends Actor
{
    /**
     * Act - do whatever the rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-1);
        if(isAtEdge())
            getWorld().removeObject(this);
        else if(isTouching(camel.class))
            getWorld().removeObject(this);
    }    
}
