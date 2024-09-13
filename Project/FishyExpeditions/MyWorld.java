import mayflower.*;
import java.util.*;

public class MyWorld extends World {
    private String[][] tiles;
    
    public MyWorld() 
    {
        setBackground("img/BG/BG.png");
        tiles = new String[6][8];
        buildWorld();
        addRandomObjects();
        addMainCharacter();
        addDog();
    }
    /*
    public void addMainCharacter()
    {
        cat = new Cat();
        int row = (int) (Math.random()*(tiles.length-1)*100);
        int col = (int) (Math.random()*tiles[0].length*100);
        
        boolean added = false;
        
        while (!added)
        {
            int i = (int) (Math.random()*tiles.length);
            int j = (int) (Math.random()*tiles[0].length);
            if (tiles[i][j].equals(""))
            {
                addObject(cat, j*100, i*100);
                added = true;
            }
        }
    }
    
    public void addDog()
    {
        dog = new Dog();
        int row = (int) (Math.random()*(tiles.length-1)*100);
        int col = (int) (Math.random()*tiles[0].length*100);
        
        boolean added = false;
        
        while (!added)
        {
            int i = (int) (Math.random()*tiles.length);
            int j = (int) (Math.random()*tiles[0].length);
            if (tiles[i][j].equals(""))
            {
                addObject(dog, j*100, i*100);
                added = true;
            }
        }
    }
    */
    public void buildWorld()
    {
        for (int i=0;i<tiles.length;i++)
        {
            for (int j=0;j<tiles[0].length;j++)
            {
                tiles[i][j] = "";
            }
        }

        for (int k=0;k<tiles[0].length;k++)
        {
            tiles[5][k] = "ground";
        }

        for (int l=0;l<tiles.length;l++)
        {
            for (int m=0;m<tiles[0].length;m++)
            {
                if (tiles[l][m].equals("ground"))
                {
                    addObject(new Block(), m*100, l*100);
                }
            }
        }
    }
    
    public void addRandomObjects()
    {
        for (int i=0;i<tiles.length-1;i++)
        {
            for(int j=0; j<tiles[0].length;j++)
            {
                if (Math.random()*10 < 3)
                {
                    addObject(new Yarn(), j*100, i*100);
                    tiles[i][j] = "yarn";
                }
                else if (Math.random()*10 > 9)
                {
                    addObject(new Crate(), j*100, i*100);
                    tiles[i][j] = "crate";
                }
            }
        }
    }
    
    public void act()
    {
        
    }
}