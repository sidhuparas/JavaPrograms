package com.parassidhu.control;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AutomaticTyping {

    public static void execute(){
        try {
            runRobot();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void runRobot() throws InterruptedException, AWTException, IOException {

        // Thanks to CodeProject for sharing this
        // awesome program

        Runtime.getRuntime().exec("notepad.exe");
        Thread.sleep(2000);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_T);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_H);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_I);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_S);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_I);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_S);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_F);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_U);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_N);
    }

}
