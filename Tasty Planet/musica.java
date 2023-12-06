import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musica extends World
{
    GreenfootSound soundtrack = new GreenfootSound("soundtrack.mp3");
    /**
     * Constructor for objects of class musica.
     * 
     */
    public musica()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        soundtrack.playLoop();
        inicio inicio = new inicio();
            Greenfoot.setWorld(inicio);
    }
}
