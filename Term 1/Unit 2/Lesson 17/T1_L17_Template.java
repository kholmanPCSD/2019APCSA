/*
 * Lesson 17 - Unit 2 - While Loops
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

class t1_lesson17_template{


     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
          
          int x = 0;
          
          while ( x > -1 )
          {
               System.out.println( "You entered: " + x);
               x = scan.nextInt();
          }//while

          System.out.println( "Done");
                
            
     }

}


