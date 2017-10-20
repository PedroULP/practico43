/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico43;

import telefonia.*;

/**
 *
 * @author claudio
 */
public class Test {
    public static void main(String [] args){
        Persona pers=new Persona(33222444,"Pepito");
        Celular cel=new Celular(22333444,"J2","Samsung","Movistar");
        pers.llamarMensajear(cel, 22221231);
        pers.llamarMensajear(cel, 21312434, "Hola mundo");
    }
}
