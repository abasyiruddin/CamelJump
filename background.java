import greenfoot.*;

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{

    /**
     * Constructor for objects of class background.
     * 
     */

    int timeSpawn=0;
    int timeSpawn2=0;

    
    public void act() {
        timeSpawn++;
        if(timeSpawn>=Greenfoot.getRandomNumber(400)+300){
            timeSpawn=0;
            createCactus();
        }
        timeSpawn2++;
        if(timeSpawn2>=Greenfoot.getRandomNumber(200)+300){
            timeSpawn2=0;
            createRock();
        }
    }

    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 490, 1); 
        createCamel();        
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

    private void createCamel(){
        cam1 cam1 = new cam1();
        addObject(cam1, 99, 439);

    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

   
    private void createCactus()
    {
        cact1 cact1 = new cact1();
        addObject(cact1, 700, 445);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void createRock()
    {
        rock rock = new rock();
        addObject(rock, 700, 458);
    }
}
