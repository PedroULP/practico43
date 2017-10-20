/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonia;

/**
 *
 * @author Piedri
 */
public class Fijo extends Telefono {
    
        private String tipoDeLinea;
        
        public Fijo (long numero, String modelo, String marca, String tipoDeLinea){
            super(numero,modelo,marca);
            this.tipoDeLinea = tipoDeLinea;
        }
        
        public boolean llamar(long nroDestino){
        System.out.println("Estoy llamando a "+nroDestino + "Fijo");
        return true;
        }

    public String getTipoDeLinea() {
        return tipoDeLinea;
    }

    public void setTipoDeLinea(String tipoDeLinea) {
        this.tipoDeLinea = tipoDeLinea;
    }
        
        
    
}
