import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ryba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ryba extends Actor
{
    private int meskanie;
    private int pocitadloMeskania;
    public Ryba(){
        this.meskanie=5;
        this.pocitadloMeskania=0;
    }

    /**
     * Act - do whatever the Ryba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(this.meskanie==this.pocitadloMeskania){
            if (this.jeNaKraji()) {
                this.turn(180);
            }
            this.move(1);
            this.pocitadloMeskania=0;
        }else{
            this.pocitadloMeskania+=1;
        }
        switch(this.getRotation()){
            case 0:{
                    this.setImage("ryba.png");
                    break;
            }
            case 180:{
                    this.setImage("ryba_vlavo.png");
                    break;
            }
        }

    }

    public boolean jeNaKraji(){
        return this.getX() == this.getWorld().getWidth()-1 || this.getX() == 0;
    }
}
