import mayflower.*;
public class MayMayflower extends Mayflower
{
    public MayMayflower()
    {
        super("Fishy Expeditions", 800, 600);
    }
    
    public void init()
    {
        Mayflower.setFullScreen(false);
        World w = new MyWorld();
        Mayflower.setWorld(w);
    }
}
