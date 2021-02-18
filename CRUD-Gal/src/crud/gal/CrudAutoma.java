/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.gal;

/**
 *
 * @author manue
 */
public class CrudAutoma implements State {

    private State stato;
    private Automabile ui;

    public CrudAutoma(Automabile ui) {
        this.ui = ui;
    }

    @Override
    public void next(Event e) {
        stato.next(e);
    }

    public class Ricerca implements State {

        public Ricerca() {
        }

        @Override
        public void next(Event e) {

        }

    }

    private class Aggiungi implements State {

        public Aggiungi() {
        }

        @Override
        public void next(Event e) {

        }

    }

    private class Visualizza implements State {

        public Visualizza() {
        }

        @Override
        public void next(Event e) {

        }

    }

    private class Modifica implements State {

        public Modifica() {
        }

        @Override
        public void next(Event e) {
        }

    }

    private class Rimuovi implements State {

        public Rimuovi() {
        }

        @Override
        public void next(Event e) {

        }

    }

}
