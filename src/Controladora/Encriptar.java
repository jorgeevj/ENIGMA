/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladora;

import entidades.clavijero;
import entidades.disco;
import entidades.reflector;

/**
 *
 * @author Jorge
 */
public class Encriptar {
    private disco I;
    private disco II;
    private disco III;
    
    private clavijero c;
    private reflector r;
    String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public char encriptacion(String letra){
        char ida,vuelta;
        
        ida=obtenerLetra(calculaPaseClavijero(III.getPosicionActual(), obtenerPosicion(c.recibirLetraIda(letra))));
        ida=III.recibirLetraDiscoExterno(ida);
        ida=obtenerLetra(calculaPaseClavijero(II.getPosicionActual(),calculaPaseClavijero1(III.getPosicionActual(), obtenerPosicion(ida))));
        ida=II.recibirLetraDiscoExterno(ida);
        ida=obtenerLetra(calculaPaseClavijero(I.getPosicionActual(),calculaPaseClavijero1(II.getPosicionActual(), obtenerPosicion(ida))));
        ida=I.recibirLetraDiscoExterno(ida);
        ida=obtenerLetra(calculaPaseClavijero1(I.getPosicionActual(),obtenerPosicion(ida)));
        vuelta=r.recibirLetraIda(ida);
        vuelta=obtenerLetra(calculaPaseClavijero(I.getPosicionActual(),obtenerPosicion(vuelta)));
        vuelta=I.recibirLetraDiscoInterno(vuelta);
        vuelta=obtenerLetra(calculaPaseClavijero(II.getPosicionActual(),calculaPaseClavijero1(I.getPosicionActual(), obtenerPosicion(vuelta))));
        vuelta=II.recibirLetraDiscoInterno(vuelta);
        vuelta=obtenerLetra(calculaPaseClavijero(III.getPosicionActual(),calculaPaseClavijero1(II.getPosicionActual(), obtenerPosicion(vuelta))));
        vuelta=III.recibirLetraDiscoInterno(vuelta);
        vuelta=obtenerLetra(calculaPaseClavijero1(III.getPosicionActual(), obtenerPosicion(vuelta)));
        vuelta=c.recibirLetraVuelta(vuelta);
        return vuelta;
    }
    
    private int calculaPaseClavijero(int actual,int posicion){
    if(actual+posicion>25){
    return actual+posicion-26;
    }else{
    return posicion+actual;
    }
    }
     private int calculaPaseClavijero1(int actual,int posicion){
    if(actual>posicion){
    return 26-actual+posicion;
    }else{
    return posicion-actual;
    }
    }
    
    private int obtenerPosicion(char letra) {
        for (int i = 0; i < abecedario.length(); i++) {
            if (abecedario.charAt(i) == letra) {
                return i;
            }
        }
        return 1;
    }

    private char obtenerLetra(int indice) {
        for (int i = 0; i < abecedario.length(); i++) {
            if (i == indice) {
                return abecedario.charAt(indice) ;
            }
        }
        return 'A';
    }
    public disco getI() {
        return I;
    }

    public void setI(disco I) {
        this.I = I;
    }

    public disco getII() {
        return II;
    }

    public void setII(disco II) {
        this.II = II;
    }

    public disco getIII() {
        return III;
    }

    public void setIII(disco III) {
        this.III = III;
    }

    public clavijero getC() {
        return c;
    }

    public void setC(clavijero c) {
        this.c = c;
    }

    public reflector getR() {
        return r;
    }

    public void setR(reflector r) {
        this.r = r;
    }
    
    
}
