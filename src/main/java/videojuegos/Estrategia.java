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
public class Estrategia {
    private String accion;
    private String lucha;
    private String nombreaccion;
    private String nombrelucha;
    private int precioaccion;
    private int preciolucha;
    private String dlcaccion;
    private String dlclucha;

    public String getDlcaccion() {
        return dlcaccion;
    }

    public void setDlcaccion(String dlcaccion) {
        this.dlcaccion = dlcaccion;
    }

    public String getDlclucha() {
        return dlclucha;
    }

    public void setDlclucha(String dlclucha) {
        this.dlclucha = dlclucha;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getLucha() {
        return lucha;
    }

    public void setLucha(String lucha) {
        this.lucha = lucha;
    }

    public String getNombreaccion() {
        return nombreaccion;
    }

    public void setNombreaccion(String nombreaccion) {
        this.nombreaccion = nombreaccion;
    }

    public String getNombrelucha() {
        return nombrelucha;
    }

    public void setNombrelucha(String nombrelucha) {
        this.nombrelucha = nombrelucha;
    }

    public int getPrecioaccion() {
        return precioaccion;
    }

    public void setPrecioaccion(int precioaccion) {
        this.precioaccion = precioaccion;
    }

    public int getPreciolucha() {
        return preciolucha;
    }

    public void setPreciolucha(int preciolucha) {
        this.preciolucha = preciolucha;
    }

    
    
    private void printcaracteristicasdejuego()
    {
        System.out.println("soy un videojuego de: " + accion + " mi nombre es: " + nombreaccion + " y mi precio es de: " + precioaccion + "mi DLC es: " + dlcaccion);
        System.out.println("soy un videojuego de: " + lucha + " mi nombre es" + nombrelucha + " y mi precio es de: " + preciolucha + "mi DLC es: " + dlclucha);
    }
    
    
}
