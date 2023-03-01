package aplicacion;
import dominio.Matematicas;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        int[]listaInt={1,2,3,4,5,6,7,8,9,10};
        List<String> lista=new ArrayList<>();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Alber");
        lista.add("JAVA");
        lista.add("ProgrAmacion");
        lista.add("FuNcioNal");
        lista.add("AleJandro");
        lista.add("Almeria");
        List<Integer> lista2=new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);
        lista2.add(9);
        lista2.add(10);

        double media=Matematicas.media(listaInt);
        double alcuadrado= Matematicas.alcuadrado(listaInt);
        double varianza=(alcuadrado/listaInt.length)-media*media;
        double desviaciontipica=Math.sqrt(varianza);
        System.out.println("Los cuadrados de los elementos de la lista son: "+Matematicas.cuadrados(listaInt));
        System.out.println("La suma de los elementos de la lista es: "+Matematicas.suma(listaInt));
        System.out.println("La suma de los elementos pares de la lista es: "+Matematicas.sumaPares(listaInt));
        System.out.println("La lista de los elementos pares de la lista es: "+Matematicas.listaPares(listaInt));
        System.out.println("La media de los elementos de la lista es: "+media);
        System.out.println("La desviacion tipica de los elementos de la lista es: "+desviaciontipica);
        System.out.println("El elemento menor de la lista es: "+Matematicas.menor(listaInt));
        System.out.println("La lista de elementos en minusculas es: "+Matematicas.aMinusculas(lista));
        System.out.println("La concatenacion de los elementos de la lista es: "+Matematicas.concatenarCadenas(lista));
        System.out.println("La lista de elementos en minusculas es: "+Matematicas.transformarAMinusculas(lista));
        System.out.println("La lista de elementos que no empiezan por A es: "+Matematicas.noEmpiezaPorA(lista));
    }
}
