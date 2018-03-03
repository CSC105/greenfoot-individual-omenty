import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class open here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class open extends World
{
    public open()
    {    
        super(850, 850, 1);
        GreenfootSound backgroundMusic = new GreenfootSound("MitchiriNeko March.mp3");
        addObject (new start(),390,740);
        addObject (new Linktohow(), 400,40);
        Greenfoot.start();
        backgroundMusic.playLoop();
    }
}
