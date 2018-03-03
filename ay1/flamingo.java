import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class flamingo extends Actor
{
    private int img;
    private int direction;
    GreenfootImage[] rightImage = new GreenfootImage[36];
    GreenfootImage[] leftImage = new GreenfootImage[36];
    public flamingo()   
    {
        
        GreenfootImage myImage = getImage();
        

        for(int i=0 ; i<36 ; i++){
            rightImage[i] = new GreenfootImage("Flamingo/Flamingo"+(i+1)+".png");
            leftImage[i] = new GreenfootImage("Flamingo/Flamingo"+(i+1)+".png");
            leftImage[i].scale(50,50);
            rightImage[i].scale(50,50);
            leftImage[i].mirrorHorizontally();
        }
        setImage(rightImage[0]);
    }
    private int speed = 2;
    public void act() {
        for (int i = 0; i <= 850; i++){// เส้นขอบ
        if (getX() == i && getY() == 810){
            setLocation (getX(),getY()-10);
        }
        if (getX() == 30 && getY() == i){
            setLocation (getX()+10,getY());
        }
        if (getX() == 810 && getY() == i){
            setLocation (getX()-10,getY());
        }
        if (getX() == i && getY() == 30){
            setLocation (getX(),getY()+10);
        }
    }
    for (int i = 0; i <= 740; i++){// เส้นล่างสุด
        if (getX() == i && getY() == 760){
            setLocation (getX(),getY()+10);
        }
        if (getX() == i && getY() == 710){
            setLocation (getX(),getY()-10);
        }
    }
    for (int i = 700; i <= 760; i++){
        if (getX() == 740 && getY() == i){
            setLocation (getX()+10,getY());
        }
    }
    for (int i = 70; i <= 330; i++){// เส้นใกล้จากล่างสุด
        if (getX() == i && getY() == 660){
            setLocation (getX(),getY()+10);
        }
        if (getX() == i && getY() == 600){
            setLocation (getX(),getY()-10);
        }
    }
    for (int i = 600; i <= 660; i++){
        if (getX() == 330 && getY() == i){
            setLocation (getX()+10,getY());
        }
    }
    for (int i = 500;i <= 660; i++){// เส้นตั้งของของเส้นใกล้ล่างสุด
        if (getX() == 70 && getY() == i){
            setLocation (getX()-10,getY());
        }
        if (getX() == 130 && getY() == i){
            setLocation (getX()+10,getY());
        }
    }
    for (int i = 70; i <= 130; i++){
        if (getX() == i && getY() == 500){
            setLocation (getX(),getY()-10);
        }
    }
    for (int i = 540; i <= 740; i++){// เส้นตั้งจากล่างสุด
        if (getX() == 370 && getY() == i){
            setLocation (getX()-10,getY());
        }
        if (getX() == 430 && getY() == i){
            setLocation (getX()+10,getY());
        }
    }
    for (int i = 270; i <= 740; i++){// เส้นบนหัวกระบองเพรชตัวที่สองจากล่างสุด
        if (getX() == i && getY() == 510){
            setLocation (getX(),getY()-10);
        }
        if (getX() == i && getY() == 560){
            setLocation (getX(),getY()+10);
        }
    }
    for (int i = 510; i <= 560; i++){
        if (getX() == 740 && getY() == i){
            setLocation (getX()+10,getY());
        }
        if (getX() == 270 && getY() == i){
            setLocation (getX()-10,getY());
        }
    }
    for (int i = 180; i <= 560; i++){// เส้นเหนือใกล้กรพบองเพรชตัวทางซ้ายจากด้านขวา
        if (getX() == 230 && getY() == i){
            setLocation (getX()+10,getY());
        }
        if (getX() == 170 && getY() == i){
            setLocation (getX()-10,getY());
        }
    }
    for (int i = 170; i <= 230; i++){
        if (getX() == i && getY() == 180){
            setLocation (getX(),getY()-10);
        }
        if (getX() == i && getY() == 560){
            setLocation (getX(),getY()+10);
        }
    }
    for (int i = 0; i <= 120; i++){// ตรงด้านข้างขวาของกระบองเพรชตัวขึ้นลง
        if (getX() == i && getY() == 400){
            setLocation (getX(),getY()-10);
        }
        if (getX() == i && getY() == 460){
            setLocation (getX(),getY()+10);
        }
    }
    for (int i = 400; i <= 460; i++){
        if (getX() == 120 && getY() == i){
            setLocation (getX()+10,getY());
        }
    }
    for (int i = 90; i <= 360; i++){// ตั้งด้านซ้ายบน
        if (getX() == 70 && getY() == i){
            setLocation (getX()-10,getY());
        }
        if (getX() == 130 && getY() == i){
            setLocation (getX()+10,getY());
        }
    }
    for (int i = 70; i <= 130; i++){
        if (getX() == i && getY() == 90){
            setLocation (getX(),getY()-10);
        }
        if (getX() == i && getY() == 360){
            setLocation (getX(),getY()+10);
        }
    }
    for (int i = 70; i <= 720; i++){// เส้นบนสุด
        if (getX() == i && getY() == 90){
            setLocation (getX(),getY()-10);
        }
        if (getX() == i && getY() == 140){
            setLocation (getX(),getY()+10);
        }
    }
    for (int i = 90;i <= 140; i++){
        if (getX() == 720 && getY() == i){
            setLocation (getX()+10,getY());
        }
    }
    for (int i = 180; i <= 320; i++){// ตรงหัวมุมเล็กๆใกล้กระบองเพรชขึ้นลง
        if (getX() == i && getY() == 180){
            setLocation (getX(),getY()-10);
        }
        if (getX() == i && getY() == 240){
            setLocation (getX(),getY()+10);
        }
    }
    for (int i = 90; i <= 240; i++){// อันนี้แนวตั้ง
        if (getX() == 330 && getY() == i){
            setLocation (getX()+10,getY());
        }
        if (getX() == 270 && getY() == i){
            setLocation (getX()-10,getY());
        }
    }
    for (int i = 90; i <= 240; i++){// อันนี้เส้นทีตั้ง่ขนานกับมุมเมื่อกี้
        if (getX() == 390 && getY() == i){
            setLocation (getX()-10,getY());
        }
        if (getX() == 450 && getY() == i){
            setLocation (getX()+10,getY());
        }
    }
    for (int i = 400; i <= 440; i++){
        if (getX() == i && getY() == 240){
            setLocation (getX(),getY()+10);
        }
    }
    for (int i = 620; i <= 850; i++){
        if (getX() == i && getY() == 180){
            setLocation (getX(),getY()-10);
        }
        if (getX() == i && getY() == 240){
            setLocation (getX(),getY()+10);
        }
    }
    for (int i = 180; i <= 240; i++){
        if (getX() == 620 && getY() == i){
            setLocation (getX()-10,getY());
        }
    }
    for (int i = 180; i <= 340; i++){
        if (getX() == 510 && getY() == i){
            setLocation (getX()-10,getY());
        }
        if (getX() == 570 && getY() == i){
            setLocation (getX()+10,getY());
        }
    }for (int i = 510; i <= 570; i++){
        if (getX() == i && getY() == 180){
            setLocation (getX(),getY()-10);
        }
    }
    for (int i = 280; i <= 740; i++){
        if (getX() == i && getY() == 290){
            setLocation (getX(),getY()-10);
        }
        if (getX() == i && getY() == 340){
            setLocation (getX(),getY()+10);
        }
    }
    for (int i = 290; i <= 340; i++){
        if (getX() == 280 && getY() == i){
            setLocation (getX()-10,getY());
        }
        if (getX() == 740 && getY() == i){
            setLocation (getX()+10,getY());
        }
    }
    for (int i = 220; i <= 430; i++){
        if (getX() == i && getY() == 440){
            setLocation (getX(),getY()+10);
        }
        if (getX() == i && getY() == 390){
            setLocation (getX(),getY()-10);
        }
    }
    for (int i = 390; i <= 440; i++){
        if (getX() == 430 && getY() == i){
            setLocation (getX()+10,getY());
        }
    }
    for (int i = 480; i <= 850; i++){
        if (getX() == i && getY() == 390){
            setLocation (getX(),getY()-10);
        }
        if (getX() == i && getY() == 440){
            setLocation (getX(),getY()+10);
        }
    }
    for (int i = 390; i <= 440; i++){
        if (getX() == 480 && getY() == i){
            setLocation (getX()-10,getY());
        }
    }
       if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+5,getY());
            img += 1;
            direction = 1;
            
        }
        if (Greenfoot.isKeyDown("a"))
        { 
            setLocation(getX()-5,getY());
            img += 1;
            direction = -1;
            
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-5);
            img += 1;
            direction = 1;
            
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+5);
            img += 1;
            direction = 1;
            
        }
        if(img >= 36)img -= 36;
        if(img < 0)img +=36;
        if(direction == 1){setImage(rightImage[img]);}
        else{setImage(leftImage[img]);}
        if (isTouching(cactus1.class)){
            getWorld().removeObject (this);
        }
        if (isTouching(cactus2.class)){
            Greenfoot.setWorld(new Dead());
        }
        if (isTouching(cactus3.class)){
            Greenfoot.setWorld(new Dead());
        }
        if (isTouching(cactus4.class)){
            Greenfoot.setWorld(new Dead());
        }
        if (isTouching(cactus5.class)){
            Greenfoot.setWorld(new Dead());
        }
        if (isTouching(cactusup.class)){
            Greenfoot.setWorld(new Dead());
        }
    }
}