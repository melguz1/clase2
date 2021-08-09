/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author aarismendi
 */
public class Resta extends Operacion{

    public Resta() {
    }

    public Resta(double numero1, double numero2) {
        super(numero1, numero2);
    }
    public double Restar(){
        return getNumero1() - getNumero2();
    }

   
 
}
