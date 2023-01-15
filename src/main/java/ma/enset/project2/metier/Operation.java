package ma.enset.project2.metier;

import jakarta.xml.bind.annotation.*;

import java.io.Serializable;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Operation  implements Serializable {

    @XmlAttribute
    private String type;
    @XmlAttribute
    private Date date;
    @XmlAttribute
    private double solde;
    @XmlAttribute
    private String description;

    public Operation() {

    }

    public Operation(String type, Date date, double solde, String description) {
        this.type = type;
        this.date = date;
        this.solde = solde;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nOperation{" +
                "type='" + type + '\'' +
                ", date=" + date +
                ", solde=" + solde +
                ", description='" + description + '\'' +
                '}';
    }
}
