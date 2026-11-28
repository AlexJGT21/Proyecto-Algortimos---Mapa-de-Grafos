/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author le0jx
 */
public class Ciudad {
    private Ciudades nombre;
    List<Carretera> carreteras;

    /**
     * constructor vacio de ciudad/nodo
     */
    public Ciudad() {
    }

    /**
     * constructor con nombre de la ciudad/nodo
     * @param nombre nombre de la ciudad
     */
    public Ciudad(Ciudades nombre) {
        this.nombre = nombre;
    }

    /**
     * constructor con parametros de la ciudad/nodo
     * @param nombre nombre de la ciudad
     * @param carreteras carreteras que nacen de la ciudad
     */
    public Ciudad(Ciudades nombre, List<Carretera> carreteras) {
        this.nombre = nombre;
        this.carreteras = carreteras;
    }

    /**
     * get del nombre de la ciudad
     * @return el nombre de la ciudad
     */
    public Ciudades getNombre() {
        return nombre;
    }

    /**
     * set del nombre de la ciudad
     * @param nombre el nombre de la ciudad
     */
    public void setNombre(Ciudades nombre) {
        this.nombre = nombre;
    }

    /**
     * get de la lista de carreteras que nacen de la ciudad
     * @return la lista de carreteras de la ciudad
     */
    public List<Carretera> getCarreteras() {
        return carreteras;
    }

    /**
     * set de la lista de carreteras que nacen de la ciudad
     * @param carreteras carreteras de la ciudad
     */
    public void setCarreteras(List<Carretera> carreteras) {
        this.carreteras = carreteras;
    }
    
    /**
     * añadir una carretera a la lista de carreteras que nacen de la ciudad
     * @param carretera carretera a añadir
     */
    public void añadirCarretera(Carretera carretera){
        carreteras = new ArrayList<>();
            carreteras.add(carretera);
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", carreteras=" + carreteras + '}';
    }
    
}
