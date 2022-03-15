import ibm.mq.JMSGET;

public class Start{

    public static void main (String[] args ){
        JMSGET mqclient = new JMSGET();
        mqclient.Connect();
    }

}
