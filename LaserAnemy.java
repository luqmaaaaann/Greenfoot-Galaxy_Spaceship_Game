import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserAnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserAnemy extends Actor
{
    /**
     * Act - do whatever the LaserAnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int nyawa;
    
    public void serang()
    {
        setLocation(getX(), getY() + 4);
        if(getY() > 590){
            getWorld().removeObject(this);
        }else{
            cek_sasaran();
        }
    }
    
    public void cek_sasaran()
    {
        if(isTouching(Player.class)){
            getWorld().addObject(new Boomplayer(), getX(), getY());
            Latar t = (Latar)getWorld();
            t.updatenyawa(-1);
            getWorld().removeObject(this);
            Greenfoot.playSound("Laser_shoot 139 (5).wav");
        }
    }
    
    public void act()
    {
        serang();
    }
}
