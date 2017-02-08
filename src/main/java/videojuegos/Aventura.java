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
public class Aventura {
    private String plataforma;
    private String grafica;
    private String nombreplataforma;
    private String nombregrafica;
    private int precioplataforma;
    private int preciografica;
    private String dlcplataforma;
    private String dlcgrafica;

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public String getNombreplataforma() {
        return nombreplataforma;
    }

    public void setNombreplataforma(String nombreplataforma) {
        this.nombreplataforma = nombreplataforma;
    }

    public String getNombregrafica() {
        return nombregrafica;
    }

    public void setNombregrafica(String nombregrafica) {
        this.nombregrafica = nombregrafica;
    }

    public int getPrecioplataforma() {
        return precioplataforma;
    }

    public void setPrecioplataforma(int precioplataforma) {
        this.precioplataforma = precioplataforma;
    }

    public int getPreciografica() {
        return preciografica;
    }

    public void setPreciografica(int preciografica) {
        this.preciografica = preciografica;
    }

    public String getDlcplataforma() {
        return dlcplataforma;
    }

    public void setDlcplataforma(String dlcplataforma) {
        this.dlcplataforma = dlcplataforma;
    }

    public String getDlcgrafica() {
        return dlcgrafica;
    }

    public void setDlcgrafica(String dlcgrafica) {
        this.dlcgrafica = dlcgrafica;
    }
    
    private void printcaracteristicasaventura()
    {
        System.out.println("soy un videojuego de: " + plataforma + " mi nombre es: " + nombreplataforma + " mi precio es: " + precioplataforma + " mi DLC es: " + precioplataforma );
        System.out.println("soy un videojuego de: " + grafica + " mi nombre es: " + nombregrafica + " mi precio es de: " + preciografica + " mi DLC es : " + dlcgrafica);
    }
}
