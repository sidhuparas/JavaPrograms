package com.parassidhu.control;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which program would you like to run (Enter Class Name): ");
        switch (scanner.nextLine()){
            case "TimeForAChange":
                TimeForAChange.execute();
                break;
            case "LongDivision":
                LongDivision.execute();
                break;
            case "TheLastLaugh":
                TheLastLaugh.execute();
                break;
            case "AutomaticTyping":
                AutomaticTyping.execute();
                break;
            case "ScreenCapture":
                ScreenCapture.execute();
                break;
            default:
                System.out.println("Please enter a valid input.");
                break;
        }


    }
}
