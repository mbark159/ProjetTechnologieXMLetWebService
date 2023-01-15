package ma.enset.project2.metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Operations implements Serializable {
    private Date dateDebut;
    private Date dateFin;

    @XmlElement(name = "Operation")
    private List<Operation> operationList= new ArrayList<>();

    public Operations() {
    }

    public Operations(Date dateDebut, Date dateFin, List<Operation> operationList) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.operationList = operationList;
    }

    @Override
    public String toString() {
        return "\nOperations{" +
                "dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", operationList=\n" + operationList +
                "}";
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
    }
}
