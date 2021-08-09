package clase2;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Clase2 {

    public static void main(String[] args) {

        ArrayList<String> listaCompras = new ArrayList<>();
        //agregar elementos al  ArrayList usando add simple o con indice

        listaCompras.add("Queso");
        listaCompras.add("Gaseosa");
        listaCompras.add("Tortilla");
        listaCompras.add(1, "Crema");

        // eliminar elementos 
        listaCompras.remove(0);
        listaCompras.remove("Gaseosa");
        // listaCompras.clear();

        //modificar elementos con el valor de indice y el nuevo nombre
        listaCompras.set(0, "Pan dulce");
        // buscar elementos en la lista

        boolean res = listaCompras.contains("Pan dulce");
        System.out.println("encontrado: " + res);

        //loggitud de lista
        int size = listaCompras.size();
        System.out.println("la cantidad de elementos es: " + size);

        //leer elementos de un lista con for simple
        for (int i = 0; i < size; i++) {

            System.out.println("elementos:" + listaCompras.get(i));

        }
        //forech for estendido
        for (String elemento : listaCompras) {

            System.out.println("Producto: " + elemento);
            JOptionPane.showMessageDialog(null, elemento);
        }

        Iterator it = listaCompras.iterator();

        while (it.hasNext()) {
            System.out.println("Iterator: " + it.next());

        }
        
    }

}
