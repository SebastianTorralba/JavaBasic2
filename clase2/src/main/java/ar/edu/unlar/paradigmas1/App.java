package ar.edu.unlar.paradigmas1;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Persona p = new Alumno();
        p.setApellido("Torralba");
        p.setNombre("Sebastian");
        // Declarando a como Alumno e Casteando Persona ->Alumno;
        Alumno a = (Alumno) p;
        a.setMatricula("LSI1123");
        a.setCursaActualmente(true);
        System.out.println(p);
        // System.out.println(a.getMatricula());
        int notas[] = { 6, 5, 6, 7, 8, 2 };
        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota");
            System.out.println(notas[i]);
        }
        ArrayList<Integer> notasList = new ArrayList();
        notasList.add(6);
        notasList.add(7);
        notasList.add(8);
        notasList.add(10);
        notasList.remove(2);
        for (Integer a : notasList) {
            System.out.println(a);
        }
        int a = 1;
        Integer n = 1;
        a = 2;

    }
}
