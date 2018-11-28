import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        
        int verticalDiff = lightY - initialTY;
        int horizontalDiff = lightX - initialTX;
        String direction = "";
        
        
        

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            if(verticalDiff == 0) {
                if(horizontalDiff > 0){
                    direction = "E";
                } else {
                     direction = "W";
                }
            }
             
             if(horizontalDiff == 0) {
                if(verticalDiff > 0) {
                    direction = "S";
                } else {
                     direction = "N";
                }
            }
            
            
            if(verticalDiff != 0 && horizontalDiff != 0){
                if(verticalDiff > 0) {
                    if(horizontalDiff > 0) {
                     direction = "SE";
                    } else {
                        direction = "SW";
                    }
                    verticalDiff --;
                }
                
                if(verticalDiff < 0){
                    if(horizontalDiff > 0) {
                     direction = "NE";
                    } else {
                        direction = "NW";
                    }
                    verticalDiff ++;
                }
                
            }
            
            
           
            
            


            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(direction);
        }
    }
    
    
   
}