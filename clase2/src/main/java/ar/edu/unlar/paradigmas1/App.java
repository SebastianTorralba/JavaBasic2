package ar.edu.unlar.paradigmas1;

import ar.edu.unlar.paradigmas1.objetos.Alumno;
import ar.edu.unlar.paradigmas1.objetos.Persona;
import ar.edu.unlar.paradigmas1.objetos.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Persona p = new Alumno();
        Alumno a = new Alumno();

        //Cuales son las diferecias de estos objetos a y p
        p.setApellido("Diaz");
        p.setNombre("Claudio");
        p.setDocumentoNumero("43453411");

        a.setApellido("Torres");
        a.setNombre("Juan");
        a.setDocumentoNumero("43431111");
        a.setCursaActualmente(true);
        a.setMatricula("LSI");

        System.out.println(p);
        System.out.println(a);

        Profesor profe = new Profesor();
        profe.setApellido("Lujan");
        profe.setNombre("Adrian");
        profe.setLegajo("1234");
        profe.setDocumentoNumero("30123200");

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(p);
        personas.add(a);
        personas.add(profe);

        for (Persona persona : personas) {
            System.out.println(persona);
            if (persona instanceof Alumno) {
                System.out.println("Es un Alumno");
            }
            System.out.println(persona.getClass().getSimpleName());
        }
        // Ingresar por teclado 5 Alumnos y mostrarlos en pantalla
        Scanner teclado = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        for (int i = 0; i < 5; i++) {
            alumnos.add(
                    cargaAlumno(teclado));
        }
        
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno"+alumno.getNombre());
        }

    }

    public static Alumno cargaAlumno(Scanner teclado) {
        Alumno alumno = new Alumno();
        System.out.println("Ingrese Nombre");
        alumno.setNombre(teclado.next());
        System.out.println("Ingrese Apellido");
        alumno.setApellido(teclado.next());
        System.out.println("Ingrese Documento");
        alumno.setDocumentoNumero(teclado.next());
        System.out.println("Ingrese Libreta");
        alumno.setMatricula(teclado.next());
        System.out.println("Ingrese si cursa actualmente S/N");
        String respuesta = teclado.next();
        while (!respuesta.equals("S")) {
            System.out.println("Ingrese nuevamente");
            respuesta = teclado.next();
        }
        alumno.setCursaActualmente(true);
        return alumno;
    }
}
