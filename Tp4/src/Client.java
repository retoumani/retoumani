import java.util.ArrayList;

public class Client {
    private String nom;
    private String paiement;
    private String contact;
    private String reference;
    private ArrayList<Reservation> reservations;

    public Client(String nom, String paiement, String contact, String reference){
        this.nom = nom;
        this.paiement = paiement;
        this.contact = contact;
        this.reference = reference;
        this.reservations = new ArrayList<>();
    }

    public Client(){
        this.nom = "remy";
        this.reservations = new ArrayList<>();

    }

    public String getNom(){
        return this.nom;
    }
}
