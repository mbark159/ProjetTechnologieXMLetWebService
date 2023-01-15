package ma.enset.project2.Application;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import ma.enset.project2.metier.Operation;
import ma.enset.project2.metier.Operations;
import ma.enset.project2.metier.Releve;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

//    Releve rel1 = new Releve();
    Operation op1= new Operation("CREDIT", new Date(),9000,"Vers Espèce");
    Operation op2= new Operation("DEBIT", new Date(),3400,"Chèque Guichet");
    Operation op3= new Operation("DEBIT", new Date(),120,"Prélèvement Assurence");
    Operation op4= new Operation("CREDIT", new Date(),70000,"Virement...");

    List<Operation> opL1 = new ArrayList<>();

    opL1.add(op1);
    opL1.add(op2);
    opL1.add(op3);
    opL1.add(op4);

    Operations opS1= new Operations( new Date() ,new Date(2023,02,29),opL1);

    Releve rel1=new Releve("011112222333344445555666",new Date(),14500,opS1);

    System.out.println(rel1);
    rel1.toString();

        JAXBContext context=JAXBContext.newInstance(Releve.class);
        Marshaller marshaller= context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(rel1, new File("Releve1.xml"));

    }

}