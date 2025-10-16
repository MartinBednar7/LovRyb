import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class More extends World
{
    private Hrac hrac;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public More()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(12, 9, 100);
        this.hrac=new Hrac("w", "d", "s", "a","p1_hore.png", "p1_vpravo.png", "p1_dole.png", "p1_vlavo.png");
        this.addObject(this.hrac,1,1);
        this.pridajRybu();
    }
    public void pridajRybu(){
    this.pridajObjekt(new Ryba (10));
    }
    public void pridajObjekt(Actor objekt){
    int x=0;
    int y=0;
    x=0+Greenfoot.getRandomNumber(this.getWidth()-1);
    y=0+Greenfoot.getRandomNumber(this.getHeight()-1);
    this.addObject(objekt,x,y);
    }
}
