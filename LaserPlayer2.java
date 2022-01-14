import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserPlayer2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserPlayer2 extends Actor
{
    /**
     * Act - do whatever the LaserPlayer2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void serang2()
    {
        setLocation(getX(), getY()-5);
        if(getY() < 20){
            getWorld().removeObject(this);
        }
        else
        {
            cek_sasaran2();
        }
    }
    
    public void cek_sasaran2()
    {
        if(isTouching(Enemy2.class)){
            getWorld().addObject(new Boomenemy2(), getX(), getY());
            Latar2 t = (Latar2)getWorld();
            t.addscore(20);
            
            Greenfoot.playSound("Laser_shoot 122 (1).wav");
            removeTouching(Enemy2.class);
        }
    }
    
    public void act()
    {
        serang2();
    }
}
