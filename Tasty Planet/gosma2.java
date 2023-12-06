import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gosma2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gosma2 extends Actor
{
 GifImage myGif = new GifImage("gosma2.gif");
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
        
        
        if(pontos >= 300){
            Lvl3 Lvl3 = new Lvl3();
            Greenfoot.setWorld(Lvl3);
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
        
               if(isTouching(grilo.class)){
         removeTouching(grilo.class);  
         pontos+= 10;
         comendo.play();
                Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(10);
        }
    }
    

}

