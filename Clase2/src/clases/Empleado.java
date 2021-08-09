/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author aarismendi
 */
public class Empleado {
    
    private String codigo;
    private String nombre;
    private double sueldo;
    private char genero;
    private String cargo;
    private ArrayList<String> interes;

    public Empleado() {
    }

    public Empleado(String codigo, String nombre, double sueldo, char genero, String cargo, ArrayList<String> interes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.genero = genero;
        this.cargo = cargo;
        this.interes = interes;
    }

    public ArrayList<String> getInteres() {
        return interes;
    }

    public void setInteres(ArrayList<String> interes) {
        this.interes = interes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
}
