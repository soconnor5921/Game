package Game;

import Characters.Barry;
import Characters.FriendlyNpc;
import Characters.Player;
import Rooms.Room;
import Rooms.VisitedRoom;
import Rooms.WinningRoom;


public class Map
{
    public static Room[][] createMap(int x, int y)
    {
        Room[][] map = new Room[x][y];
        for(int i = 0; i < map.length; i++)
        {
            for(int j = 0; j < map[i].length; j++)
            {
                map[i][j] = new Room(i, j);
            }
        }
        map[x-1][y-1] = new WinningRoom(x-1,y-1);
        map[1][1].npcOccupant = new Barry();
        return map;
    }

    public static String printMap(Room[][] arr, Player p)
    {
        String map = "";
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                Room temp = arr[i][j];
                if(temp instanceof WinningRoom){map += "[W]";}
                else if(i == p.getxLoc() && j == p.getyLoc()){map += "[P]";}
                else if(temp instanceof VisitedRoom){map += "[-]";}
                else{map += "[?]";}
            }
            map += "\n";
        }
        return map;
    }

}
