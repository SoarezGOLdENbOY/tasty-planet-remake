import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vitoria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vitoria extends World
{

    /**
     * Constructor for objects of class vitoria.
     * 
     */
    public vitoria()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(571, 381, 1); 
    }
    
        public void act(){
        if(Greenfoot.isKeyDown("enter")){
                inicio inicio = new inicio();
            Greenfoot.setWorld(inicio);
        }
    }
}
