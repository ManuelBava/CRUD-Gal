/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.gal;

/**
 *
 * @author Federico
 */
public class ConfermaEvent implements Event{

    private boolean stato_conferma = false;

    public ConfermaEvent() {
    }

    public boolean isStato_conferma() {
        return stato_conferma;
    }
}
