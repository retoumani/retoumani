import java.util.ArrayList;
import java.util.Date;
import java.time.temporal.ChronoUnit;
import java.time.*;


public class Reservation {
    public Date date;
    public Double identifiant;
    public String etat;
    public ArrayList<Passager> passagers;

    public Reservation(Date date,Double identifiant, String etat){
        this.date =date;
        this.identifiant = identifiant;
        this.etat = etat;
        passagers = new ArrayList<>();
    }

    public void annuler(){
		this.etat="annulation";
    }

    public void confirmer(){
		this.etat="confirmation";
    }

    public void payer(){
		this.etat="payement";
    }
}
