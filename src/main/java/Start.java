import ibm.mq.*;
import java.io.FileNotFoundException;

import csv.Parse;

public class Start{

    public static void main (String[] args ) throws FileNotFoundException {
        // JMSGET mqclient = new JMSGET();
        // mqclient.Connect();
        // JMSPUT mqclient = new JMSPUT();
        // mqclient.SetMessage("Hola mundo yes yes");
        Parse csv_data = new Parse();
        String csv = csv_data.getData();

        JMSPUT mqclient = new JMSPUT();
        mqclient.SetMessage(csv);


    }

}
