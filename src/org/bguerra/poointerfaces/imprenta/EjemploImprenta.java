package org.bguerra.poointerfaces.imprenta;

import org.bguerra.poointerfaces.imprenta.modelo.*;

import static org.bguerra.poointerfaces.imprenta.modelo.Genero.*;
import static org.bguerra.poointerfaces.imprenta.modelo.Imprimible.imprimir;


public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("Brian", "Guerra"), "Ing.Tic´s", "Resumen laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollaor FullStack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de siseños: Elem. Reusables POO", PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"), new Persona("James", "Bones"), "Estudio sobre microservicios");

        //imprimir(cv);
        //imprimir(informe);
        //imprimir(libro);

        //Imprimible.imprimir(cv);
        //Imprimible.imprimir(informe);
        //Imprimible.imprimir(libro);

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        Imprimible objImp = new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto generico de una clase anonima";
            }
        };
        imprimir(objImp);

        System.out.println(Imprimible.TEXTO_DEFECTO);
    }

    /*public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }*/
}