import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class barrel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class barrel extends Actor
{
    /**
     * Act - do whatever the barrel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(flamingo.class)){
            getWorld().removeObject (this);
        }
    }    
}
