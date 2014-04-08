package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Lab1Part2 {

    public void readFile() {
        PrintWriter out = null;

        File data = new File(File.separatorChar + "temp" + File.separatorChar
                + "lab1.txt");

        BufferedReader in = null;

        try {
            int recCount = 0;
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            
            while (line != null) {
                recCount++;
                if (recCount == 2) {
                    System.out.println(line);
                }
                line = in.readLine();  
                
            }

        } catch (IOException ioe) {
            System.out.println("IOException reading input file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }

    }
}
