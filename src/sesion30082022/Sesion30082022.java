package sesion30082022;

import java.util.ArrayList;

public class Sesion30082022 {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> listado = new ArrayList<>();
        listado.add("Luis");
        listado.add("Martha");
        listado.add("Hortencia");
        
        //metodo 1
        //ArrayList<String> copia = new ArrayList<>();
        //copia = listado;
        
        //metodo 2
        //ArrayList<String> copia = new ArrayList<>(listado);

        //metodo 3
        ArrayList<String> copia = (ArrayList<String>) listado.clone();
        
        System.out.println("Listado:");
        for(String nombre: listado) {
            System.out.println(nombre);
        }
        
        System.out.println("Copia:");
        for(String nombre: copia) {
            System.out.println(nombre);
        }
        
        /* imprimir con for
        
        for(int i = 0; i < listado.size(); i++) {
            System.out.println(listado.get(i).toString());
        }
        */
        
        //remove uno de listado (original)
        listado.remove("Hortencia");
        
        System.out.println("Despues de eliminar en Listado...");
        
        //listado.remove(0);
        
        //listado.removeAll(listado);
        
        for(String nombre: listado) {
             System.out.println(nombre);
        }
        
        //remove todos los de copia
        copia.removeAll(copia);
        
        System.out.println("Despues de eliminar en Copia...");
        for(String nombre: copia) {
             System.out.println(nombre);
        }
        
        
        
    }
    
}
