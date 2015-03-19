import greenfoot.*;
/**
 * Write a description of class Team here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team  
{
    private String name;
    
    public Team(String name) {
        this.name = name;
    }
    
    public GreenfootImage getTeamImage(String name) {
        return new GreenfootImage(this.name + "_" + name);
    }
}
