import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chao extends Actor
{
    /**
     * Act - do whatever the chao wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed = 2;
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
    
    if(this.getX() >= 1000 || this.getX() <= -300 || this.getY() >= 1000 || this.getY() <= -300){
        
        this.setLocation(200, 200);
        
    }
    }
 
}
