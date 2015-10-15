import java.io.*;
import java.util.Scanner;

//Getting runtime error on code runner on website
//I think it may be caused by the System.exit()'s

class Assignment3 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner (System.in);

        int birthMonth;
        int birthDay;
        String birthdayLong;
        String birthMonthString = "";
        String birthDayString = "";
        int birthDayNumber;
        String horoscopeSign = "";
        String horoscopePrediction = "";

        System.out.print("Birth Month #: ");
        birthMonth = scan.nextInt();

        System.out.print("Birth Day: ");
        birthDay = scan.nextInt();

        //if(birthMonth < 13 && birthMonth > 0) {
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
                    System.out.println("Error in month switch");
                    System.exit(2);

            }

       // }

//        else {
//            System.out.println("Invalid month number");
//        }

        //if(birthDay > 0 && birthDay < 32) {
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

                default:
                    System.out.println("Error, in day switch");
                    System.exit(1);
            }
       // }
       // else {
         //   System.out.println("Error, invalid day");
        //}

        birthdayLong = birthMonthString + " " + birthDayString;
        birthDayNumber = (birthMonth * 100) + birthDay;

        if(birthDayNumber > 320 && birthDayNumber < 420) {
            horoscopeSign = "Aries";
            horoscopePrediction = "You will meet someone who shares a similar love of mundane tasks.";
        }

        else if(birthDayNumber > 419 && birthDayNumber <521) {
            horoscopeSign = "Taurus";
            horoscopePrediction = "Expect to find all the coffee you drink to be cold";
        }

        else if(birthDayNumber > 520 && birthDayNumber <621) {
            horoscopeSign = "Gemini";
            horoscopePrediction = "You have a dark and mysterious past.";
        }

        else if(birthDayNumber > 620 && birthDayNumber <723) {
            horoscopeSign = "Cancer";
            horoscopePrediction = "Don't travel to Australia within the next month.";
        }

        else if(birthDayNumber > 722 && birthDayNumber < 823) {
            horoscopeSign = "Leo";
            horoscopePrediction = "*Insert oddly specific horoscope here*";
        }

        else if(birthDayNumber > 822 && birthDayNumber < 923) {
            horoscopeSign = "Virgo";
            horoscopePrediction = "While the grey carpet certainly is more affordable, \n" +
                    "you should listen to your husband and buy the blue one.";
        }

        else if(birthDayNumber > 922 && birthDayNumber < 1023) {
            horoscopeSign = "Libra";
            horoscopePrediction = "You will reach level 124 of Candy Crush Saga tonight";
        }

        else if(birthDayNumber > 1022 && birthDayNumber < 1122) {
            horoscopeSign = "Scorpio";
            horoscopePrediction = "You won't believe these 10 predictions that will leave you speechless!\n" +
                    "All you have to do is enter your SSN below!";
        }

        else if(birthDayNumber > 1121 && birthDayNumber < 1222) {
            horoscopeSign = "Sagittarius";
            horoscopePrediction = "The pen is mightier than the sword! Especially the new BIC \n" +
                    "ballpoint pen which is available at your locol retailer for only $2.99!";
        }

        else if((birthDayNumber > 1221 && birthDayNumber < 1232) || (birthDayNumber < 120 && birthDayNumber > 0)) {
            horoscopeSign = "Capricorn";
            horoscopePrediction = "I would recommend a coffee";
        }

        else if(birthDayNumber > 119 && birthDayNumber < 219) {
            horoscopeSign = "Aquarius";
            horoscopePrediction = "You will meet the love of your life, at a place you least expect it";
        }

        else if(birthDayNumber > 218 && birthDayNumber < 421){
            horoscopeSign = "Pisces";
            horoscopePrediction = "Whoever is writing these horoscopes will most likely be sacked.";
        }

        else {
            System.out.println("Error, Invalid Birthday");
        }

        System.out.println("Your birthday is " + birthdayLong);
        System.out.println("Your horoscope is: " + horoscopeSign + "\n" + horoscopePrediction);



    }
}
