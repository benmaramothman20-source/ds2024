package ds2024;

public class ParrainMensuel extends Parrain {
	private double virementMensuel;

    public ParrainMensuel(String nom, String prenom, int age,
                          double virementMensuel) {
        super(nom, prenom, age);
        this.virementMensuel=virementMensuel;
    }
    public double getVirementMensuel() {
        return virementMensuel;
    }

    public double calculerVirementTotal() {
        return getnbreEnfantsParraines()*virementMensuel;
    }
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Virement mensuel total"
                + calculerVirementTotal() + " DT");
    }
    

}
