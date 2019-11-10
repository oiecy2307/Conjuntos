import java.util.*;

public class Conjunto<T>{
    public Set<T> elementos;


    public Conjunto() {
        this.elementos = new HashSet<T>();
    }

    public Conjunto(T[] elementos) {
        this.elementos = new HashSet<T>();
        this.elementos.addAll(Arrays.asList(elementos));
    }
    public Conjunto(Collection<T> elementos) {
        this.elementos = new HashSet<T>();
        this.elementos.addAll(elementos);
    }

    public Conjunto<T> union(Conjunto<T> b) {
        Conjunto<T> aux = new Conjunto<>(this.elementos);
        aux.elementos.addAll(b.elementos);
        return aux;
    }

    public Conjunto<T> interseccion(Conjunto<T> b) {
        Conjunto<T> aux = new Conjunto<>(this.elementos);
        aux.elementos.retainAll(b.elementos);
        return aux;
    }

    public Conjunto<T> diferencia(Conjunto<T> b) {
        Conjunto<T> aux = new Conjunto<>(this.elementos);
        aux.elementos.removeAll(b.elementos);
        return aux;
    }

    public boolean contains(Conjunto<T> b) {
        Conjunto<T> aux = new Conjunto<>(this.elementos);
        return aux.elementos.contains(b.elementos);
    }

    public boolean subset(Conjunto<T> b){
        Conjunto<T> aux = new Conjunto<>(this.elementos);
        return aux.elementos.containsAll(b.elementos);
    }

    public boolean subsetP(Conjunto<T> b){
        boolean subset;
        Conjunto<T> aux = new Conjunto<>(this.elementos);
        if (aux.elementos.containsAll(b.elementos) && (aux.size() != b.size())) {
            subset = true;
        } else {
            subset = false;
        }
        return subset;
    }

    public Conjunto<T> complement(Conjunto<T> b){
        Conjunto<T> aux = new Conjunto<>(this.elementos);
        b.elementos.removeAll(aux.elementos);
        return b;
    }


    
    
    public <T> Set<Set<T>> powerSet(Conjunto<T> originalSet) { 
        Set<Set<T>> sets = new HashSet<Set<T>>(); 
        if (originalSet.isEmpty()) { 
         sets.add(new HashSet<T>()); 
         return sets; 
        } 
        List<T> list = new ArrayList<T>(originalSet.elementos); 
        T head = list.get(0); 
        Conjunto <T> rest = new Conjunto<>();
        rest.elementos = new HashSet<T>(list.subList(1, list.size())); 
        for (Set<T> set : powerSet(rest)) { 
         Set<T> newSet = new HashSet<T>(); 
         newSet.add(head); 
         newSet.addAll(set); 
         sets.add(newSet); 
         sets.add(set); 
        }  
        return sets; 
    } 
    
    public Conjunto<T> pow(Conjunto<T> myset){
    Conjunto<T> aux = new Conjunto<>();
    for (Set<T> s : powerSet(myset)) { 
    	aux.elementos.add((T) s);
    	 
    } 
    //System.out.println(conjpower.toString());
	return aux;
   
    }

    public boolean equals(Conjunto<T> b){
        Conjunto<T> aux = new Conjunto<>(this.elementos);
        return aux.elementos.containsAll(b.elementos) && b.elementos.containsAll(aux.elementos);
    }


    public <E> Conjunto<Par<T,E>> productC(Conjunto<E> b){
        Conjunto<T> a = new Conjunto<>(this.elementos);
        Conjunto<Par<T,E>> aux2 = new Conjunto<Par<T,E>>();
        Par<T,E> par;
        for (T element : a.elementos) {
            for (E element2 : b.elementos) {
                par = new Par<T,E>(element,element2);
                aux2.elementos.add(par);
            }
        }
        return aux2;
    }

    public int size() {
        return this.elementos.size();
    }

    public boolean isEmpty(){
        return this.elementos.isEmpty();
    }


    @Override
    public String toString() {
        String s = "{";
        Iterator<T> itElementos = elementos.iterator();
        while(itElementos.hasNext())
        {
            T i = itElementos.next();
            s = s + " {" + i + "}, ";
        }
        return s + "}";
    }
}