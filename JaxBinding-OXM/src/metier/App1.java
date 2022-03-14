package metier;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

public class App1 {
    public static void main(String[] args) throws JAXBException {
        Banque banque=new Banque();
        banque.addCompte(new Compte(1L,9000.0,new Date()));
        banque.addCompte(new Compte(2L,6000.0,new Date()));
        banque.addCompte(new Compte(3L,10000.0,new Date()));
        JAXBContext context=JAXBContext.newInstance(Banque.class);
        Marshaller marshaller= context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(banque,new File("comptes.xml"));

    }
}
