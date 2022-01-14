import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserAnemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserAnemy2 extends Actor
{
    /**
     * Act - do whatever the LaserAnemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int nyawa;
    
    public void serang2()
    {
        setLocation(getX(), getY() + 4);
        if(getY() > 590){
            getWorld().removeObject(this);
        }else{
            cek_sasaran2();
        }
    }
    
    public void cek_sasaran2()
    {
        if(isTouching(Player2.class)){
            getWorld().addObject(new Boomplayer2(), getX(), getY());
            Latar2 l = (Latar2)getWorld();
            l.updatenyawa(-1);
            getWorld().removeObject(this);
            Greenfoot.playSound("Laser_shoot 139 (5).wav");
        }
    }
    
    public void act()
    {
        serang2();
    }
 
}
