import java.io.*;
import java.util.Scanner;

//I think it is saying that the scanners are not working properly, but
//they work fine when I run them on my computer.
//I was wondering if you had any ideas

class Assignment3 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner (System.in);

        int birthMonth;
        int birthDay;
        String birthdayLong = "";
        String birthMonthString = "";
        String birthDayString = "";

        System.out.print("Birth Month #: ");
        birthMonth = scan.nextInt();

        System.out.print("Birth Day: ");
        birthDay = scan.nextInt();

        if(birthMonth < 13 && birthMonth > 0) {
            switch(birthMonth) {

                case 1:
                    birthMonthString = "January";
                    break;

                case 2:
                    birthMonthString = "February";
                    break;

                case 3:
                    birthMonthString = "March";
                    break;

                case 4:
                    birthMonthString = "April";
                    break;

                case 5:
                    birthMonthString = "May";
                    break;

                case 6:
                    birthMonthString = "June";
                    break;

                case 7:
                    birthMonthString = "July";
                    break;

                case 8:
                    birthMonthString = "August";
                    break;

                case 9:
                    birthMonthString = "September";
                    break;

                case 10:
                    birthMonthString = "October";
                    break;

                case 11:
                    birthMonthString = "November";
                    break;

                case 12:
                    birthMonthString = "December";
                    break;

                default:
                    System.out.println("Invalid month number");
            }

        }

        if(birthDay > 0 && birthDay < 32) {
            switch (birthDay) {
                case 1:
                    birthDayString = "first";
                    break;

                case 2:
                    birthDayString = "second";
                    break;

                case 3:
                    birthDayString = "third";
                    break;

                case 4:
                    birthDayString = "fourth";
                    break;

                case 5:
                    birthDayString = "fifth";
                    break;

                case 6:
                    birthDayString = "sixth";
                    break;

                case 7:
                    birthDayString = "seventh";
                    break;

                case 8:
                    birthDayString = "eighth";
                    break;

                case 9:
                    birthDayString = "ninth";
                    break;

                case 10:
                    birthDayString = "tenth";
                    break;

                case 11:
                    birthDayString = "eleventh";
                    break;

                case 12:
                    birthDayString = "twelfth";
                    break;

                case 13:
                    birthDayString = "thirteenth";
                    break;

                case 14:
                    birthDayString = "fourteenth";
                    break;

                case 15:
                    birthDayString = "fifteenth";
                    break;

                case 16:
                    birthDayString = "sixteenth";
                    break;

                case 17:
                    birthDayString = "seventeenth";
                    break;

                case 18:
                    birthDayString = "eighteenth";
                    break;

                case 19:
                    birthDayString = "nineteenth";
                    break;

                case 20:
                    birthDayString = "twentieth";
                    break;

                case 21:
                    birthDayString = "twenty-first";
                    break;

                case 22:
                    birthDayString = "twenty-second";
                    break;

                case 23:
                    birthDayString = "twenty-third";
                    break;

                case 24:
                    birthDayString = "twenty-fourth";
                    break;

                case 25:
                    birthDayString = "twenty-fifth";
                    break;

                case 26:
                    birthDayString = "twenty-sixth";
                    break;

                case 27:
                    birthDayString = "twenty-seventh";
                    break;

                case 28:
                    birthDayString = "twenty-eighth";
                    break;

                case 29:
                    birthDayString = "twenty-ninth";
                    break;

                case 30:
                    birthDayString = "thirtieth";
                    break;

                case 31:
                    birthDayString = "thirty-first";
                    break;
            }
        }

        birthdayLong = birthMonthString + " " + birthDayString;

        System.out.println("Your birthday is " + birthdayLong);



    }
}
