/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiones;

/**
 *
 * @author Alumno
 */
public class arregloAlumnos {
   // Aqui defino atributos(fields o class variables)
    private String[]alumnos;
    private int contador;
    
    
    public void inicializararreglo(int size)
    {
        alumnos = new String[size];
        contador = 0;
    }
    
    public void agregarnombre(String nombre)
    {
        alumnos[contador] = nombre;
        //contador ++
        contador = contador + 1;
    }
    
    public void imprimirarreglo()
    {
        for (int i = 0; i < contador; i++) {
            System.out.println("nombre: " +(i + 1) +  alumnos[i]);
        }
        
    }
    public static void main(String[] args){
        //declaro una variable de tipo arreglos
        arregloAlumnos alumnosUdla;
        //reservo espacios para instancia
        alumnosUdla = new arregloAlumnos();
        
        alumnosUdla.inicializararreglo(10);
        alumnosUdla.agregarnombre("Pedro");
        alumnosUdla.agregarnombre("Rodrigo");
        alumnosUdla.agregarnombre("Pepe");
        alumnosUdla.imprimirarreglo();
    }
}

