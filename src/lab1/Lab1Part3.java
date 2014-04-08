package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Lab1Part3 {
    private final String SPACE = " ";

    public void readFile() {
        PrintWriter out = null;

        File data = new File(File.separatorChar + "temp" + File.separatorChar
                + "lab1.txt");

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
                
                System.out.println(line);
                String[] lineParts = line.split("#");
                
                String firstName = lineParts [0];
                String lastName = lineParts [1];
                String streetAddress = lineParts [2];
                String city = lineParts [3];
                String state = lineParts [4];
                String zip = lineParts [5];
                String email = lineParts [6];
                String phone = lineParts [7];
                
                System.out.println(firstName + SPACE +
                        lastName +SPACE +
                        streetAddress + SPACE +
                        city + SPACE +
                        state + SPACE +
                        zip + SPACE +
                        email + SPACE +
                        phone);
                
                
                line = in.readLine();  // strips out any carriage return chars
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
