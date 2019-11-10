

import java.util.Iterator;

public class Par<K, V> {

    private K key;
    private V value;

    public Par(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Par() {
    }

    public K getKey() { return key; }
    public V getValue() { return value; }

    @Override
    public String toString() {
        return  "(" + key + "," + value + ")";
    }
}