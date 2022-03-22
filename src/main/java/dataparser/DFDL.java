package dataparser;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

public class DFDL{

    private String uid; // max lenght -> 40 positions
    private String deparment; // max lenght -> 10 positions
    private String operation; // max lenght -> 4

    public DFDL(String dep, String uid, String op ){
        this.deparment = dep;
        this.uid = uid;
        this.operation = op;
    }

    @Override
    public String toString(){
        return uid+deparment+operation;
    }

    public static String Create(){
        List<DFDL> myOperations = Employes.CreateEmployes();
        String operation_list = "";

        for(DFDL myop : myOperations ){
            operation_list+=myop.toString()+"|";
        }

        int len = operation_list.length();
        operation_list = operation_list.substring(0 , len - 1 );

        System.out.println(operation_list);
        return operation_list;
    }

}

class Employes{

    private static List<DFDL> employes = new ArrayList<>();

    public static int getRand() {
        int min = 0, max = 4;
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static List<DFDL> CreateEmployes() {

        String[] deparments = {"INNOVA_TEC", "FINA_SGURS", "SEGCSISL00", "390BUSSINS"};
        String[] operation = {"DELE", "UPDE", "CREA", "FREE"};

        for(int x = 0 ; x <5; x++){
            String uniqueID = UUID.randomUUID().toString();
            DFDL new_operation = new DFDL( deparments[Employes.getRand()], uniqueID, operation[Employes.getRand()] );
            employes.add(new_operation);
        }


        return employes;
    }

}
