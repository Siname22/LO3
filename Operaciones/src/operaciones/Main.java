/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author CES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        
        //prueba sumarPar:
        /*int resultado = operaciones.sumarPar(4,6);    
        System.out.println(resultado);
        */
        //prueba mayor:
        /*
        int resultado2 = operaciones.mayor(0,4);    
        System.out.println(resultado2);
        */
        //prueba sumarVector:
        int[] vector = {1,2,3,4,5};
        int resultado3 = operaciones.sumarVector(vector);    
        System.out.println(resultado3);
        
    }
    
}