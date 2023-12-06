import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gosma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gosma1 extends Actor
{
        
        GifImage myGif = new GifImage("gosma1.gif");
        public int joaninhaCounter = 0;
        public int pontos = 0;
        GreenfootSound comendo = new GreenfootSound("comendo.mp3");
        

            

    /**
     * Act - do whatever the gosma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act()
    {
        setImage(myGif.getCurrentImage());
        tocando();
        
        if(pontos == 20){
            Lvl2 Lvl2 = new Lvl2();
            Greenfoot.setWorld(Lvl2);
        }
    }
    
    public void tocando(){
        if(isTouching(joaninha.class)){
         removeTouching(joaninha.class);  
         pontos++;
         comendo.play();
         Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
        }
    }
    

}

