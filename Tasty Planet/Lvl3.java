import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Lvl3 extends World
{

        GreenfootSound soundtrack = new GreenfootSound("soundtrack.mp3");

    /**
     * Constructor for objects of class Lvl3.
     * 
     */
    public Lvl3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1, false); 
        prepare();

    }
    
    private void prepare()
    {
        chao chao = new chao();
        addObject(chao,350,350
        );
        chao.setLocation(350,350);
        gosma3 gosma3 = new gosma3();
        addObject(gosma3,350,350);
        Counter counter = new Counter();
        addObject(counter,51,670);
    }
    
    public void act(){
            
        int x = Greenfoot.getRandomNumber(700);
        int y = Greenfoot.getRandomNumber(700);

        if(getObjects(joaninha.class).size() < 5){ 

        addObject(new joaninha(), x, y);
        }
        
                if(getObjects(grilo.class).size() < 3){ 

        addObject(new grilo(), x, y);
        }
        
        if(getObjects(aranha.class).size() < 2){ 

        addObject(new aranha(), x, y);
        }
    }
}
