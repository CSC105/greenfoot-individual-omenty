import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class oasis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oasis extends Actor
{
    /**
     * Act - do whatever the oasis wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getOneIntersectingObject(flamingo.class) != null){
        World world;
        world = getWorld();
        world.removeObject(this);
        Greenfoot.setWorld(new end());
       }
    }    
}
