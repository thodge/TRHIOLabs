package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Lab1Part1 {

    public void readFile() {
    
    }
        
       public static void main(String[] args) {
         
    
        PrintWriter out = null;

        File data = new File(File.separatorChar + "temp" + File.separatorChar
                + "untitled.rtf");

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();  
            }

        } catch (IOException ioe) {
            System.out.println("Error");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
    }
}
