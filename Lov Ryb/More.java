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
    this.pridajObjekt(new Ryba ());
    }
    public void pridajObjekt(Actor objekt){
    int x=0;
    int y=0;
    x=1+Greenfoot.getRandomNumber(this.getWidth()-2);
    y=1+Greenfoot.getRandomNumber(this.getHeight()-2);
    this.addObject(objekt,x,y);
    }
}
