package org.bguerra.poointerfaces.imprenta.modelo;

public interface Imprimible {

    final static String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";
    default String imprimir(){
         return "Imprimiendo un valor por defecto";
    }

     static void imprimir(Imprimible imprimible) {
          System.out.println(imprimible.imprimir());
     }
}
