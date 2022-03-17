package csv;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Parse{

    public String getData() throws FileNotFoundException {
        try{

            String temp_data = "";
            Scanner csv = new Scanner(new File("/home/ming/WORKSPACE/MQJAR/src/files/data.csv"));
            csv.useDelimiter(",");

            while (csv.hasNext()) {
                temp_data+=csv.next() + ",";
            }

            csv.close();
            int len = temp_data.length();
            temp_data = temp_data.substring(0 , len - 1);

            return temp_data;

        }catch(FileNotFoundException err){
            System.out.println("Data Not Found");
            return "";
        }
    }

}
