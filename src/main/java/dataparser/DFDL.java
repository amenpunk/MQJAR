package dataparser;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Iterator;

public class DFDL{

    private String uid; // max lenght -> 40 positions
    private String deparment; // max lenght -> 10 positions
    private String operation; // max lenght -> 4

    public DFDL(String dep, String uid, String op ){
        this.deparment = dep;
        this.uid = uid;
        this.operation = op;
    }

    public static String Create(){

        List<DFDL> myOperations = Employes.CreateEmployes();
        Iterator<DFDL> operations =  myOperations.iterator();
        ArrayList<String> operation_list = new ArrayList<>();

        while(operations.hasNext()){
            String message = operations.next().toString();
            System.out.println(message);
            operation_list.add(message);
        }


        return String.join("\n", operation_list);
    }

    @Override
    public String toString(){
        return uid+deparment+operation;
    }

}

class Employes{

    private static List<DFDL> employes = new ArrayList<>();
    private static int NUM_MESSAGE = 4;

    public static int getRand() {
        int min = 0, max = 4;
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static List<DFDL> CreateEmployes() {

        String[] deparments = {"INNOVA_TEC", "FINA_SGURS", "SEGCSISL00", "390BUSSINS"};
        String[] operation = {"DELE", "UPDE", "CREA", "FREE"};

        for(int x = 0 ; x < NUM_MESSAGE; x++){
            String uniqueID = UUID.randomUUID().toString();
            String sp = "     ";
            DFDL new_operation = new DFDL( deparments[Employes.getRand()] + sp , uniqueID + sp, operation[Employes.getRand()] );
            employes.add(new_operation);
        }

        return employes;
    }

}
