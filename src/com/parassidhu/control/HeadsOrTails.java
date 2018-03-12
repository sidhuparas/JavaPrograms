package com.parassidhu.control;

import java.util.Random;

public class HeadsOrTails {

    // To keep track of no. of times toss is done
   static int times = 0;

    public static void execute(){
        times++;
        Random random = new Random();
        int num = random.nextInt(2);

        String toss[] = {
                "Heads",
                "Tails"
        };

        System.out.println("Tossing...");

        try {
            // So that tossing seems actual...
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(toss[num]);

        // Toss 5 number of times
        if (times<5)
            execute();
    }

}
