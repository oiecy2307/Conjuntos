/*
Maestria en ciencias de las computacion
Tecnologias de programacion
Agosto-Diciembre 2019
Tutor@: Dra. Lucia Barron Estrada
Alumno: Oscar Eliut Sandoval Alfaro 
*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

//Metodo main donde se realizan las pruebas.
public class Main {
	public static void main(String[] args) {
      /*  Conjunto<Integer> c1 = new Conjunto<>();
        c1.conjunto.add(1);
        c1.conjunto.add(2);
        c1.conjunto.add(3);
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
        
       
        
        System.out.println(conjpower.pow(conjp).toString());*/
		
		
		String[] strings1 = new String[]{"A", "AB", "B"};
        Conjunto<String> set1 = new Conjunto<String>(strings1);

        Collection<String> strings2 = new ArrayList<>();
        strings2.add("A");
        strings2.add("AB");
        strings2.add("C");
        strings2.add("CD");
        strings2.add("D");
        strings2.add("E");
        Conjunto<String> set2 = new Conjunto<>(strings2);

        Conjunto<String> set3 = new Conjunto<>();
        set3.add("CD");
        set3.add("D");

        Conjunto<String> set4 = new Conjunto<>();
        set4.add("A");
        set4.add("AB");
        set4.add("B");
        set4.add("C");
        set4.add("CD");
        set4.add("D");
        set4.add("E");
        set4.add("F");
        set4.add("FG");
        set4.add("G");
        set4.add("H");

        set1.print("set1");
        set2.print("set2");
        set3.print("set3");
        set4.print("Universo String");

        System.out.println("+++++++++++++++++++++++++++");
        System.out.println();

        System.out.println("+++Int Sets+++");

        Conjunto<Integer> set5 = new Conjunto<>();
        set5.add(1);
        set5.add(2);
        set5.add(4);

        Conjunto<Integer> set6 = new Conjunto<>();
        set6.add(3);
        set6.add(5);
        set6.add(8);

        Conjunto<Integer> set7 = new Conjunto<>();

        for (int i = 0; i <= 20; i++) {
            set7.add(i);
        }

        set5.print("set5");
        set6.print("set6");
        set7.print("Universe Int");

        System.out.println("+++++++++++++++++++++++++++");
        System.out.println();

        String A = "A";
        String BC = "BC";
        System.out.println("\"A\" set2 : " + set2.containsC(A));
        System.out.println("\"BC\" set2 : " + set2.containsC(BC));
        System.out.println("|set2| : " + set2.size());

        set2.union(set1).print("set2 ⋃ set1");
        set2.intersection(set1).print("set2 ⋂ set1");
        set2.difference(set1).print("set2 - set1");

        Integer[] ents1 = new Integer[]{1, 2, 3};
        Conjunto<Integer> setents = new Conjunto<>(ents1);

      
        setents.pow().print("setents pow");
       
        Integer []  arr = {1,2,3,3,3};
        String [] ar2 = {"Oscar", "Victor", "Plata"};
        
        Conjunto<Integer> enteros = new Conjunto<Integer>(arr);
        Conjunto<String> cadenas = new Conjunto<String>(ar2);
        
        Conjunto y = enteros.union(cadenas);
        
        System.out.println(y.toString());
        //Conjunto a 
       
       
        Persona p1 = new Persona("Oscar","Sandoval","1234567890");
		Persona p2 = new Persona("Eduardo","Huerta","1234567890");
		Persona p3 = new Persona("Daniel","Leyva","1234567890");
		Persona p4 = new Persona("Rafael","Zavala","1234567890");
		Persona p5 = new Persona("Victor","Batiz","1234567890");
		Persona p6 = new Persona("Saul","Palazuelos","1234567890");
		
		p1.addFamilia(p2);
		p2.addFamilia(p3);
		p3.addFamilia(p1);
		p4.addFamilia(p5);
		
		Persona[] people = {p1,p2,p3,p4,p5};
		Persona[] gente = {p4,p5,p6};
		
		Conjunto<Persona> peopleSet = new Conjunto<Persona>( people );
		Conjunto<Persona> genteSet = new Conjunto<Persona>(gente);
        
		Conjunto x = peopleSet.union(genteSet);
		
		System.out.println(x.toString()); 
		
		Integer [] i1 = {1,2,3};
		Integer [] i2 = {5,7,9};
		Integer [] i3 = {1};
		
		Conjunto <Integer> c1 = new Conjunto<>(i1);
		Conjunto <Integer> c2 = new Conjunto<>(i2);
		Conjunto <Integer> c3 = new Conjunto<>(i3);
		Conjunto [] i4 = {c1, c2 , c3};
		
		Conjunto <Conjunto> c4 = new Conjunto<>(i4);   
		System.out.println("C4: " + c4.toString());
		
		System.out.println("C4 contains C3: "+ c4.containsC(c3));
		
		
		 
		c1 = c1.difference(c3);
		System.out.println("C1: " + c1.toString()); 
		
		Conjunto clonado =  y.DeepClone();
		
		System.out.println("y: " +y.pow());
		
		System.out.println("Clonado: "+ y.toString());
		
		//c1.conjunto = null;
		System.out.println("c1: "+ c1.toString());
		
    }
	
	
}
