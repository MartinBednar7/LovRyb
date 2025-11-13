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
    private int casNaDalsiuRybu;
    private int pocitadloVytvoreniaRyby;
    private PocitadloBodov pocitadlo;
    private PocitadloBodov zobrazovacCasu;
    private int maxCas;
    private SimpleTimer casovac;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public More()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(12, 9, 100);
        this.hrac = new Hrac();
        this.addObject(this.hrac, 7, 4);
        this.vytvorRybu();
        this.casNaDalsiuRybu = 200;
        this.pocitadloVytvoreniaRyby = 0;
        this.addObject(new Ryba(10, 200, false), Greenfoot.getRandomNumber(this.getWidth()), Greenfoot.getRandomNumber(this.getHeight()));
        this.pocitadlo=new PocitadloBodov();
        this.addObject(this.pocitadlo, 3, 0);
        this.hrac.pridajPocitadlo(this.pocitadlo);
        this.zobrazovacCasu=new PocitadloBodov();
        this.zobrazovacCasu.setPrefix("Cas: ");
        this.maxCas=20;
        this.addObject(this.zobrazovacCasu,this.getWidth()/2,0);
        this.casovac=new SimpleTimer();
        this.casovac.mark();
        
    }

    public void act() {
        if (this.casNaDalsiuRybu == this.pocitadloVytvoreniaRyby) {
            this.vytvorRybu();
            this.casNaDalsiuRybu = 100 + Greenfoot.getRandomNumber(300);
            this.pocitadloVytvoreniaRyby = 0;
        } else {
            this.pocitadloVytvoreniaRyby++;
        }
        
        if(this.casovac.millisElapsed()/1000>=this.maxCas){
            Greenfoot.stop();
        }
        this.zobrazovacCasu.setValue(this.casovac.millisElapsed()/1000);
    }

    private void vytvorRybu() {
        this.addObject(new Ryba(15, 150 + Greenfoot.getRandomNumber(200), Greenfoot.getRandomNumber(2) == 0), Greenfoot.getRandomNumber(this.getHeight()), Greenfoot.getRandomNumber(this.getHeight()));
    }

    public void rybaZjedena(Ryba ryba) {
        this.hrac.pridajBody(ryba.dajBody());
        this.removeObject(ryba);
    }
    
    
}
