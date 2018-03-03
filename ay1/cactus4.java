import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cactus4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cactus4 extends cactus
{
    private int xspeed = 5;
    private int y;
    private int x;
    public cactus4(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void act() 
    {
        if (getX() < 130){
            xspeed = 5;
        }
        if (getX() > 600){
            xspeed = -5;
        }
        x += xspeed;
        setLocation(x,y);
        if (isTouching(flamingo.class)){
            Greenfoot.setWorld(new Dead());
        }
    }
}
