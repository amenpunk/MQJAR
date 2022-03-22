import ibm.mq.*;
import java.io.FileNotFoundException;

import dataparser.CSV;

public class Start{

    public static void main (String[] args ) throws FileNotFoundException {
        // JMSGET mqclient = new JMSGET();
        // mqclient.Connect();
        // JMSPUT mqclient = new JMSPUT();
        // mqclient.SetMessage("Hola mundo yes yes");
        CSV csv_data = new CSV();
        String csv = csv_data.getData();

        System.out.println(csv);

        JMSPUT mqclient = new JMSPUT();
        mqclient.SetMessage(csv);


    }

}
