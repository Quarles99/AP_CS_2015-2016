import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

//The website was throwing errors when I tried to submit this
//It said:
/*
  Exception in thread "main" java.util.InputMismatchException
  at java.util.Scanner.throwFor(Scanner.java:864)
  at java.util.Scanner.next(Scanner.java:1485)
  at java.util.Scanner.nextInt(Scanner.java:2117)
  at java.util.Scanner.nextInt(Scanner.java:2076)
  at Main.main(Main.java:175)
  at Ideone.test(Main.java:76)
  at Ideone.test(Main.java:37)
  at Ideone.main(Main.java:23)
*/

//I think it is saying that the scanners are not working properly, but
//they work fine when I run them on my computer.
//I was wondering if you had any ideas

class Assignment1 {
    public static void main(String[] args) throws IOException {

    	Scanner scan = new Scanner (System.in);

    	int t1;
    	int t2;
    	int q1;
    	int q2;
    	int q3;
    	int ha;


    	//Entering Grades
    	System.out.println("Please enter your test grades.");

    	t1 = scan.nextInt();
    	System.out.println("Test 1: " + t1);

    	t2 = scan.nextInt();
    	System.out.println("Test 2: " + t2);

    	System.out.println("Please enter your quiz grades.");

    	q1 = scan.nextInt();
    	System.out.println("Quiz 1: " + q1);

    	q2 = scan.nextInt();
    	System.out.println("Quiz 2: " + q2);

    	q3 = scan.nextInt();
    	System.out.println("Quiz 3: " + q3);

    	System.out.println("Please enter your homework average.");

    	ha = scan.nextInt();
    	System.out.println("Homework Average: " + ha);

    	//Giving Averages
    	double ta = (t1 + t2) / 2;
    	System.out.println("Test Average: " + ta);

    	double qa = (q1 + q2 + q3) / 3;
    	System.out.println("Quiz Average: " + qa);

    	double fg = ((0.5 * ta) + (0.3 * qa) + (0.2 * ha));
    	System.out.println("Final Grade: " + fg);

    }
}
