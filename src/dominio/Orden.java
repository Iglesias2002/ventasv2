package dominio;

import dominio.Producto;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Orden {
    private int id0rden; 
    private ArrayList <Producto> productos;
    static int contador0rdenes; 
    static final int MAX_PRODUCTOS = 10;

   /*  public Orden(int id0rden,  int contador0rdenes) {
       this.id0rden = id0rden;
       
        this.contador0rdenes = contador0rdenes
        ArrayList <Producto> productos1=new ArrayList<>();
        this.productos=productos1;
    };*/

    public Orden() {
        contador0rdenes++;
        this.id0rden=contador0rdenes;
        ArrayList <Producto> productos1=new ArrayList<>();
        this.productos=productos1;
    }
    
    public void agregarUnProducto(Producto producto ){
       
        this.productos.add(producto); 
      
    }
    public double calcularTotal(){
        double total=0;
        for (int i = 0; i < productos.size(); i++) {
            total=total+(this.productos.get(i).getPrecio());
        } 
        System.out.println(" TOTAL DE LA COMPRA ="+total);
    return total;
    }
    public void mostrarOrden(ArrayList<Producto>arrayList){
        PrintWriter salida = null;
        File archivo = new File ("stock");
       
        try {
            salida = new PrintWriter(archivo);
            for (int i = 0; i < productos.size(); i++) {
                salida.println(productos.get(i).toString());
                System.out.println(productos.get(i).toString());
            }
            System.out.println("se a creado en el txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            salida.close();
        }  
    }
       public void encripado(ArrayList<Producto>arrayList){
        PrintWriter salida = null;
        File archivo = new File ("encripado");
       
        try {
            salida = new PrintWriter(archivo);
            for (int i = 0; i < productos.size(); i++) {
                salida.println(productos.get(i).getIdProducto()+"$"+productos.get(i).getPrecio()+"$");
            }
            System.out.println("se a creado en el txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            salida.close();
        }  
    }
    public static int getMAX_PRODUCTOS() {
        return MAX_PRODUCTOS;
    }   
}
