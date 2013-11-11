package lab3;

import lab2.*;
import lab1.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Lab3Reader2 {

    private boolean recordNumberIsFound = false;

    public void readFile(int searchForRecordNumber) {
        PrintWriter out = null;

        File data = new File(File.separatorChar + "temp" + File.separatorChar
                + "lab1.txt");

        BufferedReader in = null;

        int recCount = 0;
        try {

            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            //recCount++;

            while (line != null) {
                recCount++;
                if (recCount == searchForRecordNumber) {
                    //System.out.println(line);
                    System.out.println("city: " + getCity(line));
                    recordNumberIsFound = true;

                    //break;
                }
                line = in.readLine();  // strips out any carriage return chars
                //recCount++;
            }

        } catch (IOException ioe) {
            System.out.println("IOException reading input file");
        } finally {
            try {
                if (recordNumberIsFound) {
                    System.out.println("Record Number "
                            + searchForRecordNumber
                            + " of " + recCount
                            + " was found in file");
                } else {
                    System.out.println("Record Number "
                            + searchForRecordNumber
                            + " of " + recCount
                            + " was NOT found in file");
                }
                in.close();
            } catch (Exception e) {
            }
        }

    }

    public String getCity(String line) {
        String[] lineParts = line.split("#");
        String city = lineParts[3];
        return city;
    }
}
