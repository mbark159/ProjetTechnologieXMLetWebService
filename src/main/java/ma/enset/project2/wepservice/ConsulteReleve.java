package ma.enset.project2.wepservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ma.enset.project2.metier.Operation;
import ma.enset.project2.metier.Operations;
import ma.enset.project2.metier.Releve;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "ConsuleReleveWS")
public class ConsulteReleve {


    @WebMethod(operationName = "GetReleve")
    public Releve getRelve(@WebParam(name = "RIB") String st){

        List<Operation> opL1 = new ArrayList<>();

        opL1.add(new Operation("CREDIT", new Date(),9000,"Vers Espèce"));
        opL1.add(new Operation("DEBIT", new Date(),3400,"Chèque Guichet"));
        opL1.add(new Operation("DEBIT", new Date(),120,"Prélèvement Assurence"));
        opL1.add(new Operation("CREDIT", new Date(),70000,"Virement..."));

        return new Releve(st,new Date(),14500,new Operations( new Date() ,new Date(2023,02,29),opL1));
    }
}
