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
public class disco {
    private String nombre;
    private String discoInterno;
    private String discoExterno;
    private int posicionActual;
    private int posicionInicial;
    private String muesca;
    private int avanze;

    public disco(String nombre, String discoInterno, String muesca) {
        this.nombre = nombre;
        this.discoInterno = discoInterno;
        this.muesca = muesca;
        discoExterno="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }

    
    
    public disco() {
      discoExterno="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }

    public char recibirLetraDiscoExterno(char letra) {
        for (int i = 0; i < discoExterno.length(); i++) {
            if (discoExterno.charAt(i) == letra) {
                return discoInterno.charAt(i);
            }
        }
        return letra;
    }

    public char recibirLetraDiscoInterno(char letra) {
        for (int i = 0; i < discoInterno.length(); i++) {
            if (discoInterno.charAt(i) == letra) {
                return discoExterno.charAt(i);
            }
        }
        return letra;
    }

    public String getDiscoInterno() {
        return discoInterno;
    }

    public void setDiscoInterno(String discoInterno) {
        this.discoInterno = discoInterno;
    }

    public String getDiscoExterno() {
        return discoExterno;
    }

    public void setDiscoExterno(String discoExterno) {
        this.discoExterno = discoExterno;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionInicial() {
        return posicionInicial;
    }

    public void setPosicionInicial(int posicionInicial) {
        this.posicionInicial = posicionInicial;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMuesca() {
        return muesca;
    }

    public void setMuesca(String muesca) {
        this.muesca = muesca;
    }

    public int getAvanze() {
        return avanze;
    }

    public void setAvanze(int avanze) {
        this.avanze = avanze;
    }
}
