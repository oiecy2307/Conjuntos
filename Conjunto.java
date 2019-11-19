/*
Maestria en ciencias de las computacion
Tecnologias de programacion
Agosto-Diciembre 2019
Tutor@: Dra. Lucia Barron Estrada
Alumno: Oscar Eliut Sandoval Alfaro 
*/
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang3.SerializationUtils;


public class Conjunto<T> implements Serializable{
    private Set<T> conjunto;


    public Conjunto() {
        this.conjunto = new HashSet<T>();
    }

    public Conjunto(T[] elementos) {
        this.conjunto = new HashSet<T>();
        this.conjunto.addAll(Arrays.asList(elementos));
    }
    
    public Conjunto(Collection<T> elementos) {
        this.conjunto = new HashSet<T>();
        this.conjunto.addAll(elementos);
    }
    
    //1. Representación String del conjunto (toString)
    @Override
    public String toString() {
    	
    	List<T> list = new ArrayList<T>(this.conjunto);
    	
        String s = "{" + list.get(0);
        list.remove(0);
        
        for(T set : list) {
        
        	s = s + ", " + set.toString();
        }
        
        return s + "}";
    }
    
    //2. Tamaño del conjunto (size)
    public int size() {
        return this.conjunto.size();
    }

    //3. Conjunto vacío es un conjunto sin elementos (empty)
    public boolean empty(){
        return this.conjunto.isEmpty();
    }
    
    //4. Pertenencia (de un elemento en un conjunto) (contains)
    public boolean  containsC(T b) {
        //Conjunto aux = new Conjunto<>(this.conjunto);
        //return aux.conjunto.contains(b.conjunto);
    	return this.conjunto.contains(b);
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conjunto == null) ? 0 : conjunto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conjunto<T> other = (Conjunto<T>) obj;
		if (conjunto == null) {
			if (other.conjunto != null)
				return false;
		} else if (!conjunto.equals(other.conjunto))
			return false;
		return true;
	}

	//5. Unión de conjuntos (union)
    public <E> Conjunto<T> union(Conjunto<E> b) {
        Conjunto aux = new Conjunto<>(this.conjunto);
        aux.conjunto.addAll(b.conjunto);
        return aux;
    }

    //6. Intersección de conjuntos (intersection)
    public Conjunto<T> intersection  (Conjunto<T> b) {
        Conjunto<T> aux = new Conjunto<>(this.conjunto);
        aux.conjunto.retainAll(b.conjunto);
        return aux;
    }
    //7. Diferencia de conjuntos (difference)
    public Conjunto<T> difference(Conjunto<T> b) {
        Conjunto<T> aux = new Conjunto<>(this.conjunto);
        aux.conjunto.removeAll(b.conjunto);
        return aux;
    }

   
    //8. Subconjunto (subset)
    public boolean subset(Conjunto<T> b){
        Conjunto<T> aux = new Conjunto<>(this.conjunto);
        return aux.conjunto.containsAll(b.conjunto);
    }
    
    
    //9. Subconjunto propio (subsetP)
    public boolean subsetP(Conjunto<T> b){
        boolean subset;
        Conjunto<T> aux = new Conjunto<>(this.conjunto);
        if (aux.conjunto.containsAll(b.conjunto) && !(b.conjunto.containsAll(aux.conjunto))) {
            subset = true;
        } else {
            subset = false;
        }
        return subset;
    }

    
    //10. Complemento de conjuntos (complement) (considera un universo)
    public Conjunto<T> complement(Conjunto<T> b){
        Conjunto<T> aux = new Conjunto<>(this.conjunto);
        b.conjunto.removeAll(aux.conjunto);
        return b;
    }
    
     
    
    //11. Producto Cartesiano (productC)
    public <E> Conjunto<Par<T,E>> productC(Conjunto<E> b){
        Conjunto<T> a = new Conjunto<>(this.conjunto);
        Conjunto<Par<T,E>> aux2 = new Conjunto<Par<T,E>>();
        Par<T,E> par;
        for (T element : a.conjunto) {
            for (E element2 : b.conjunto) {
                par = new Par<T,E>(element,element2);
                aux2.conjunto.add(par);
            }
        }
        return aux2;
    }


    
    
  
    
    //12. Potencia de un conjunto (pow)
    public Conjunto<T> pow(){
    	
    Conjunto<T> myset = new Conjunto(this.conjunto);	
    Conjunto<T> aux = new Conjunto<>();
    Set<Set <T>> s = new HashSet<>();
    		s = powerSet(myset);
    for (Set<T> set : s) { 
    aux.conjunto.add((T) set);
    	 
    } 
    
	return aux;
   
    }
    
    /*Metodo para encontrar el conjunto potencia partiendo el conjunto desde el primer elemento para despues tomar 
      el resto como el nuevo conjunto de manera recursiva.
    */
    public Set<Set<T>> powerSet(Conjunto<T> originalSet) { 
        Set<Set<T>> sets = new HashSet<Set<T>>(); 
        if (originalSet.empty()) { 
         sets.add(new HashSet<T>()); 
         return sets; 
        } 
        
        List<T> list = new ArrayList<T>(originalSet.conjunto); 
       
        T head = list.get(0); 
        Conjunto <T> rest = new Conjunto<>(list.subList(1, list.size()));
        
        for (Set<T> set : powerSet(rest)) { 
         Set<T> newSet = new HashSet<T>(); 
         newSet.add(head); 
         newSet.addAll(set); 
         sets.add(newSet); 
         sets.add(set);
        } 
        

       // System.out.println(sets.toString());
        return sets; 
        
    } 
    
    //13. Igualdad de conjuntos (equals)
    public boolean equalsC(Conjunto<T> b){
        Conjunto<T> aux = new Conjunto<>(this.conjunto);
        return aux.conjunto.containsAll(b.conjunto) && b.conjunto.containsAll(aux.conjunto);
    }

    //Metodo de deep cloning utilizando la libreria commons de apache
    public Conjunto<T> DeepClone (){
    	
    	Conjunto<T>  cloned ; 
    	
    	cloned = (Conjunto<T>)SerializationUtils.clone(this);
    	return cloned;
    }

    //Metodo para representar el conjunto en String
    public void print() {
        System.out.println(this.toString());
    }
  //Metodo para representar el conjunto en String con una descripcion previa.
    public void print(String setName) {
        System.out.println(setName + " : " + this);
    }
    
    public void add(T element) {
    	this.conjunto.add(element);
    }

   
}