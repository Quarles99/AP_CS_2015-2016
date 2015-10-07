/*
 * Lesson 11 - Unit 2 - Simple Ifs 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson11_template{

     public static void main (String str[]) throws IOException {

       Scanner scan = new Scanner(System.in);
       
       double decimalInput = 0;
       
       System.out.println("Input a decimal: ");
       
       decimalInput = scan.nextDouble();
       
       if(decimalInput == 17.25) {
           System.out.println("Correct");
       }
     }

}