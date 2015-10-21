import java.util.Scanner;

class milliSecondsConvert {
    public static void main(String [] args) {

        int timeSinceStart;
        int dayOfTheWeek;
        int hour24;
        int minute;
        int milliSeconds;
        int seconds;
        int hour;
        int secondsLeft;
        int secondsCarryOver = 0;
        int minutesLeft;
        int minutesCarryOver = 0;
        String AP;
        String dayOfTheWeekString = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("How many milliseconds has it been since the week began?");
        timeSinceStart = scan.nextInt();

        milliSeconds = timeSinceStart % 1000;

        seconds =  ((timeSinceStart % 100000) / 1000);

        if (seconds > 60) {
            secondsLeft = seconds % 60;
            secondsCarryOver = seconds / 60;
            seconds = secondsLeft;
        }

        minute =  ((timeSinceStart % 10000000) / 100000) + secondsCarryOver;

        if (minute > 60) {
            minutesLeft = minute % 60;
            minutesCarryOver = minute / 60;
            minute = minutesLeft;
        }

        hour24 =  ((timeSinceStart % 1000000000) / 10000000) + minutesCarryOver;

        if (hour24 >= 12) {
            AP = "PM";
        }
        else {
            AP = "AM";
        }

        hour = (hour24 + 12) % 12;

        if (hour == 0) {
            hour = 12;
        }

        dayOfTheWeek =  ((timeSinceStart % 1000000000) / 10000000) % 7;

        if(dayOfTheWeek == 0) {
            dayOfTheWeekString = "Sunday";
        }

        else if(dayOfTheWeek == 2) {
            dayOfTheWeekString = "Monday";
        }

        else if(dayOfTheWeek == 3) {
            dayOfTheWeekString = "Tuesday";
        }

        else if(dayOfTheWeek == 4) {
            dayOfTheWeekString = "Wednesday";
        }

        else if(dayOfTheWeek == 5) {
            dayOfTheWeekString = "Thursday";
        }

        else if(dayOfTheWeek == 6) {
            dayOfTheWeekString = "Friday";
        }

        else if(dayOfTheWeek == 7) {
            dayOfTheWeekString = "Saturday";
        }

        System.out.println(dayOfTheWeekString + ", " + hour + ":" + minute + ":" + seconds + "." + milliSeconds + " " + AP);
    }
}