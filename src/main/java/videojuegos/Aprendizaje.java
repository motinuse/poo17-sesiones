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
public class Aprendizaje {
    private String idiomas;
    private String musica;
    private String nombreidiomas;
    private String nombremusica;
    private int precioidiomas;
    private int preciomusica;
    private String dlcidiomas;
    private String dlcmusica;

    public String getDlcidiomas() {
        return dlcidiomas;
    }

    public void setDlcidiomas(String dlcidiomas) {
        this.dlcidiomas = dlcidiomas;
    }

    public String getDlcmusica() {
        return dlcmusica;
    }

    public void setDlcmusica(String dlcmusica) {
        this.dlcmusica = dlcmusica;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getNombreidiomas() {
        return nombreidiomas;
    }

    public void setNombreidiomas(String nombreidiomas) {
        this.nombreidiomas = nombreidiomas;
    }

    public String getNombremusica() {
        return nombremusica;
    }

    public void setNombremusica(String nombremusica) {
        this.nombremusica = nombremusica;
    }

    public int getPrecioidiomas() {
        return precioidiomas;
    }

    public void setPrecioidiomas(int precioidiomas) {
        this.precioidiomas = precioidiomas;
    }

    public int getPreciomusica() {
        return preciomusica;
    }

    public void setPreciomusica(int preciomusica) {
        this.preciomusica = preciomusica;
    }

   
     
    private void printcaracteristicavideojuegoaprendizaje()
     {
         System.out.println("soy un videojuego de:" +idiomas + " mi nombre es: " + nombreidiomas + " y  mi precio es de: " + precioidiomas + " mi DLC es: " + dlcidiomas);
         System.out.println("soy un videojuego de: " + musica + " mi nombre es: " + nombremusica + " y  mi precio es de: " + preciomusica + "mi DLC es: " + dlcmusica);
     }
}
