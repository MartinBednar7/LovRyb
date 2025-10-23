import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zralok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hrac extends Actor
{
    private int body;
    private int oneskorenie;
    private int casovacOneskorenia;
    public Hrac(){
        this.body = 0;
        this.oneskorenie = 3;
        this.casovacOneskorenia = 0;
    }

    /**
     * Act - do whatever the Zralok wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (this.casovacOneskorenia == this.oneskorenie) {
            this.hybSa();
            this.zmenObrazok();
            this.casovacOneskorenia = 0;
        } else {
            this.casovacOneskorenia++;
        }
    }

    private void hybSa() {
        if (Greenfoot.isKeyDown("w")) {
            this.setRotation(270);
            this.move(1);
        } else if (Greenfoot.isKeyDown("s")) {
            this.setRotation(90);
            this.move(1);
        } else if (Greenfoot.isKeyDown("a")) {
            this.setRotation(180);
            this.move(1);
        } else if (Greenfoot.isKeyDown("d")) {
            this.setRotation(0);
            this.move(1);
        }
    }

    private void zmenObrazok() {
        switch (this.getRotation()) {
            case 0: case 90: case 270: {
                    this.setImage("p1_vpravo.png");
                    break;
                }
            case 180: {
                    this.setImage("p1_vlavo.png");
                    break;
                }
        }
    }
    
    public void pridajBody(int body) {
        this.body += body;
    }
}

