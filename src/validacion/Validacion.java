/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validacion;

/**
 *
 * @author Edward
 */
public class Validacion {

    public boolean vcontra(String n) {
        if (!n.matches("[a-zA-Z]+"))
            return true;
        return false;
    }
    public boolean vnumero(String n){
     int lon=n.length();
     if (lon <10 || lon>10)
         return false;
     return true;
     
    }
    public boolean vnumero2(String n){
        if (n.matches("[0-9]*")){
            return true;
        }else {
            return false;
        }
    }
          
    
}
