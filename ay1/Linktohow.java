import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Linktohow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Linktohow extends Actor
{
    /**
     * Act - do whatever the Linktohow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage Linktohow = getImage();
        Linktohow.scale(200, 100);
        setImage(Linktohow);
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new How());
        }
    }
}
