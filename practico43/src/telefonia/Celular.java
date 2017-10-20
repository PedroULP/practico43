/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonia;

/**
 *
 * @author claudio
 */
public class Celular extends Telefono{
    private String empresa;
    
    //Constructor
    public Celular(long numero,String modelo,String marca,String empresa){
        super(numero,marca,modelo);
        this.empresa=empresa;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    public boolean enviarMensaje(long nroDestino,String mensaje){
        System.out.println("Enviando Mensaje: "+mensaje+" // Destino: "+nroDestino);
        return true;
    }
    
    public boolean llamar(long nroDestino){
        System.out.println("Llamando a "+nroDestino+" desde Celular");
        return true;
    }
}
