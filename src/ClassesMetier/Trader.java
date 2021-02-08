/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class Trader
{
    private int idTrader;
    private String nomTrader;
    private ArrayList<Action>mesActions;
    public Trader (int un_id, String unNom)
           
           
   {
        idTrader = un_id;
        nomTrader = unNom;
        mesActions = new ArrayList<Action>();
   }

    public int getIdTrader() {
        return idTrader;
    }

    public String getNomTrader() {
        return nomTrader;
    }

    public ArrayList<Action> getMesActions() {
        return mesActions;
    }

    public void setIdTrader(int idTrader) {
        this.idTrader = idTrader;
    }

    public void setNomTrader(String nomTrader) {
        this.nomTrader = nomTrader;
    }

    public void setMesActions(ArrayList<Action> mesActions) {
        this.mesActions = mesActions;
    }
    
    
}
