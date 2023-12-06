import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chaograma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chaograma extends Actor
{
    /**
     * Act - do whatever the chaograma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int speed = 1;
    public void act()
    {
        if(Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX(), this.getY() - speed);
    }
    if(Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
        if(Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX() - speed, this.getY());
    }
        if(Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() + speed, this.getY());
    }
    
    if(this.getX() >= 390 || this.getX() <= 10 || this.getY() >= 390 || this.getY() <= 10){
        
        this.setLocation(200, 200);
        
    }
    }
 
}
