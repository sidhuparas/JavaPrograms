package com.parassidhu.control;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Clipboard {

    // Thanks to Anurag Jain

    public static void execute() {
        try {
            clipBoardActions();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        }
    }

    public static void clipBoardActions() throws IOException, UnsupportedFlavorException {
        Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
        if (t != null && t.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            // Gets the copied content
            String text = (String)t.getTransferData(DataFlavor.stringFlavor);
            System.out.println("Current Clipboard data is:\n" + text);

            text = "Modified clipboard data";
            StringSelection ss = new StringSelection(text);

            // Set text to clipboard
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
            System.out.println("Changed Clipboard data is:\n" + text);
        }
    }
}
