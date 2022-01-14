import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Latar extends World
{
    private int jeda = 3;
    private int score;
    private int nyawa = 5;
    private int time;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 700, 1);
        tampilnyawa();
        tampilscore();
        showTime();
        time = 1500;
        addObject (new Player(), 250, 600);
    }
    
    //menampilkan terjadinya update nyawa ketika tertembak
    public void updatenyawa(int point)
    {
        nyawa = nyawa + point;
        tampilnyawa();
        
        if(nyawa == 0)
        {
            Greenfoot.setWorld(new PlayAgain());
        }
    }
    
    //menampilkan nyawa
    public void tampilnyawa()
    {
        showText("Nyawa : " + nyawa, 400, 25);
    }
    
    //menampilkan terjadinya perubahan score ketika berhasil menembak musuh
    public void addscore(int points)
    {
        score = score + points;
        tampilscore();
    }
    
    //menampilkan score
    private void tampilscore()
    {
        showText("Score : " + score, 100, 25);
    }
    
    //menampilkan waktu yang terus berkurang
    private void countTime()
    {
        time --;
        showTime();
        if (time == 0)
        {
            Greenfoot.setWorld(new NextLevel());
        }
    }
    
    //menampilkan waktu
    private void showTime()
    {
        showText("Waktu : " + time, 250, 25);
    }
    
    //menampilkan musuh yang keluar
    public void act()
    {
        if (Greenfoot.getRandomNumber (100) < 2)
        {
            addObject(new Enemy(), Greenfoot.getRandomNumber(599), 500);
        }
        countTime();
    }
}
