package Characters;

public class Player
{
    String name;
    int xLoc, yLoc;
    int health = 100;

    public Player(String name, int xLoc, int yLoc)
    {
        this.name = name;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public int getxLoc()
    {
        return xLoc;
    }

    public int getyLoc()
    {
        return yLoc;
    }

    public void setxLoc(int x)
    {
        xLoc = x;
    }

    public void setyLoc(int y)
    {
        yLoc = y;
    }
}
