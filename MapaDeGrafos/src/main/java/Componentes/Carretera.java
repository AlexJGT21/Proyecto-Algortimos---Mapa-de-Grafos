/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author le0jx
 */
public class Carretera {

    private Ciudad origen, destino;
    private int costo;

    /**
     * constructor vacio de carretera/arista
     */
    public Carretera() {
    }

    /**
     * constructor con parametros de carretera/arista
     * @param origen desde donde comienza la carretera
     * @param destino hasta donde llega la carretera
     * @param costo cuanto cuesta la carretera
     */
    public Carretera(Ciudad origen, Ciudad destino, int costo) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
    }

    /**
     * get del origen de la carretera
     * @return el origen de la carretera
     */
    public Ciudad getOrigen() {
        return origen;
    }

    /**
     * set del origen de la carretera
     * @param origen el origen de la carretera
     */
    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    /**
     * get del destino de la carretera
     * @return destino de la carretera
     */
    public Ciudad getDestino() {
        return destino;
    }

    /**
     * set del destino de la carretera
     * @param destino destino de la carretera
     */
    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    /**
     * get del costo de la carretera
     * @return csoto de la carretera
     */
    public float getCosto() {
        return costo;
    }

    /**
     * set del costo de la carretera
     * @param costo 
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * toString de la carretera
     * @return datos de la carretera
     */
    @Override
    public String toString() {
        return "Carretera{" + "origen=" + origen.getNombre() + ", destino=" + destino.getNombre() + ", costo=" + costo + '}';
    }
}
