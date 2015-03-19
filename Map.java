import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map extends World
{
    private static final int cellSize = 32;
    
    private final int width;
    private final int height;
    
    private final GreenfootImage background;
    
    
    /**
     * Constructor for objects of class Map.
     * 
     */
    public Map(int width, int height, GreenfootImage background)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(width, height, cellSize);
        
        this.width = width;
        this.height = height;
        this.background = background;
        
        setBackground(background);
    }
    
    
}
