/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;


public class ListaProductos {
    
    String nombre;
    int  cantidad, precio, codigo;

    public ListaProductos(String nombre, int cantidad, int precio, int codigo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //METODO PARA SACAR EL PRECIO TOTAL
    public void ValorCantidad(int precio, int cantidad){
        
        int vc = precio*cantidad;
        cantidad=vc;
        
              
    }
    
    
    
    
   
    
}
