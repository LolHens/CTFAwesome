import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InitWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private MouseHandler mouseHandler;
    /**
     * Constructor for objects of class InitWorld.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        mouseHandler = new MouseHandler(this);
        
        setupMenu();
    }
    
    private void setupMenu() {
        addObject(new LoadButton(), 300, 30);
    }
    
    public void act() {
        mouseHandler.update();
    }
}
