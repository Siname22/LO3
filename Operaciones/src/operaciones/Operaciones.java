/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 * Version 1.0
 * @author Raul Mendez POblete
 */
public class Operaciones {


/**
 * Te suma dos enteros y te muestra el resultado (si es impar te suma uno y si 
 * es par no) 
 * @param a int 
 * @param b int
 * @return resultado
 *          int a + int b
 */
    public int sumarPar(int a, int b) {
        int resultado = a + b;
        if(resultado%2==0){
            return resultado + 1;
        }else{
            return resultado;
        }
    }
/**
 * Compara dos enteros y te muestra el mayor de esos dos numeros. En el caso de 
 * que sean iguales te muestra uno de ellos
 * @param a int
 * @param b int
 * @return int (el mayor)
 */
    public int mayor(int a, int b) {
        if(a>b){
            return a;
        }else{
            return a;
        }
    }
/**
 * Sumas un array de numeros enteros y te devuelve el resultado
 * @param numeros [] int
 * @return sum
 *          numeros[i]
 */
   
    public int sumarVector(int [] numeros) {
        int sum=0;
        for (int i = 0; i < numeros.length; i++) {
            sum+=numeros[0];
        }
        return sum;
    }
    
}
    
