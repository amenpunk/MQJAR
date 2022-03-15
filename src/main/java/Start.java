import ibm.mq.*;

public class Start{

    public static void main (String[] args ){
        // JMSGET mqclient = new JMSGET();
        // mqclient.Connect();
        JMSPUT mqclient = new JMSPUT();
        mqclient.SetMessage("Hola mundo");
    }

}
