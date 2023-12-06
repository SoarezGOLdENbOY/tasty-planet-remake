import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class joaninha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class joaninha extends Actor
{
    /**
     * Act - do whatever the joaninha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */         public int speed = 2;

    
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
            ifAtWorldEdge();

    }
    public void ifAtWorldEdge()
    {
        if(this.getX() <= -100 || this.getX() >= 800 || this.getY() <= -100 || this.getY() >= 800)
        {
             getWorld().removeObject(this);
        }
    }
    }

