import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zralok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hrac extends Actor
{
    private String pohybHore;
    private String pohybVpravo;
    private String pohybDole;
    private String pohybVlavo;
    private String obrazokHore;
    private String obrazokVpravo;
    private String obrazokDole;
    private String obrazokVlavo;
    public Hrac(String pohybHore, String pohybVpravo, String pohybDole, String pohybVlavo,String obrazokHore, String obrazokVpravo, String obrazokDole, String obrazokVlavo ){
        this.pohybHore=pohybHore;
        this.pohybVpravo=pohybVpravo;
        this.pohybDole=pohybDole;
        this.pohybVlavo=pohybVlavo;
        this.obrazokHore=obrazokHore;
        this.obrazokVpravo=obrazokVpravo;
        this.obrazokDole=obrazokDole;
        this.obrazokVlavo=obrazokVlavo;
    }
    /**
     * Act - do whatever the Zralok wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.pohybujSaKlavesami();
        this.nastavObrazok();
    }
    private void pohybujSaKlavesami()
    {
        int x=this.getX();
        int y=this.getY();
        if(Greenfoot.isKeyDown(this.pohybVpravo)){
            setRotation(0);
            x=x+1;
        }
        if(Greenfoot.isKeyDown(this.pohybDole)){
            setRotation(90);
            y=y+1;
        }
        if(Greenfoot.isKeyDown(this.pohybVlavo)){
            setRotation(180);
            x=x-1;
        }
        if(Greenfoot.isKeyDown(this.pohybHore)){
            setRotation(270);
            y=y-1;
        }
        if(this.mozeVstupit(x,y)){
            this.setLocation(x,y);
        }
    }
    
    private boolean mozeVstupit(int x, int y){
        //otestuj, či je políčko bez kameňov!
        //ak áno, tak vráť hodnotu true
        //ak nie, tak vráť hodnotu false
        World luka=this.getWorld();
        if(x<0||y<0||x>=luka.getWidth()||y>=luka.getHeight()){
            return false;
        } else {
            return true;
        }
    }
    
    private void nastavObrazok(){
        switch(this.getRotation()){
            case 0: {
                    this.setImage(this.obrazokVpravo);
                    break;
                }
            case 90:{
                    this.setImage(this.obrazokDole);
                    break;
                }
            case 180:{
                    this.setImage(this.obrazokVlavo);
                    break;
                }
            case 270:{
                    this.setImage(this.obrazokHore);
                    break;
                }
        }
    }
}

