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
public class AlmacendeDonas 
{
    private Dona [] almacen;
    
    private FabricadeDonas fabrica;
    
    private int numerodedonasguardadas;

    public Dona[] getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Dona[] almacen) {
        this.almacen = almacen;
    }
    
    public  void surtir(int n, int tipo, String sabor, float precio)
    {
        for (int i = 0; i < n; i++) 
        {
            almacen[numerodedonasguardadas] = fabrica.crearDona(tipo, sabor, precio);
            numerodedonasguardadas++;
        }
    }
    
   public int cuantasdonashay()
   {
       System.out.println("hay almacenadas " + numerodedonasguardadas);
       
       return numerodedonasguardadas;
   }
    
   public void inicializaalmacen()
   {
       almacen = new Dona[5000];
       fabrica = new FabricadeDonas();
       numerodedonasguardadas = 0;
   }
   
    public static void main(String[] args) {
        AlmacendeDonas store;
        store = new AlmacendeDonas();
        
        store.inicializaalmacen();
        
        store.surtir(15, 1, "fresa", 14);
        
        store.surtir(10, 2, "cajeta", 12);
        
        store.surtir(5, 3, "frambuesa", 12);
        
        store.cuantasdonashay();
        
        for (int i = 0; i < store.cuantasdonashay() ; i++) 
        {
            store.getAlmacen()[i].printdona();
        }
    }
    
    
}
