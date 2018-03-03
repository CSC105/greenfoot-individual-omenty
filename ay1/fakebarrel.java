import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fakebarrel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fakebarrel extends barrel
{
    /**
     * Act - do whatever the fakebarrel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(flamingo.class)){
            getWorld().removeObject (this);
        }
    }    
}
