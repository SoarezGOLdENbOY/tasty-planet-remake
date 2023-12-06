import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class derrota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class derrota extends World
{

    /**
     * Constructor for objects of class derrota.
     * 
     */
    public derrota()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(277, 278, 1); 
        
    }
    
    public void act(){
    
        if(Greenfoot.isKeyDown("enter")){
                historia historia = new historia();
            Greenfoot.setWorld(historia);
        
    }
    }
}
