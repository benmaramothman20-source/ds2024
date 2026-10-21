package ds2024;

public class Personne {
	 private String nom;
	    private String prenom;
	    private int age;
	    public Personne(String nom, String prenom, int age) {
	        this.nom = nom;
	        this.prenom = prenom;
	        setAge(age);
	    }
	    public void setAge(int age) {
	        if (age > 0) {
	            this.age = age;
	        } else {
	            System.out.println("Age invalide");
	        }
	    }
	    public void afficherInfos() {
	        System.out.println("Nom" + nom);
	        System.out.println("Prenom" + prenom);
	        System.out.println("Age" + age);
	    }

}
