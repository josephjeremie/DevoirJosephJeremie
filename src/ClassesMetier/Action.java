/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author jacqu
 */
public class Action
{
        private int idAction;
        private String nomAction;
        private double valeurAction;
        private double prixAction;
        private int quantiteAction;
        public Action (int un_id, String unNom, double une_valeur, double un_prix, int une_quantite)
        {
            
            idAction = un_id;
            nomAction = unNom;
            valeurAction = une_valeur;
            prixAction = un_prix;
            quantiteAction = une_quantite;
                
        }

    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    public void setNomAction(String nomAction) {
        this.nomAction = nomAction;
    }

    public void setValeurAction(double valeurAction) {
        this.valeurAction = valeurAction;
    }

    public void setPrixAction(double prixAction) {
        this.prixAction = prixAction;
    }

    public void setQuantiteAction(int quantiteAction) {
        this.quantiteAction = quantiteAction;
    }

    public int getIdAction() {
        return idAction;
    }

    public String getNomAction() {
        return nomAction;
    }

    public double getValeurAction() {
        return valeurAction;
    }

    public double getPrixAction() {
        return prixAction;
    }

    public int getQuantiteAction() {
        return quantiteAction;
    }

    
}
