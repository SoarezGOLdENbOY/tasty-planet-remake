import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aranhaenemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aranhaenemy extends Actor
{
    /**
     * Act - do whatever the aranhaenemy wants to do. This method is called whenever
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
        
        if (getWorld().getObjects(gosma1.class).isEmpty()){
        move(1);
        Actor gosma2 = (Actor)getWorld().getObjects(gosma2.class).get(0); 
        turnTowards(gosma2.getX(), gosma2.getY()); 
        }
        else{
        move(1);
        Actor gosma1 = (Actor)getWorld().getObjects(gosma1.class).get(0); 
        turnTowards(gosma1.getX(), gosma1.getY()); 
    }
    
            if(isTouching(joaninha.class)){
         removeTouching(joaninha.class);  
        }
                    if(isTouching(grilo.class)){
         removeTouching(grilo.class);  
        }
                    if(isTouching(gosma1.class)){
            derrota derrota = new derrota();
            Greenfoot.setWorld(derrota);
        }
                    if(isTouching(gosma2.class)){
          derrota derrota = new derrota();
            Greenfoot.setWorld(derrota);
        }
    }
}
