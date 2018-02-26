package com.parassidhu.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskManager {

    static void execute() {
        try {
            listProcesses();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void listProcesses() throws IOException {
        String line;
        // Get the Task Manager process
        Process p = Runtime.getRuntime().exec("tasklist.exe");
        // Get and save input from the process to a BufferedReader object
        BufferedReader input =
                new BufferedReader(new InputStreamReader(p.getInputStream()));
        // Loop and print the tasks
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
        input.close();
    }
}
