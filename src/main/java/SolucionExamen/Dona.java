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
public class Dona {
    private  int tipodedona;
    private float preciodona;
    private String sabor;

    public int getTipodedona() {
        return tipodedona;
    }

    public void setTipodedona(int tipodedona) {
        this.tipodedona = tipodedona;
    }

    public float getPreciodona() {
        return preciodona;
    }

    public void setPreciodona(float preciodona) {
        this.preciodona = preciodona;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    public void printdona()
    {
        System.out.println("soy una dona de tipo " + tipodedona);
        System.out.println("Soy una dona de sabor " + sabor);
        System.out.println("Mi precio es " + preciodona);
    }
}
