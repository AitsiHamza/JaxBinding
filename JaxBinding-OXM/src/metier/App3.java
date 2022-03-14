package metier;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class App3 {
    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext context;
        context = JAXBContext.newInstance(Banque.class);
        context.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                File f=new File("comptes.xsd");
                StreamResult result=new StreamResult(f);
                result.setSystemId(f.getName());
                return result;
            }
        });
    }
}
