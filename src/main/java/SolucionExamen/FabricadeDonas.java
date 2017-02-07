/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen;

/**
 *
 * @author Alumno
 */
public class FabricadeDonas {
    
    private Dona d;
    
    public Dona crearDona(int tipo, String sabos, float precio)
    {
        d = new Dona();
        
        d.setTipodedona(tipo);
        d.setPreciodona(precio);
        d.setSabor(sabos);
        
        amasar();
        mesclaringredientes();
        hornear();
        
        return d;
    }

    private void amasar()
    {
        System.out.println("amasamdo dona de " + d.getTipodedona() );
    }

    private void mesclaringredientes() 
    {
        System.out.println("mesclando ingredientes de " + d.getSabor());
    }

    private void hornear() 
    {
        System.out.println("Horneando la dona");
    }
    
    public Dona[] empaquetar(int n, int tipo, String sabor, float precio)
    {
        Dona [] paquete;
        paquete = new Dona[n];
        
        for (int i = 0; i < n; i++) 
        {
            paquete[i] = crearDona(tipo, sabor, precio);
        }
         System.out.println("el precio total sera de" + n*precio);
        
        return paquete;
    }
    
    public static void main(String[] args) {
        FabricadeDonas Factory;
        Factory = new FabricadeDonas();
        
        Factory.empaquetar(6, 1, "frambuesa", 12);
        
    }
            
    
}
