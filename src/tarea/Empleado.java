/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author SAMIR
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private int numeroDeHijos; // Nuevo atributo para el número de hijos del empleado

    // Constructor
    public Empleado(String nombre, int edad, double salario, int numeroDeHijos) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.numeroDeHijos = numeroDeHijos;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroDeHijos() {
        return numeroDeHijos;
    }

    public void setNumeroDeHijos(int numeroDeHijos) {
        this.numeroDeHijos = numeroDeHijos;
    }
    
    public double calcularAuxilioEducativo(){
        double auxilio = salario * 0.05 * numeroDeHijos;
        return auxilio;
    }
    
    public double calcularDiferenciaSalarial(Empleado otroempleado){
        double diferencia = this.salario - otroempleado.getSalario();
        return diferencia;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("salario: " + salario);
        System.out.println("numero de hijos: " + numeroDeHijos);
        
    }
}

