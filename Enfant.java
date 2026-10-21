package ds2024;

public class Enfant extends Personne {
	private int idEnfant;
    private String classe;
    private static int compteur=0;

    public Enfant(String nom, String prenom, int age) {
        super(nom, prenom, age);
        compteur++;
        idEnfant=compteur;
    }
    public Enfant(String nom, String prenom, int age, String classe) {
        this(nom, prenom, age);
        this.classe=classe;
    }
    public String getClasse() {
        return classe;
    }
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("ID enfant" + idEnfant);
        System.out.println("Classe" + classe);
    }
    
    
	

}
