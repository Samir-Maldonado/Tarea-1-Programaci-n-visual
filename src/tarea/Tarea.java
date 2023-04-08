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
public class Tarea {
    public static void main(String[] args) {
        // Crear objetos de Empleado
        Empleado empleado1 = new Empleado("Samir Maldonado", 30, 2500.0, 2);
        Empleado empleado2 = new Empleado("Alexander Ricci", 25, 3500.0, 0);

        // Mostrar datos de empleado1
        System.out.println("Datos del Empleado 1:");
        empleado1.mostrarDatos();

        // Mostrar datos de empleado2
        System.out.println("Datos del Empleado 2:");
        empleado2.mostrarDatos();
        
        //calcular y mostrar el auxilio educativo
        double auxilio = empleado1.calcularAuxilioEducativo();
        System.out.println("Auxilio educativo para " + empleado1.getNombre() + ": $" + auxilio);
        
        //diferencia salarial entre 2 empleados
        double diferenciasalarial =  empleado1.calcularDiferenciaSalarial(empleado2);
        System.out.println("la diferencia salarial entre " + empleado1.getNombre() + " y " + empleado2.getNombre() + " es de: $" + diferenciasalarial);
        
    }
}

