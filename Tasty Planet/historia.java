import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class historia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class historia extends World
{

    /**
     * Constructor for objects of class historia.
     * 
     */
    public int tempo = 0;
    public historia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(373, 275, 1); 
    }
    
        public void act(){
            tempo++;
            
        if(Greenfoot.isKeyDown("enter") && tempo > 10){
                MyWorld MyWorld = new MyWorld();
            Greenfoot.setWorld(MyWorld);
        }
    }
}
