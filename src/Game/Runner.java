package Game;

import Characters.Player;
import Rooms.Room;
import java.util.Scanner;

public class Runner
{
    private static boolean gameOn = true;
    public static Room[][] newMap = Map.createMap(5,5);

    public static void main(String[] args)
    {
        System.out.println("Hello! What is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        //Set Up Player
        Player Player1 = new Player(name, 0, 0);

        String printedMap = Map.printMap(newMap, Player1);

        System.out.println("Hello " + name + "! Use WASD to move or M to show the map.");
        System.out.println(printedMap);

        while(gameOn)
        {
            String move = in.nextLine();
            if(canMove(move, Player1, newMap))
            {
                System.out.println("You are now at coordinates X= " + Player1.getxLoc() + " Y= "+ Player1.getyLoc());
                System.out.println(Map.printMap(newMap,Player1));
            }
            else
            {
                System.out.println("Please stay in the playable area. Pick another direction");
            }
        }
    }

    public static boolean canMove(String move, Player p, Room[][] map)
    {
        move = move.toLowerCase();
        int x = p.getxLoc();
        int y = p.getyLoc();

        if(move.equals("w") && x != 0)
        {
            map[x][y].leaveRoom(p);
            map[x-1][y].enterRoom(p);
            return true;
        }
        else if(move.equals("a") && y != 0)
        {
            map[x][y].leaveRoom(p);
            map[x][y-1].enterRoom(p);
            return true;
        }
        else if(move.equals("s") && x != 4)
        {
            map[x][y].leaveRoom(p);
            map[x+1][y].enterRoom(p);
            return true;
        }
        else if(move.equals("d") && y != 4)
        {
            map[x][y].leaveRoom(p);
            map[x][y+1].enterRoom(p);
            return true;
        }
        else
        {
            return false;
        }
    }


    public static void gameOff()
    {
        gameOn = false;
    }

}
