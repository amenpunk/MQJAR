import ibm.mq.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import dataparser.CSV;
import dataparser.DFDL;

public class Start{

    public static void main (String[] args ) throws FileNotFoundException, IOException {
        // JMSGET mqclient = new JMSGET();
        // mqclient.Connect();
        JMSPUT mqclient = new JMSPUT();
        // mqclient.SetMessage("Hola mundo yes yes");
        // CSV csv_data = new CSV();
        // String csv = csv_data.getData();
        //
        // System.out.println(csv);
        //
        // JMSPUT mqclient = new JMSPUT();
        // mqclient.SetMessage(csv);
        String dfdl_message = DFDL.Create();
        // FileWriter myWriter = new FileWriter("filename.txt");
        // myWriter.write(dfdl_message);
        // myWriter.close();



        mqclient.SetMessage(dfdl_message);

        
    }

}
