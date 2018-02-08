package com.parassidhu.control;

public class LongDivision {

    public static void execute(){

        // What should be the output of the following?
        // It's not what it seems to be
        // Try it out to find out

        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;

        System.out.println (MICROS_PER_DAY / MILLIS_PER_DAY);
    }

}











// We are storing an int value in a long variable
// since we've attached an L to MICROS_PER_DAY
// An int value can't store such a big number so there's
// an overflow error. To get the correct input,
// attach an L to any of the number in both variables like this:

// final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1
// final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
