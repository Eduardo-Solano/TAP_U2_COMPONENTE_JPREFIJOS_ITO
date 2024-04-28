/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefijovisual;

/**
 *
 * @author Edward
 */
public class Pais {
    String nombre;
    String lada;
    public Pais(String nom, String lad){
        nombre=nom;
        lada=lad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLada() {
        return lada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLada(String lada) {
        this.lada = lada;
    }
    
    @Override public String toString(){
        return nombre+" "+lada;
    }
    
}
