package ma.enset.project2.metier;

import jakarta.xml.bind.annotation.*;

import java.io.Serializable;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve implements Serializable {

    @XmlAttribute
    private String rib;

    @XmlElement
    private Date dateReleve;

    @XmlElement
    private double solde;

    @XmlElement(name="Operations")
    private Operations ops;
//    private List<Operations> listOperations=new ArrayList<>();

    public Releve() {
    }

    public Releve(String rib) {
        this.rib = rib;
    }

    public Releve(String rib, Date dateReleve, double solde, Operations listOperations) {
        this.rib = rib;
        this.dateReleve = dateReleve;
        this.solde = solde;
        this.ops = listOperations;
    }

    @Override
    public String toString() {
        return "Releve{" +
                "rib='" + rib + '\'' +
                ", dateReleve=" + dateReleve +
                ", solde=" + solde +
                ", ops=" + ops +
                '}';
    }

    public Operations getOps() {
        return ops;
    }

    public void setOps(Operations ops) {
        this.ops = ops;
    }

    public String getRib() {
        return rib;
    }

//    public void setRib(String rib) {
//        this.rib = rib;
//    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }



//    public List<Operations> getListOperations() {
//        return listOperations;
//    }
//
//    public void setListOperations(List<Operations> listOperations) {
//        this.listOperations = listOperations;
//    }
}
