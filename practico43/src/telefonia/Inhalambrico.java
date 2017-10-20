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
public class Inhalambrico extends Telefono{
    private int canal;
    private double alcance;
    
    //Constructor
    public Inhalambrico(long numero,String modelo,String marca,int canal,double alcance){
        super(numero,modelo,marca);
        this.canal=canal;
        this.alcance=alcance;
    }

    /**
     * @return the canal
     */
    public int getCanal() {
        return canal;
    }

    /**
     * @param canal the canal to set
     */
    public void setCanal(int canal) {
        this.canal = canal;
    }

    /**
     * @return the alcance
     */
    public double getAlcance() {
        return alcance;
    }

    /**
     * @param alcance the alcance to set
     */
    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public boolean llamar(long nroDestino){
        System.out.println("Estoy llamando a "+nroDestino + "Inhalambrico");
        return true;
    }
    
        
}
