import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aranha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aranha extends Actor
{
    /**
     * Act - do whatever the aranha wants to do. This method is called whenever
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

            
        move(-1);
        Actor gosma3 = (Actor)getWorld().getObjects(gosma3.class).get(0); 
        turnTowards(gosma3.getX(), gosma3.getY()); 
        
        ifAtWorldEdge();

            
    }
    public void ifAtWorldEdge()
    {
        if(this.getX() <= -150 || this.getX() >= 850 || this.getY() <= -150 || this.getY() >= 850)
        {
             getWorld().removeObject(this);
        }
    }
}
