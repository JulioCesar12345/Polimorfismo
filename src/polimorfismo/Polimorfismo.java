/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author julio.gabardo
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Calculadora calc = new Calculadora();
        //System.out.println(calc.somar(7, 2));//mudar metodo da sobrecarga,e digitar os valores diferentes. 
        
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Pato pato = new Pato();
        
        gato.comunicar();
        cachorro.comunicar();
        pato.comunicar();
    }
    
}
