package ma.enset.project2.Application;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import ma.enset.project2.metier.Operation;
import ma.enset.project2.metier.Operations;
import ma.enset.project2.metier.Releve;

import java.io.File;
import java.util.List;

public class App2 {
   public static void main(String arg[]) throws Exception {

       JAXBContext context=JAXBContext.newInstance(Releve.class);
       Unmarshaller unmarshaller=context.createUnmarshaller();
       Releve rev1= (Releve) unmarshaller.unmarshal(new File("Releve1.xml"));

       Operations ops2=rev1.getOps();
       List<Operation> opList=  ops2.getOperationList();

       int i=1;
       for (Operation op : opList){
           System.out.println("\nOperation: "+ i++);
           System.out.println("type:  "+op.getType());
           System.out.println("date:  "+op.getDate());
           System.out.println("solde:  "+op.getSolde());
           System.out.println("description:  "+op.getDescription());

       }

       System.out.println("\n\n---------------------------------------\n\n");
       System.out.println(rev1);



   }
}
