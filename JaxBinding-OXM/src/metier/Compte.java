package metier;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement(name="compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte implements Serializable {

    @XmlAttribute
    private Long code;
    @XmlElement
    private double solde;
    private Date dateCeaction;

    public Compte() {
    }

    public Compte(Long code, double solde, Date dateCeaction) {
        this.code = code;
        this.solde = solde;
        this.dateCeaction = dateCeaction;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCeaction() {
        return dateCeaction;
    }

    public void setDateCeaction(Date dateCeaction) {
        this.dateCeaction = dateCeaction;
    }
}
