package Rooms;

import Characters.FriendlyNpc;
import Characters.Player;

import static Game.Runner.newMap;

public class Room
{
    Player occupant;
    public static FriendlyNpc npcOccupant;
    int xLoc, yLoc;

    public Room(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    public void enterRoom(Player x)
    {
        System.out.println("You are nowhere");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public void leaveRoom(Player x)
    {
        occupant = null;
        newMap[xLoc][yLoc] = new VisitedRoom(xLoc, yLoc);
    }
}
