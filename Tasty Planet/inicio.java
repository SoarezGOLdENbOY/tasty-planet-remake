import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inicio extends World
{

    /**
     * Constructor for objects of class inicio.
     * 
     */
    public inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(569, 285, 1); 
    }
    
    
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
                historia historia = new historia();
            Greenfoot.setWorld(historia);
        }
    }
}
