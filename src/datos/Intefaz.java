/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Miguel1
 */
public interface Intefaz {
        public void crear(String NOMBRE);
        public void ecribirArchivo(String NOMBRE,String CONTENIDO);
        public void leerarchivo(String NOMBRE);
        public void borrarArchivo(String NOMBRE);

}
