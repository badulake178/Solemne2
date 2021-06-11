/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import clases.Abarrotes;

public class Prueba {
   public static void main(String[] args){
       Abarrotes PapasFritas = new Abarrotes("Snack",1000,1234,"papas fritas");
       PapasFritas.ValidarCodigo(1234);
       PapasFritas.ValidarCodigo(1000);
       
   }
}
