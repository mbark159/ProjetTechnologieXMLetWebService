package ma.enset.project2.Application;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.SchemaOutputResolver;
import ma.enset.project2.metier.Releve;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class App3  {
    public static void main(String[] arg) throws Exception{

        JAXBContext context=JAXBContext.newInstance(Releve.class);
        context.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String s, String s1) throws IOException {
                File f=new File("Releve.xsd");
                StreamResult result=new StreamResult(f);
                result.setSystemId(f.getName());

                return result;
            }
        });

    }
}
