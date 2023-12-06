import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2 extends World
{

    /**
     * Constructor for objects of class Lvl2.
     * 
     */
    public Lvl2()
    {    
        
           
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1, false); 
        prepare();

    
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
        GreenfootSound soundtrack = new GreenfootSound("soundtrack.mp3");

    private void prepare()
    {
        chao chao = new chao();
        addObject(chao,200,200);
        chao.setLocation(220,200);
        gosma2 gosma2 = new gosma2();
        addObject(gosma2,250,250);
        aranhaenemy aranhaenemy = new aranhaenemy();
        addObject(aranhaenemy, 0, 0);
        Counter counter = new Counter();
        addObject(counter,51,470);

        chao.setLocation(54,476);
        chao.setLocation(78,455);
        chao.setLocation(87,438);
        chao.setLocation(75,470);
    }
    
    public void act(){
            
        int x = Greenfoot.getRandomNumber(400);
        int y = Greenfoot.getRandomNumber(400);

        if(getObjects(joaninha.class).size() < 6){ 

        addObject(new joaninha(), x, y);
        }
        
        if(getObjects(grilo.class).size() < 4){ 

        addObject(new grilo(), x, y);
        }
        

    }
}
