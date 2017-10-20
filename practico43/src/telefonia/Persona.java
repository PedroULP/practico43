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
public class Persona {
    
        private long dni;
        private String nombre;
        
        
        public Persona(long dni, String nombre){
            this.dni = dni;
            this.nombre = nombre;
        }
        
        public void llamarMensajear (Telefono telefono, long nroDestino, String mensaje)
        {
            if (telefono instanceof Celular)
            {
                Celular c1 = (Celular) telefono;
                c1.enviarMensaje(nroDestino,mensaje);
            }
            else 
            {
                System.out.println("Solo los celulares pueden enviar mensajes");
            }
        }
        
        public void llamarMensajear (Telefono telefono, long nroDestino)
        {
            telefono.llamar(nroDestino);
        }
    
}
