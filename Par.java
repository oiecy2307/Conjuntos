/*
Maestria en ciencias de las computacion
Tecnologias de programacion
Agosto-Diciembre 2019
Tutor@: Dra. Lucia Barron Estrada
Alumno: Oscar Eliut Sandoval Alfaro 
*/

import java.util.Iterator;


//Clase par utilizada para la creacion de pares ordenados del producto cartesiano
public class Par<K, V> {

    private K key;
    private V value;

    public Par(K key, V value) {
        this.key = key;
        this.value = value;
    }


    public K getKey() { return key; }
    public V getValue() { return value; }

    @Override
    public String toString() {
        return  "(" + key + "," + value + ")";
    }
}