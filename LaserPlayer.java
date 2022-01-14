import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserPlayer extends Actor
{
    /**
     * Act - do whatever the LaserPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void serang()
    {
        setLocation(getX(), getY()-5);
        if(getY() < 20){
            getWorld().removeObject(this);
        }
        else
        {
            cek_sasaran();
        }
    }
    
    public void cek_sasaran()
    {
        if(isTouching(Enemy.class)){
            getWorld().addObject(new Boomenemy(), getX(), getY());
            Latar l = (Latar)getWorld();
            l.addscore(20);
            
            Greenfoot.playSound("Laser_shoot 122 (1).wav");
            removeTouching(Enemy.class);
        }
    }
    
    public void act()
    {
        serang();
    }
}
