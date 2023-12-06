import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1, false); 
        prepare();
        

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        chao chao = new chao();
        addObject(chao,200,200
        );
        chao.setLocation(220,200);
        gosma1 gosma1 = new gosma1();
        addObject(gosma1,192,204);
        chao.setLocation(51,376);
        Counter counter = new Counter();
        addObject(counter,51,376);
        chao.setLocation(159,145);
    }
    
    public void act(){
            
        int x = Greenfoot.getRandomNumber(400);
        int y = Greenfoot.getRandomNumber(400);

        if(getObjects(joaninha.class).size() < 6){ 

        addObject(new joaninha(), x, y);
        }
        
        if(getObjects(aranhaenemy.class).size() < 1){ 

        addObject(new aranhaenemy(), 0, 0);
        }
    }
    }

