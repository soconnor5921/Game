package Characters;

public class FriendlyNpc
{
    String name;
    int xLoc, yLoc;

    public FriendlyNpc(String name)
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