import mayflower.*;

public class Cat extends AnimatedActor
{
    private int currentFrame;
    private Animation walk;

    public Cat()
    {
        String[] walkAnimation = new String[10];
        for (int i=0;i<10;i++)
        {
            walkAnimation[i] = "img/cat/Walk (" + (i+1) + ").png";
        }
        walk = new Animation(50, walkAnimation);
        walk.scale(100,87);
        walk.setTransparency(3);
        setAnimation(walk);
    }
    
    public void act()
    {
        super.act();
    }
}