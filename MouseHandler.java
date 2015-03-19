import greenfoot.*;
import java.util.*;
/**
 * Write a description of class MouseHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MouseHandler  
{
    private final World world;
    
    private int lastButton = 0;
    
    public MouseHandler(World world) {
        this.world = world;
    }
    
    public void update() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse == null) return;
        
        int button = mouse.getButton();
        int x = mouse.getX();
        int y = mouse.getY();
        
        List<IMouseHandler> handlers = world.getObjectsAt(x / world.getCellSize(),
                                                          y / world.getCellSize(),
                                                          IMouseHandler.class);
        if (lastButton != button) {
            if (lastButton != 0) {
                for (IMouseHandler handler: handlers) {
                    handler.onClick(lastButton);
                }
            }
            lastButton = button;
        }
    }
}
