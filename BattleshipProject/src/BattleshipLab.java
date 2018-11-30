
import java.util.*;
import java.util.Scanner;

public class BattleshipLab {
	
	Scanner input = new Scanner(System.in);
  
    public static void breakln()
    {
       System.out.println("_____________________________________");
       System.out.println("");
    }
    public static void createBoard(String[][] board)
    {
       for(int r = 0; r < board.length; r++)
       {
          for(int c = 0; c < board[0].length; c++)
          {
             board[r][c] = "~";
          }
       }
    }
   
    }

