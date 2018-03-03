import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 850, 1);
        for (int i = 0; i <= 847; i+=20){
            addObject (new tree(), 0,i);
            addObject (new tree(), i,847);
            addObject (new tree(), 850,i);
            addObject (new tree(), i,0);
        }
        for (int i = 0; i <= 720; i+=20){
            addObject (new tree(), i,740);
        }
        for (int i = 100;i <= 300; i+=20){
            addObject (new tree(), i,640);
        }
        for (int i = 540; i <= 640; i+=20){
            addObject (new tree(), 100,i);
        }
        for (int i = 0; i <= 100; i+=20){
            addObject (new tree(), i,440);
        }
        for (int i = 140; i <= 340; i+=20){
            addObject (new tree(), 100,i);
        }
        for (int i = 100; i <= 700; i+=20){
            addObject (new tree(), i,120);
        }
        for (int i = 200; i <= 300; i+=20){
            addObject (new tree(), i,220);
        }
        for (int i = 120; i <= 220; i+=20){
            addObject (new tree(), 300,i);
        }
        for (int i = 220; i <= 540; i+=20){
            addObject (new tree(), 200,i);
        }
        for (int i = 640; i <= 850; i+=20){
            addObject (new tree(), i,220);
        }
        for (int i = 220; i <= 320; i+=20){
            addObject (new tree(), 540,i);
        }
        for (int i = 120; i <= 220; i+=20){
            addObject (new tree(), 420,i);
        }
        for (int i = 300; i <= 720; i+=20){
            addObject (new tree(), i,320);
            addObject (new tree(), i,540);
        }
        for (int i = 200; i <= 400; i+=20){
            addObject (new tree(), i,420);
        }
        for (int i = 500; i <= 850; i+=20){
            addObject (new tree(), i,420);
        }
        for (int i = 540; i <= 740; i+=20){
            addObject (new tree(), 400,i);
        }
        for (int i = 300; i <= 500; i+=20){
        }
        addObject (new cactus1(450,600), 450,600);
        addObject (new cactus2(790,690), 790,690);
        addObject (new cactus3(400,480), 400,480);
        addObject (new cactusup(150,200), 150,200);
        addObject (new cactus4(420,60), 420,60);
        addObject (new cactus5(780,370), 780,370);
        addObject (new flamingo(), 40, 800);
        addObject (new oasis(), 790,100);
        addObject (new fakebomb(), 520,60);
        addObject (new fakebarrel(), 540,640);
        addObject (new fakebarrel(), 300,700);
        addObject (new fakebarrel(), 50,700);
        addObject (new fakebarrel(), 250,170);
        addObject (new fakebarrel(), 360,170);
    }
}
