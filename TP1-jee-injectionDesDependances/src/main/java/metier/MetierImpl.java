package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
    // couplage faible
    //@Autowired
    private IDao dao;
    public MetierImpl(IDao dao){
        this.dao=dao;
    }
    @Override
    public double calcul() {
        double tmp= dao.getData();
        double res=tmp*540/Math.cos(tmp);
        return 0;
    }

    /*
    * Injecter dans la variable dans
    *  un objet d'une classe qui implemante
    * l'interface IDao
    * */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
