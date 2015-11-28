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
public class reflector {
  private String inputIda;
  private String imputRegreso;

    public reflector() {
        inputIda="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        imputRegreso="YRUHQSLDPXNGOKMIEBFZCWVJAT";
    }
    
    public char recibirLetraIda(char letra) {
        for (int i = 0; i < inputIda.length(); i++) {
            if (inputIda.charAt(i) == letra) {
                return imputRegreso.charAt(i);
            }
        }
        return letra;
    }

    public char recibirLetraVuelta(String letra) {
        for (int i = 0; i < imputRegreso.length(); i++) {
            if (imputRegreso.charAt(i) == letra.charAt(0)) {
                return inputIda.charAt(i);
            }
        }
        return letra.charAt(0);
    }
    
    public String getInputIda() {
        return inputIda;
    }

    public void setInputIda(String inputIda) {
        this.inputIda = inputIda;
    }

    public String getImputRegreso() {
        return imputRegreso;
    }

    public void setImputRegreso(String imputRegreso) {
        this.imputRegreso = imputRegreso;
    }
  
}
