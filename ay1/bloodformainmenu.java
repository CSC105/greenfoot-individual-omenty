import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bloodformainmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bloodformainmenu extends Actor
{
    /**
     * Act - do whatever the bloodformainmenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage bloodformainmenu = getImage();
        bloodformainmenu.scale(450, 250);
        setImage(bloodformainmenu);
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new open());
        }
        if(getX() == 700 && getY() == 750){
            bloodformainmenu.scale(250, 200);
            setImage(bloodformainmenu);
        }
    }    
}
