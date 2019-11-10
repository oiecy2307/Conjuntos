import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
        Conjunto<Integer> c1 = new Conjunto<>();
        c1.elementos.add(1);
        c1.elementos.add(2);
        c1.elementos.add(3);
        Integer[] plata = {1,2,3,4,5,6,7,23};
        Integer[] vic = {1,2,3,4,5,6,7};
        Integer[] osc = {1,3,5,10,11,12,13,15};
        Conjunto<Integer> enteros = new Conjunto(vic);
        Conjunto<Integer> enteros1 = new Conjunto(plata);
        System.out.println(c1.toString());
        System.out.println(enteros.toString());
        Conjunto<Integer> enterosOscar = new Conjunto(osc);
        Conjunto<Integer> unionOscarVic = enteros.union(enterosOscar);
        System.out.println(unionOscarVic.toString());
        if (unionOscarVic.subset(enteros1)) {
            System.out.println("El conjunto si pertenece");
        } else {
            System.out.println("El conjunto no pertenece");
        }
        Integer[] subset1 = {1,2,3,4,5,6,7,23};
        Integer[] subset2 = {1,2,3,4,5,6,7};
        Conjunto<Integer> conjB = new Conjunto(subset1);
        Conjunto<Integer> conjA = new Conjunto(subset2);
        if (conjB.subsetP(conjA)) {
            System.out.println("El conjunto A es subconjunto de B");
        } else {
            System.out.println("El conjunto A no es subconjunto de B");
        }
        Conjunto<Integer> complemento = conjA.complement(conjB);
        System.out.println(complemento.toString());
        Integer[] subset3 = {1,2,3,4,5,6,7};
        String[] subset4 = {"Oscar","Plata","Misael"};
        Conjunto<Integer> conjC = new Conjunto(subset3);
        Conjunto<String> conjD = new Conjunto(subset4);
        Conjunto<Par<Integer, String>> parConjunto = conjC.productC(conjD);
        System.out.println(parConjunto.toString());
        System.out.println(parConjunto.size());
        Integer[] subset5 = {1,2,3};
        Conjunto<String> conjp = new Conjunto(subset4);
        //conjp.powerSet(conjp);
        Conjunto<String> conjpower = new Conjunto();
        
       
        
        System.out.println(conjpower.pow(conjp).toString());
      
    }
	
	
}
