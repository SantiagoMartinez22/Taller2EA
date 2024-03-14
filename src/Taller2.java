import java.util.ArrayList;
import java.util.Scanner;

public class Taller2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de personas (N): ");
        int N = scanner.nextInt();
        System.out.print("Ingrese el número de estaciones base (M): ");
        int M = scanner.nextInt();

        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Estacion> estaciones = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            personas.add(new Persona(i, new Punto2D(Math.random() * 10, Math.random() * 10)));
        }

        for (int j = 0; j < M; j++) {
            estaciones.add(new Estacion(j, new Punto2D(Math.random() * 10, Math.random() * 10)));
        }
        Biblioteca.asignarEstaciones(personas, estaciones);
        //Prueba de que se esten creando bien las personas y las estaciones
        for (Persona p:personas
             ) {
            System.out.println(p.toString());

        }
        for (Estacion e:estaciones
             ) {
            System.out.println(e.toString());
        }
        double prueba1=Biblioteca.medirTiempo(personas,estaciones,10);
        System.out.println(prueba1);


}}
