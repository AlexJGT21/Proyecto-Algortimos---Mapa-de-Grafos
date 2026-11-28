/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author le0jx
 */
public class Mapa {
    List<Ciudad> ciudades;
    List<Carretera> carreteras;
    private Random random = new Random();

    /**
     * constructor vacio del mapa/grafo que inicializa las ciudades y carreteras
     * @param minimo valor minimo de carreteras que parten de una ciudad a otra
     * @param maximo valor maximo de carreteras que parten de una ciudad a otra
     */
    public Mapa(int minimo, int maximo) {
        inicializadorCiudades();
        inicializadorCarreteras(minimo, maximo);
        CarreterasDeCiudades();
//        imprimirMapa();
    }

    /**
     * get de la lista de ciudades del mapa
     * @return lista de ciudades
     */
    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    /**
     * set de la lista de ciudades del mapa
     * @param ciudades lista de ciudades
     */
    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    /**
     * get de la lista de carreteras del mapa
     * @return carreteras del mapa
     */
    public List<Carretera> getCarreteras() {
        return carreteras;
    }

    /**
     * set de la lista de carreteras del mapa
     * @param carreteras carreteras del mapa
     */
    public void setCarreteras(List<Carretera> carreteras) {
        this.carreteras = carreteras;
    }
    
    /**
     * inicializa y llena la lista de ciudades
     */
    public void inicializadorCiudades(){
        ciudades = new ArrayList<>();
        ciudades.add(new Ciudad(Ciudades.ACONCHI));
        ciudades.add(new Ciudad(Ciudades.AGUA_PRIETA));
        ciudades.add(new Ciudad(Ciudades.ALAMOS));
        ciudades.add(new Ciudad(Ciudades.ALTAR));
        ciudades.add(new Ciudad(Ciudades.ARIVECHI));
        ciudades.add(new Ciudad(Ciudades.ARIZPE));
        ciudades.add(new Ciudad(Ciudades.ATIL));
        ciudades.add(new Ciudad(Ciudades.BACADEHUACHI));
        ciudades.add(new Ciudad(Ciudades.BACANORA));
        ciudades.add(new Ciudad(Ciudades.BACERAC));
        ciudades.add(new Ciudad(Ciudades.BACOACHI));
        ciudades.add(new Ciudad(Ciudades.BACUM));
        ciudades.add(new Ciudad(Ciudades.BANAMICHI));
        ciudades.add(new Ciudad(Ciudades.BAVIACORA));
        ciudades.add(new Ciudad(Ciudades.BAVISPE));
        ciudades.add(new Ciudad(Ciudades.BENITO_JUAREZ));
        ciudades.add(new Ciudad(Ciudades.BENJAMIN_HILL));
        ciudades.add(new Ciudad(Ciudades.CABORCA));
        ciudades.add(new Ciudad(Ciudades.CAJEME));
        ciudades.add(new Ciudad(Ciudades.CANANEA));
        ciudades.add(new Ciudad(Ciudades.CARBO));
        ciudades.add(new Ciudad(Ciudades.CUCURPE));
        ciudades.add(new Ciudad(Ciudades.CUMPAS));
        ciudades.add(new Ciudad(Ciudades.DIVISADEROS));
        ciudades.add(new Ciudad(Ciudades.EMPALME));
        ciudades.add(new Ciudad(Ciudades.ETCHOJOA));
        ciudades.add(new Ciudad(Ciudades.FRONTERAS));
        ciudades.add(new Ciudad(Ciudades.GENERAL_PLUTARCO_ELIAS_CALLES));
        ciudades.add(new Ciudad(Ciudades.GRANADOS));
        ciudades.add(new Ciudad(Ciudades.GUAYMAS));
        ciudades.add(new Ciudad(Ciudades.HERMOSILLO));
        ciudades.add(new Ciudad(Ciudades.HUACHINERA));
        ciudades.add(new Ciudad(Ciudades.HUASABAS));
        ciudades.add(new Ciudad(Ciudades.HUATABAMPO));
        ciudades.add(new Ciudad(Ciudades.HUEPAC));
        ciudades.add(new Ciudad(Ciudades.IMURIS));
        ciudades.add(new Ciudad(Ciudades.LA_COLORADA));
        ciudades.add(new Ciudad(Ciudades.MAGDALENA));
        ciudades.add(new Ciudad(Ciudades.MAZATAN));
        ciudades.add(new Ciudad(Ciudades.MOCTEZUMA));
        ciudades.add(new Ciudad(Ciudades.NACO));
        ciudades.add(new Ciudad(Ciudades.NACORI_CHICO));
        ciudades.add(new Ciudad(Ciudades.NACOZARI_DE_GARCIA));
        ciudades.add(new Ciudad(Ciudades.NAVOJOA));
        ciudades.add(new Ciudad(Ciudades.NOGALES));
        ciudades.add(new Ciudad(Ciudades.ONAVAS));
        ciudades.add(new Ciudad(Ciudades.OPODEPE));
        ciudades.add(new Ciudad(Ciudades.OQUITOA));
        ciudades.add(new Ciudad(Ciudades.PITIQUITO));
        ciudades.add(new Ciudad(Ciudades.PUERTO_PENASCO));
        ciudades.add(new Ciudad(Ciudades.QUIRIEGO));
        ciudades.add(new Ciudad(Ciudades.RAYON));
        ciudades.add(new Ciudad(Ciudades.ROSARIO));
        ciudades.add(new Ciudad(Ciudades.SAHUARIPA));
        ciudades.add(new Ciudad(Ciudades.SAN_FELIPE_DE_JESUS));
        ciudades.add(new Ciudad(Ciudades.SAN_IGNACIO_RIO_MUERTO));
        ciudades.add(new Ciudad(Ciudades.SAN_JAVIER));
        ciudades.add(new Ciudad(Ciudades.SAN_LUIS_RIO_COLORADO));
        ciudades.add(new Ciudad(Ciudades.SAN_MIGUEL_DE_HORCASITAS));
        ciudades.add(new Ciudad(Ciudades.SAN_PEDRO_DE_LA_CUEVA));
        ciudades.add(new Ciudad(Ciudades.SANTA_ANA));
        ciudades.add(new Ciudad(Ciudades.SANTA_CRUZ));
        ciudades.add(new Ciudad(Ciudades.SARIC));
        ciudades.add(new Ciudad(Ciudades.SOYOPA));
        ciudades.add(new Ciudad(Ciudades.SUAQUI_GRANDE));
        ciudades.add(new Ciudad(Ciudades.TEPACHE));
        ciudades.add(new Ciudad(Ciudades.TRINCHERAS));
        ciudades.add(new Ciudad(Ciudades.TUBUTAMA));
        ciudades.add(new Ciudad(Ciudades.URES));
        ciudades.add(new Ciudad(Ciudades.VILLA_HIDALGO));
        ciudades.add(new Ciudad(Ciudades.VILLA_PESQUEIRA));
        ciudades.add(new Ciudad(Ciudades.YECORA));
    }
    
    /**
     * inicializa y llena la lista de carreteras asignando un valor random de -1000 a 1000 a una carretera al azar
     * @param minimo cantidadad minima de carreteras que nacen de la ciudad
     * @param maximo cantidad maxima de carreteras que nacen de la ciudad
     */
    public void inicializadorCarreteras(int minimo, int maximo){
        
        carreteras = new ArrayList<>();
        int numCiudades = ciudades.size();
        for(int i = 0; i < numCiudades; i++){
            int cantidad = random.nextInt(minimo,(maximo+1));
            for(int j = 0; j < cantidad; j++){
                int costo = random.nextInt(-1000, 1001);
                carreteras.add(new Carretera(ciudades.get(i), ciudades.get(random.nextInt(numCiudades)), costo));
            }   
        }
        limpezaCarreteras();
    }
    
    /**
     * funcion para imprimir la lista de carreteras y sus datos para conocer el mapa
     */
    public void imprimirMapa(){
        System.out.println("--------------------ciudades: " + ciudades.size()+"-------------------");
        for(int i = 0; i < ciudades.size(); i++){
            System.out.println(ciudades.get(i));
        }
        System.out.println("--------------------carreteras: " + carreteras.size()+"-------------------");
        for(int i = 0; i < carreteras.size(); i++){
            System.out.println(carreteras.get(i));
        }
    }
    
    /**
     * funcion que recorre la lista de carreteras para eliminar las carreteras que tengan de origen y destino la misma ciudad
     */
    public void limpezaCarreteras(){
        //las partes comentareadas son solo para impresion para verificar que funciona, pueden eliminarlas si quieren :)
        int carreterasLimpiadas = 0;
        int numAntes = carreteras.size();
        List<Carretera> listaLimpia = new ArrayList<>();
        for(int i = 0; i < carreteras.size(); i++){
            if(carreteras.get(i).getOrigen().getNombre() != carreteras.get(i).getDestino().getNombre()){
                listaLimpia.add(carreteras.get(i));
            }
            else{carreterasLimpiadas++;}
        }
        carreteras = listaLimpia;
//        System.out.println("de: "+ numAntes+" carreteras se limpiaron: " + carreterasLimpiadas + " dejando: " + carreteras.size() + " carreteras");
    }
    
    /**
     * añade las carreteras que nacen de una ciudad a la lista de dicha ciudad
     */
    public void CarreterasDeCiudades(){
    for(int i = 0; i < carreteras.size(); i++){
            for(int j = 0; j < ciudades.size(); j++){
                if(carreteras.get(i).getOrigen().getNombre() == ciudades.get(j).getNombre()){
//                    System.out.println("se añadira la carretera: " + carreteras.get(i) + " en la lista de la ciudad" + ciudades.get(j));
                    ciudades.get(j).añadirCarretera(carreteras.get(i));
                }
            }
        }
    }
}
