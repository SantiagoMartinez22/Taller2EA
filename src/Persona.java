public class Persona {
    private int id;
    private Punto2D ubicacion;
    private Estacion estacionAsociada;


    public Persona(int id, Punto2D ubicacion){
        this.id=id;
        this.ubicacion=ubicacion;
        this.estacionAsociada=null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Punto2D getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Punto2D ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Estacion getEstacionAsociada() {
        return estacionAsociada;
    }

    public void setEstacionAsociada(Estacion estacionAsociada) {
        this.estacionAsociada = estacionAsociada;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", ubicacion=" + ubicacion +
                ", estacionAsociada=" + estacionAsociada +
                '}';
    }
}
