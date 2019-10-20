import java.time.ZonedDateTime;
import java.util.Date;
import java.time.temporal.ChronoUnit;
import java.time.*;


public class Vol 
    {
    private String identifiant;
    private ZonedDateTime depart;
    private ZonedDateTime arrivee;

    public Vol(String identifiant, ZonedDateTime depart, ZonedDateTime arrivee)
    {
        this.identifiant = identifiant;
        this.depart = depart;
        this.arrivee = arrivee;
    }

    public void duree(){
		//System.outprintln(this.depart.until(this.arrivee,ChronoUnit.HOURS));
    }

    public void ouvrir(){
	//return 0;
    }

    public void fermee(){
	//return 0;
    }

}
