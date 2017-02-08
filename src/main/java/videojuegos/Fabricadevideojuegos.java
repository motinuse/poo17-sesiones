/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos;

/**
 *
 * @author Alumno
 */
public class Fabricadevideojuegos {
    
    private Estrategia e;
    private Aprendizaje a;
    private Aventura v;
    
    
    public void concepcion ()
    {
        System.out.println("creando la idea del juego yay");
    }
    
    public void diseño ()
    {
        System.out.println("Diseñando juego");
        
    }
    
    public void planificacion ()
    {
        System.out.println("ideando estrategia de venta");
    }
    
    public void produccion ()
    {
        System.out.println("produciendo en masa");
    }
    
    public void pruebasdeaceptacion ()
    {
        System.out.println("Ah pasado las pruebas de aceptacion");
    }
    
    public void creacionvideojuego (string tipo, String nombre, int precio, String dlc)
    {
        
    }
    
    public static void main(String[] args) {
        Fabricadevideojuegos f;
        
        f.crecion("aventura");
        
    }
}
