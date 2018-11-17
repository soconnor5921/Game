package Rooms;

import Characters.Player;
import Game.Runner;

public class WinningRoom extends Room
{
    int xLoc, yLoc;

    public WinningRoom(int x, int y)
    {
        super(x,y);
        xLoc = x;
        yLoc = y;
    }

    public void enterRoom(Player x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have won the game! Congratulations!");
    }
}
