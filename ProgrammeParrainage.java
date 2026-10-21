package ds2024;

public class ProgrammeParrainage {
	public static void main(String[] args) {

        // Creation des parrains
        Parrain[] parrains = new Parrain[10];
        parrains[0] = new Parrain("Ali", "Ben Ali", 40);
        parrains[1] = new Parrain("Salah", "Ben Salah", 35);
        parrains[2] = new ParrainMensuel("Tounes", "Ben Tounes", 45, 100.0);
        // Creation des enfants
        Enfant[] enfants = new Enfant[1025];
        enfants[0] = new Enfant("Farah", "ben Farah", 10,"quatrieme annee");
        enfants[1] = new Enfant("Amel", "ben Amel", 12,"Sixieme annee");
        enfants[2] = new Enfant("Fedy", "Ben Fedy", 11,"Sixieme annee");
        enfants[3] = new Enfant("Sarra", "Ben Sarra", 9,"Troisieme annee");
        parrains[0].ajouterEnfant(enfants[0]);
        parrains[2].ajouterEnfant(enfants[1]);
        parrains[2].ajouterEnfant(enfants[2]);
        int total = 0;
        for (int i = 0; i < parrains.length; i++) {
            if (parrains[i] != null) {
                total = total+ parrains[i].getnbreEnfantsParraines();
            }
        }
        System.out.println("Nombre total " + total);
        System.out.println("Enfants en Sixieme annee ");

        for (int i = 0; i < parrains.length; i++) {
            if (parrains[i] != null) {
                for (int j = 0;j < parrains[i].getnbreEnfantsParraines(); j++) {
                    Enfant e = parrains[i].getEnfant(j);
                    if (e.getClasse().equals("Sixieme annee")) {
                        e.afficherInfos();
                    }
                }
            }
        } 
        double montantTotal = 0;
        for (int i = 0; i < parrains.length; i++) {
            if (parrains[i] instanceof ParrainMensuel) {
                ParrainMensuel p = (ParrainMensuel) parrains[i];
                montantTotal = montantTotal+ p.calculerVirementTotal();
            }
        }
        System.out.println("Montant total"+ montantTotal + " DT");
    }
        


}

