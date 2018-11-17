package Rooms;

import Characters.Player;

public class VisitedRoom extends Room
{
    Player occupant;
    int xLoc, yLoc;

    public VisitedRoom(int x, int y)
    {
        super(x,y);
        xLoc = x;
        yLoc = y;
    }

    public void enterRoom(Player x)
    {
        System.out.println("You have already visited this room");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public void leaveRoom(Player x)
    {
        occupant = null;
    }
}
