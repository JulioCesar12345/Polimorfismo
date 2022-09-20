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
public class Pato extends Animal{
    
       @Override
       public void comunicar(){
        System.out.println("Quack quack!");//polimorfismo de sobrecaga e sobreposição
    }
}
