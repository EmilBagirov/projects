package com.amazon.utils;
import java.io.*;

import static java.awt.SystemColor.text;

public class SaveToFile {


    public static void saveTo(String fileName, String text) throws IOException {
        FileWriter file = new FileWriter(fileName, true);
        BufferedWriter writer = new BufferedWriter(file);
        try {
            writer.write(text);
            writer.append("\n");
        } finally {
            writer.close();
        }
    }
}
