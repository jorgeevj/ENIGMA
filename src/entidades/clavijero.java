/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Jorge
 */
public class clavijero {

    
    private String ida;
    private String vuelta;

    public clavijero(String vuelta) {
        ida="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.vuelta = vuelta;
        
    }
    
    public char recibirLetraIda(String letra) {
        for (int i = 0; i < ida.length(); i++) {
            if (ida.charAt(i) == letra.charAt(0)) {
                return vuelta.charAt(i);
            }
        }
        return letra.charAt(0);
    }

    public char recibirLetraVuelta(char letra) {
        for (int i = 0; i < vuelta.length(); i++) {
            if (vuelta.charAt(i) == letra) {
                return ida.charAt(i);
            }
        }
        return letra;
    }
    
    public String getIda() {
        return ida;
    }

    public void setIda(String ida) {
        this.ida = ida;
    }

    public String getVuelta() {
        return vuelta;
    }

    public void setVuelta(String vuelta) {
        this.vuelta = vuelta;
    }
    
}
