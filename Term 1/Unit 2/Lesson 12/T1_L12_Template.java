/*
 * Lesson 12 - Unit 2 - If's Making Decisions
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson12_template{

     public static void main (String str[]) throws IOException {

       Scanner scan = new Scanner(System.in);
       
       System.out.println("Please enter your grade: ");
       
       double grade = scan.nextDouble();
       
       if(grade <=59.4)
       {  
         System.out.println("failing");
       }
     }

}