package sistemadeventas;

import datos.AccesoDatos;
import dominio.Orden;
import dominio.Producto;
import java.util.ArrayList;
import java.util.Scanner;

public class VenrtasTest {

    public static void agregarCompra(Orden orden , int maximoProductos , double precio , String nombre, int id) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        
        System.out.println("INICIANDO COMPRA");
        System.out.println(" ");

        while (!nombre.equals("0") && maximoProductos != 0) {
            System.out.println(" INTRODUCE EL NOMBRE DEL PRODUCTO ");
            maximoProductos--;
            nombre = teclado.nextLine();
            if (!nombre.equals("0")) {
                do {
                    System.out.println(" INTRODUCE EL PRECIO DE "+ nombre.toUpperCase());
                        precio = teclado1.nextFloat();   
                } while (precio <= 0);
                 do {
                    System.out.println(" INTRODUCE LA ID DE "+ nombre.toUpperCase());
                        id = teclado2.nextInt();   
                } while (id <= 0);
                 orden.agregarUnProducto(new Producto(nombre, precio,id));
            }
        }
    }
    public static void main(String[] args) {
        AccesoDatos accesodatos=new AccesoDatos();
         Scanner teclado = new Scanner(System.in);
        Orden orden = new Orden();
        int maximoProductos = Orden.getMAX_PRODUCTOS();
        String nombre = ""; 
        double precio = 0;
        int id = 0;

        
       /* String continua = "";
       
        int cliente =0;
        String gente = "";
        System.out.println("");
        while (!continua.equals("0") ) {
            if(cliente!=0){
                System.out.println("Siguiente cliente");
            }*/
            agregarCompra(orden , maximoProductos , precio , nombre ,id);
            /*
            cliente++;
            System.out.println("Hay mas gente (SI,NO)");
            gente = teclado.nextLine();
            if(gente.toUpperCase()!="SI"){
                continua="0";
            }
        }*/
        orden.mostrarOrden(null);
        orden.calcularTotal();
        orden.encripado(null);
        //accesodatos.borrarArchivo("stock");
        
         
  
    }
}
