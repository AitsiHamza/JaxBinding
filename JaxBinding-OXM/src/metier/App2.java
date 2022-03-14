package metier;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class App2 {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context=JAXBContext.newInstance(Banque.class);
        Unmarshaller unmarshaller=context.createUnmarshaller();
        Banque b=(Banque)unmarshaller.unmarshal(new File("comptes.xml"));
        List<Compte> cpts =b.getComptes();
        for(Compte cp:cpts){
            System.out.println("=============================");
            System.out.println("Code="+cp.getCode());
            System.out.println("Code="+cp.getSolde());
            System.out.println("Code="+cp.getDateCeaction());
        }
    }
}
