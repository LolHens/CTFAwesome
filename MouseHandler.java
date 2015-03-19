/**
 * Write a description of class MouseHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MouseHandler  
{
    private final World world;
    
    private boolean left = false;
    
    public MouseHandler(World world) {
        this.world = world;
    }
    
    public void update() {
        int button = MouseInfo.getButton();
        
        if (button == 1) {
            left = true;
        } else if (left) {
            action(ACTION_CLICK, 1);
        }
    }
    
    public static final int ACTION_CLICK = 1;
    
    private void action(int action, int button) {
        
    }
}
