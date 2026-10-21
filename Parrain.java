package ds2024;

public class Parrain extends Personne {
	private int idParrain;
    private int nombreEnfantsParraines;
    private Enfant[] mesEnfants;
    public static final int MAX = 100;
    private static int compteur = 0;
    public Parrain(String nom, String prenom, int age) {
        super(nom, prenom, age);
        compteur++;
        idParrain = compteur;
        nombreEnfantsParraines=0;
        mesEnfants = new Enfant[MAX];
    }
    public void ajouterEnfant(Enfant enfant) {
        if (nombreEnfantsParraines<MAX) {
            mesEnfants[nombreEnfantsParraines]=enfant;
            nombreEnfantsParraines++;
        } else {
            System.out.println("plein");
        }
    }
    public Enfant getEnfant(int i) {
        return mesEnfants[i];
    }

    public int getnbreEnfantsParraines() {
        return nombreEnfantsParraines;
    }
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("ID parrain" + idParrain);
        System.out.println("Nombre d'enfants" + nombreEnfantsParraines);
        for (int i = 0; i < nombreEnfantsParraines; i++) {
            mesEnfants[i].afficherInfos();
        }
    }
    
    
	

}
