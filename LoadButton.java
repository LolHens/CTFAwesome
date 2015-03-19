import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Load here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoadButton extends Button
{
    /**
     * Act - do whatever the Load wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void onClick(int button) {
        Greenfoot.setWorld(new Map(20, 12, new GreenfootImage("bg.png")));
    }
}
