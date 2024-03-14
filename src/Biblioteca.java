import java.util.ArrayList;

public class Biblioteca {
    public static void asignarEstaciones(ArrayList<Persona> personas, ArrayList<Estacion> estaciones) {
        for (Persona persona : personas) {
            double distanciaMinima = Double.MAX_VALUE;
            Estacion estacionAsociada = null;

            for (Estacion estacion : estaciones) {
                double distancia = distanciaEntrePuntos(persona.getUbicacion(), estacion.getUbicacion());

                if (distancia < distanciaMinima) {
                    distanciaMinima = distancia;
                    estacionAsociada = estacion;
                }
            }

            persona.setEstacionAsociada(estacionAsociada);
        }
    }

    private static double distanciaEntrePuntos(Punto2D punto1, Punto2D punto2) {
        return Math.sqrt(Math.pow(punto1.getX() - punto2.getX(), 2) + Math.pow(punto1.getY() - punto2.getY(), 2));
    }

    public static double medirTiempo(ArrayList<Persona> personas, ArrayList<Estacion> estaciones, int k) {
        double[] tiempos = new double[k];

        for (int i = 0; i < k; i++) {
            long inicio = System.currentTimeMillis();
            asignarEstaciones(personas, estaciones);
            long fin = System.currentTimeMillis();
            tiempos[i] = (fin - inicio) / 1000.0; // Convertir a segundos
        }

        double tiempoPromedio = calcularPromedio(tiempos);
        return tiempoPromedio;
    }

    private static double calcularPromedio(double[] valores) {
        double suma = 0;
        for (double valor : valores) {
            suma += valor;
        }
        return suma / valores.length;
    }
}
