/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Abarrotes extends Categoria{
    
    String tipo;
   
    //CONSTRUCTORES

    public Abarrotes(String tipo, int precio, int codigo, String descripcion) {
        super(precio, codigo, descripcion);
        this.tipo = tipo;
    }

    

    //GET AND SET

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    

    //TO STRING
    @Override
    public String toString() {
        return super.toString()+ "Abarrotes{" + ", tipo=" + tipo + '}';
    }
    
  
    //METODOS DE LA CLASE
    @Override
    public void ValidarPrecio(int precio) {
        String validar;
        if(precio>0){
           validar= "Precio valido";
           System.out.println(validar);
        }else{
           validar= "Precio no valido";
           System.out.println(validar);
        }
        
    }

    @Override
    public void ValidarCodigo(int codigo) {
        String validar;
         if(codigo>999 && codigo<10000){
            validar= "codigo valido";
             System.out.println(validar);
        }else{
            validar="codigo no valido";
             System.out.println(validar);
        }
       
    }
   
    
    

}
