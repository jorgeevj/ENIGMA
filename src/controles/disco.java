/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

/**
 *
 * @author Jorge
 */
public class disco {
  private String discoInterno;
  private String discoExterno;
  private int posicionActual;
  private int posicionInicial;

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
}
