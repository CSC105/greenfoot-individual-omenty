import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cactusup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cactusup extends cactus
{
    private int yspeed = 5;
    private int y;
    private int x;
    public cactusup(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void act() 
    {
        if (getY() < 200){
            yspeed = 5;
        }
        if (getY() > 582){
            yspeed = -5;
        }
        y += yspeed;
        setLocation(x,y);
        if (isTouching(flamingo.class)){
            Greenfoot.setWorld(new Dead());
        }
    }    
}
