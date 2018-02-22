package com.parassidhu.control;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenCapture {
    // Thanks to CodeProject for the program.

    public static void execute(){
        try {
            takeScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    private static void takeScreenshot() throws IOException, AWTException {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Robot robot = new Robot();
        //Capture screenshot using Robot class's object
        BufferedImage img = robot.createScreenCapture(new Rectangle(size));
        //Exact path is the root directory of the program
        File save_path = new File("screen.jpg");

        //This saves the screenshot in JPG extension to the root directory of the project i.e. JavaPrograms
        ImageIO.write(img,"JPG",save_path);
    }
}
