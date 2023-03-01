package dominio;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
public class Matematicas {
    public static ArrayList cuadrados(int[]listaInt){
        return Stream.iterate(0,x->x+1).limit(listaInt.length).map(x->listaInt[x]*listaInt[x]).collect(Collectors.toCollection(ArrayList::new));
    }
    public static int suma(int [] listaInt){
        return Stream.iterate(0,x->x+1).limit(listaInt.length).map(x->listaInt[x]).reduce(0,(x,y)->x+y);
    }
    public static int sumaPares(int[] listaInt){
        return Stream.iterate(0,x->x+1).limit(listaInt.length).map(x->listaInt[x]).filter(x->x%2==0).reduce(0,(x,y)->x+y);
    }
    public static ArrayList listaPares(int[]listaInt){
        return Stream.iterate(0,x->x+1).limit(listaInt.length).map(x->listaInt[x]).filter(x->x%2==0).collect(Collectors.toCollection(ArrayList::new));
    }
    public static int media (int[]listaInt){
        return Stream.iterate(0,i->i+1).limit(listaInt.length).map(i->listaInt[i]).reduce(0,(x,y)->(x+y))/listaInt.length;
    }
    public static double alcuadrado(int[]listaInt){
        return Stream.iterate(0,x->x+1).limit(listaInt.length).map(n->listaInt[n]).reduce(0,(x,y)->x+y*y);
    }
    public static int menor(int[]listaInt){
        return Stream.iterate(0,x->x+1).limit(listaInt.length).map(x->listaInt[x]).min(Integer::compare).get();
    }
    public static List<String> aMinusculas(List<String> lista){
        return Stream.iterate(0,x->x+1).limit(lista.size()).map(x->lista.get(x).toLowerCase()).collect(Collectors.toList());
    }
    public static String concatenarCadenas(List<String> lista){
        return Stream.iterate(0,x->x+1).limit(lista.size()).map(x->lista.get(x)).reduce("",(x,y)->x+y);
    }
    public static List<String> transformarAMinusculas(List<String> lista){
        return Stream.iterate(0,x->x+1).limit(lista.size()).map(x->lista.get(x).toLowerCase()).collect(Collectors.toCollection(ArrayList:: new));
    }
    public static List<String> noEmpiezaPorA(List<String> lista){
        return Stream.iterate(0,x->x+1).limit(lista.size()).map(x->lista.get(x)).filter(x->!x.startsWith("A")).collect(Collectors.toCollection(ArrayList ::new));
    }
    public static List<Integer> por2MayorQue6(List<Integer> lista2){
        return Stream.iterate(0,x->x+1).limit(lista2.size()).map(x->lista2.get(x)*2).filter(x->x>6).collect(Collectors.toCollection(ArrayList ::new));
    }

}
