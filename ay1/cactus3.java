import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cactus3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cactus3 extends cactus
{
    private int xspeed = 6;
    private int y;
    private int x;
    public cactus3(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void act() 
    {
        if (getX() < 280){
            xspeed = 6;
        }
        if (getX() > 790){
            xspeed = -6;
        }
        x += xspeed;
        setLocation(x,y);
        if (isTouching(flamingo.class)){
            Greenfoot.setWorld(new Dead());
        }
    }    
}
