import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cactus2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cactus2 extends cactus
{
    private int xspeed = 5;
    private int y;
    private int x;
    public cactus2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void act() 
    {
        if (getX() < 450){
            xspeed = 5;
        }
        if (getX() > 790){
            xspeed = -5;
        }
        x += xspeed;
        setLocation(x,y);
        if (isTouching(flamingo.class)){
            Greenfoot.setWorld(new Dead());
        }
    }   
}
